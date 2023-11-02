package AccesoADatos;

import Entidades.Habitacion;
import Entidades.TipoHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TipoHabData {
    private Connection con=null;
    
    
    public TipoHabData() {
        con=Conexion.getConexion();        
    }
    
    public void guardarTipoHab(TipoHabitacion tip){
    String sql = "INSERT INTO tipohabitacion (nombre, capacidad, camas, tipoCamas, precio) "
            + "VALUES (?, ?, ?, ?, ?)";
    
        try {
            PreparedStatement ps =con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, tip.getNombre());
            ps.setInt(2, tip.getCapacidad() );
            ps.setInt(3, tip.getCantidadCamas());
            ps.setString(4, tip.getTipoCama());
            ps.setDouble(5, tip.getPrecio());
            
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()){
                tip.setCodigo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Tipo de habitación guardada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla TipoHabitaciones ");
        }
    }
    
    public void eliminarTipoHabitacion (String nombre) { 
    
    String sql = "DELETE FROM tipohabitacion WHERE nombre = ?";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, nombre);
        
        int filasAfectadas = ps.executeUpdate();
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Numero de habitación eliminado con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningúna habitación con el numero proporcionado.");
        }
        
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el numero de habitación: " + ex.getMessage());
    }
}

            
            
            
            
    
    
    
    
    public void cambiarPrecioPorTipo(TipoHabitacion th, double precio){
        String sql = "UPDATE tipohabitacion SET precio= ? WHERE idTipoHab= ?";
        
        try {
            PreparedStatement ps =con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, precio);
            ps.setInt(2, th.getCodigo());
            
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Precio modificado");
            }else if(exito>1){
                JOptionPane.showMessageDialog(null, "Se modificó más de un precio. Registros modificados: "+exito);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el precio");
        }
        
    }
    
    public TipoHabitacion buscarTipoHab(int id){
        String sql="SELECT idTipoHab, nombre, capacidad, camas, tipoCamas, precio FROM tipohabitacion WHERE idTipoHab= ?";
        TipoHabitacion thab=null;
        
            PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                
                thab=new TipoHabitacion();
                thab.setCodigo(rs.getInt(1));
                thab.setNombre(rs.getString("nombre"));
                thab.setCapacidad(rs.getInt("capacidad"));
                thab.setCantidadCamas(rs.getInt("camas"));
                thab.setTipoCama(rs.getString("tipoCamas"));
                thab.setPrecio(rs.getDouble("precio"));
                
            }else{
                JOptionPane.showMessageDialog(null, "No existe una tipo de habitación asociada al código ingresado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla TipoHab");
        }
        
        return thab;
    }
    
    public List<TipoHabitacion> listarTipoHabitaciones(){
        String sql="SELECT * FROM tipohabitacion ";
        ArrayList<TipoHabitacion> thabs=new ArrayList<>();
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                
                TipoHabitacion hab=new TipoHabitacion();
                hab.setCodigo(rs.getInt(1));
                hab.setNombre(rs.getString("nombre"));
                hab.setCapacidad(rs.getInt("capacidad"));
                hab.setCantidadCamas(rs.getInt("camas"));
                hab.setTipoCama(rs.getString("tipoCamas"));
                hab.setPrecio(rs.getDouble("precio"));
                
                thabs.add(hab);
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la tabla"+ex);
            System.out.println(ex);
        }
        return thabs;
    
        
    }
    
    
        public TipoHabitacion buscarPorNombre(String nombre){
            String sql="SELECT idTipoHab, nombre, capacidad, camas, tipoCamas, precio FROM tipohabitacion WHERE nombre= ?";
            TipoHabitacion thab=null;

                PreparedStatement ps;
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, nombre);
                ResultSet rs=ps.executeQuery();
                if (rs.next()){

                    thab=new TipoHabitacion();
                    thab.setCodigo(rs.getInt(1));
                    thab.setNombre(rs.getString("nombre"));
                    thab.setCapacidad(rs.getInt("capacidad"));
                    thab.setCantidadCamas(rs.getInt("camas"));
                    thab.setTipoCama(rs.getString("tipoCamas"));
                    thab.setPrecio(rs.getDouble("precio"));

                }else{
                    JOptionPane.showMessageDialog(null, "No existe una tipo de habitación asociada al código ingresado");
                }
                ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla TipoHab");
            }

            return thab;
        }



    public void modificarTipoHabitacion(TipoHabitacion tip) {
    String sql = "UPDATE tipohabitacion SET nombre = ?, capacidad = ?, camas = ?, tipoCamas = ?, precio = ? WHERE codigo = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tip.getNombre());
        ps.setInt(2, tip.getCapacidad());
        ps.setInt(3, tip.getCantidadCamas());
        ps.setString(4, tip.getTipoCama());
        ps.setDouble(5, tip.getPrecio());
        ps.setInt(6, tip.getCodigo()); // Asumiendo que codigo es el identificador único de la habitación

        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Tipo de habitación modificado");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un tipo de habitación para modificar");
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla TipoHabitaciones");
    }
}

    
    
}
