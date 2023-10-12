
package AccesoADatos;

import Entidades.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ReservaData {
            
    private Connection con=null;
    
    public ReservaData(){
        
        con=Conexion.getConexion();
    }
    
 public void GuardarReserva(Reserva reserva){   
     String sql = "INSERT INTO reserva (idhuesped, idhabitacion, inicio, fin, apagar, pagado, estado)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            
        try {
            PreparedStatement ps =con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, reserva.getIdHuesped());
            ps.setInt(2, reserva.getIdHabitacion());
            ps.setDate(3, Date.valueOf(reserva.getInicio()));
            ps.setDate(4, Date.valueOf(reserva.getFin()));
            ps.setDouble(5, reserva.getaPagar());
            ps.setDouble(6, reserva.getPagado());
            ps.setBoolean(7, reserva.isEstado());
            
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            //System.out.println("Bloque try");
            if (rs.next()){
                reserva.setIdReserva(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Reserva guardado");
                //System.out.println("Bloque if");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de reserva");
            
        }
        //System.out.println("Ejecutado");    
    }

}