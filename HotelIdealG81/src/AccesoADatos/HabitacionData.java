package AccesoADatos;

import Entidades.Habitacion;
import Entidades.TipoHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HabitacionData {
    
    private Connection con=null;
    
    
    public HabitacionData() {
        con=Conexion.getConexion();        
    }
    
    public void guardarHabitacion(Habitacion hab){
    String sql = "INSERT INTO habitaciones (nombre, piso, tipoHabitacion, estado ) "
            + "VALUES (?, ?, ?, ?)";
    
    PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, hab.getNombre());
            ps.setInt(2, hab.getPiso());
            ps.setInt(3, hab.getTipoHab());
            ps.setBoolean(4, hab.isActivo());
            
            int filas=ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()){
                hab.setIdHabitacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Habitación guardada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitaciones "+ex);
            System.out.println(ex);
        }
    }
    
    public void modificarHabitacion(Habitacion hab){
        String sql="UPDATE habitaciones SET nombre= ?, piso= ?, tipoHabitacion= ?, estado= ?"
                + "WHERE idHabitacion= ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, hab.getNombre());
            ps.setInt(2, hab.getPiso());
            ps.setInt(3, hab.getTipoHab());
            ps.setBoolean(4, hab.isActivo());
            ps.setInt(5, hab.getIdHabitacion());
            
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Habitación modificada");
            }else if(exito>1){
                JOptionPane.showMessageDialog(null, "Se modificó más de una habitación. Habitaciones modificadas: "+exito);
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitaciones"); 
        }
    }
    
    public void eliminarHabitacion(String nombre){ 
        String sql="UPDATE habitaciones SET estado=0 WHERE nombre= ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Habitación eliminada");
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitaciones"); ;
        }
    }
    
    
    
    public Habitacion buscarHabitacion(String nombre){
        String sql="SELECT idHabitacion, nombre, piso, tipoHabitacion, estado FROM habitaciones WHERE nombre = ? AND estado=1";
        Habitacion hab=null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(nombre));
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                
                hab=new Habitacion();
                hab.setIdHabitacion(rs.getInt(1));
                hab.setNombre(rs.getString("nombre"));
                hab.setPiso(rs.getInt("piso"));
                hab.setTipoHab(rs.getInt("tipoHabitacion"));
                hab.setEstado(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "No existe una habitación asociada al numero ingresado");
            }
            ps.close();
        
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return hab;
    }
    
    public void modificarPrecioHabPorTipo(TipoHabitacion th, double precio){
        String sql="UPDATE habitaciones SET precio= ?"
                + "WHERE tipoHabitacion= ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, precio);
            ps.setInt(2, th.getCodigo());
            
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Precio modificado");
            }else if(exito>1){
                JOptionPane.showMessageDialog(null, "Se modificó más de un precio.");
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitaciones"); 
        }
    }
    
    /*Mostrar Habitaciones clasificadas por Tipo de Habitación, y su estado actual (Libre/Ocupada)*/
    public List<Habitacion> listarHabitaciones(TipoHabitacion th){
        String sql="SELECT * FROM habitaciones WHERE tipoHabitacion= ? ";
        ArrayList<Habitacion> habs=new ArrayList<>();
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                
                Habitacion hab=new Habitacion();
                hab.setIdHabitacion(rs.getInt(1));
                hab.setNombre(rs.getString("nombre"));
                hab.setPiso(rs.getInt("piso"));
                hab.setTipoHab(rs.getInt("tipoHabitacion"));
                hab.setEstado(rs.getBoolean("estado"));
                
                habs.add(hab);
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la tabla");
        }
        return habs;
    }
    
    public List<Habitacion> buscarHabitacionesDisponibles(LocalDate ini, LocalDate fin, int codigoTH){
        String sql = "SELECT idHabitacion, nombre, piso, tipoHabitacion " +
                "FROM habitaciones " +
                "WHERE tipoHabitacion = ? " +
                "AND estado = 1 " +
                "AND idHabitacion NOT IN (" +
                "    SELECT idHabitacion " +
                "    FROM reservas " +
                "    WHERE " +
                "        (inicio <= ? AND fin >= ?) " +
                "        OR (inicio <= ? AND fin >= ?) " +
                "        OR (inicio >= ? AND fin <= ?)" +
                ") ";
        List<Habitacion> habitacionesDisponibles = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigoTH);
            ps.setObject(2, ini);
            ps.setObject(3, fin);
            ps.setObject(4, ini);
            ps.setObject(5, fin);
            ps.setObject(6, ini);
            ps.setObject(7, fin);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion hab = new Habitacion();
                hab.setIdHabitacion(rs.getInt("idHabitacion"));
                hab.setNombre(rs.getString("nombre"));
                hab.setPiso(rs.getInt("piso"));
                hab.setTipoHab(rs.getInt("tipoHabitacion"));
                hab.setEstado(true);

                habitacionesDisponibles.add(hab);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
        return habitacionesDisponibles;
    }


    public Habitacion buscarHabitacionPorNombre(String nombre){
        String sql="SELECT idHabitacion, nombre, piso, tipoHabitacion, estado FROM habitaciones WHERE nombre= ? AND estado=1";
        Habitacion hab=null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                
                hab=new Habitacion();
                hab.setIdHabitacion(rs.getInt(1));
                hab.setNombre(rs.getString("nombre"));
                hab.setPiso(rs.getInt("piso"));
                hab.setTipoHab(rs.getInt("tipoHabitacion"));
                hab.setEstado(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "No existe una habitación asociada al nombre ingresado");
            }
            ps.close();
        
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return hab;
    }




}

