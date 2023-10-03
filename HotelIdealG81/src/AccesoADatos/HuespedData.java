
package AccesoADatos;

import Entidades.Huesped;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class HuespedData {
            
    private Connection con=null;
    
    public HuespedData(){
        
        con=Conexion.getConexion();
    }
    
    
    
    public void GuardarHuesped(Huesped huesped){   
     String sql = "INSERT INTO huesped (nombre, apellido, dni, domicilio, correo, telefono)"
                    + "VALUES (?, ?, ?, ?, ?,?)";
            
        try {
            PreparedStatement ps =con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setInt(3, huesped.getDni());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());
            ps.setInt(6, huesped.getTelefono());

            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            //System.out.println("Bloque try");
            if (rs.next()){
                huesped.setHuesped(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Huesped guardado");
                System.out.println("Bloque if");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
            
        }
        System.out.println("Ejecutado");    
    }
    
}