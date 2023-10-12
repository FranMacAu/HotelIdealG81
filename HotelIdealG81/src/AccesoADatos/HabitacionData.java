package AccesoADatos;

import Entidades.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    
    public void eliminarHabitacion(int id){ //sin probar aún
        String sql="UPDATE habitaciones SET estado=0 WHERE idHabitacion= ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Habitación eliminada");
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitaciones"); ;
        }
    }
    
    
    
    
    
    
    
    
}
