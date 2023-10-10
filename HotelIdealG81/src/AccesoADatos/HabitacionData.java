package AccesoADatos;

import Entidades.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            ps = con.prepareStatement(sql);
            ps.setString(1, hab.getNombre());
            ps.setInt(2, hab.getPiso());
            ps.setInt(3, hab.getIdHabitacion());
            ps.setBoolean(4, hab.isEstado());
            
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()){
                hab.setIdHabitacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Habitación guardada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitaciones");
        }
    
    
    
    
    }
    
    
    
    
    
}
