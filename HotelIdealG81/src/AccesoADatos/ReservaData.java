package AccesoADatos;

import Entidades.Habitacion;
import Entidades.Reserva;
import Entidades.TipoHabitacion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

public class ReservaData {

    private Connection con = null;

    public ReservaData() {

        con = Conexion.getConexion();
    }

    public void GuardarReserva(Reserva reserva) {
        String sql = "INSERT INTO reserva (idhuesped, idhabitacion, inicio, fin, apagar, pagado, estado)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, reserva.getIdHuesped());
                ps.setInt(2, reserva.getIdHabitacion());
                ps.setDate(3, Date.valueOf(reserva.getInicio()));
                ps.setDate(4, Date.valueOf(reserva.getFin()));
                ps.setDouble(5, reserva.getaPagar());
                ps.setDouble(6, reserva.getPagado());
                ps.setBoolean(7, reserva.isEstado());

                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                //System.out.println("Bloque try");
                if (rs.next()) {
                    reserva.setIdReserva(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Reserva guardado");
                    //System.out.println("Bloque if");
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de reserva");

        }
        //System.out.println("Ejecutado");    
    }

    public void modificarReserva(Reserva res) {
        String sql = "UPDATE reservaciones SET idhuesped == ?, idhabitacion == ?, incio == ?, fin == ?, apagar ==? , pagado == ? , estado= ?"
                + "WHERE  idReserva= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, res.getIdHuesped());
            ps.setInt(2, res.getIdHabitacion());
            ps.setDate(3, Date.valueOf(res.getInicio()));
            ps.setDate(4, Date.valueOf(res.getFin()));
            ps.setDouble(5, res.getaPagar());
            ps.setDouble(6, res.getPagado());
            ps.setBoolean(7, res.isEstado());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "REseva modificada");
            } else if (exito > 1) {
                JOptionPane.showMessageDialog(null, "Se modificó más de una Reservacion. Reservaciones modificadas: " + exito);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reservas");
        }
    }

    public void eliminarReserva(int id) {
        String sql = "UPDATE reservaciones SET estado=0 WHERE idReserva= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Reserva eliminada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");;
        }

    }
    
    public double calcularEstadia(Reserva res){
        HabitacionData hd= new HabitacionData();
        TipoHabData thd = new TipoHabData();
        
        LocalDate ini=res.getInicio();
        LocalDate fin=res.getFin();
        double estadia = ChronoUnit.DAYS.between(ini, fin);
        
        Habitacion hab= hd.buscarHabitacion(res.getIdHabitacion());
        int idTipoHab= hab.getTipoHab();
        TipoHabitacion thab= thd.buscarTipoHab(idTipoHab);
        double precioNoche=thab.getPrecio();
        
        double total=estadia*precioNoche;
        
        return total;
    }

}
