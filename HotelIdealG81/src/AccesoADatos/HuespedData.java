
package AccesoADatos;

import Entidades.Huesped;
import java.sql.Connection;
import java.sql.Date;
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
     String sql = "INSERT INTO huesped (nombre, apellido, dni, domicilio, correo, telefono, estado)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            
        try {
            PreparedStatement ps =con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setInt(3, huesped.getDni());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());
            ps.setInt(6, huesped.getTelefono());
            ps.setBoolean(7, huesped.isActivo());
            
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            //System.out.println("Bloque try");
            if (rs.next()){
                huesped.setIdHuesped(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Huesped guardado");
                //System.out.println("Bloque if");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
            
        }
        //System.out.println("Ejecutado");    
    }
    
    public void modificarHuesped(Huesped huesped){
        String sql="UPDATE huesped SET nombre= ?, apellido= ?, dni= ?, domicilio= ?, correo= ?, telefono= ?, estado= ? "
                + "WHERE idHuesped= ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setInt(3, huesped.getDni());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());
            ps.setInt(6, huesped.getTelefono());
            ps.setBoolean(7, huesped.isActivo());
            ps.setInt(8, huesped.getIdHuesped());
            
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Huesped modificado");
            }else if(exito>1){
                JOptionPane.showMessageDialog(null, "Se modificó más de un huésped. Registros modificados: "+exito);
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped "+ex); 
        }
    }
    
    
    public void eliminarHuesped(int id){
        String sql="UPDATE huesped SET estado=0 WHERE idHuesped= ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Huesped eliminado");
            }
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped"); ;
        }
    }
    
        
 public Huesped buscarPordni (int dni) {
    String sql="SELECT idHuesped, nombre, apellido, correo, telefono FROM huesped WHERE dni= ? ";
    Huesped huesped=null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs=ps.getGeneratedKeys();
        
            if(rs.next()) {
                huesped =new Huesped();
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setTelefono(rs.getInt("telefono"));                               
            }else{
                JOptionPane.showMessageDialog(null, "No existe un huesped asociado al dni ingresado");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la tabla");
        }
        return huesped;
    }
        
        
}

    
    
    
    
    
    
    
    
    
    
    
