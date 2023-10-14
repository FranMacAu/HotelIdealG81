package AccesoADatos;

import Entidades.Habitacion;
import Entidades.TipoHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tip.getNombre());
            ps.setInt(2, tip.getCapacidad() );
            ps.setInt(3, tip.getCantidadCamas());
            ps.setDouble(4, tip.getPrecio());
            
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()){
                tip.setCodigo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Habitación guardada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitaciones "+ex);
        }
    }
    
    public void cambiarPrecioPorTipo(TipoHabitacion th, double precio){
        String sql = "UPDATE tipohabitacion SET precio= ? WHERE idTipoHab= ?";
        
        PreparedStatement ps;
        try {
            ps=con.prepareStatement(sql);
            ps.setDouble(1, precio);
            ps.setInt(2, th.getCodigo());
            
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()){
                JOptionPane.showMessageDialog(null, "Precio modificado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el precio");
        }
        
    }
    
}
