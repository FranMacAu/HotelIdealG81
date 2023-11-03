package AccesoADatos;

import Entidades.Habitacion;
import Entidades.Huesped;
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

        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, reserva.getIdHuesped());
            ps.setInt(2, reserva.getIdHabitacion());
            ps.setDate(3, Date.valueOf(reserva.getInicio()));
            ps.setDate(4, Date.valueOf(reserva.getFin()));
            ps.setDouble(5, reserva.getaPagar());
            ps.setDouble(6, calcularEstadia(reserva));
            ps.setBoolean(7, reserva.isEstado());
            
            int filas = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Reserva guardado");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de reserva"+ex);

        }

    }

    public void modificarReserva(Reserva res) {
        String sql = "UPDATE reservas SET idhuesped == ?, idhabitacion == ?, incio == ?, fin == ?, apagar ==? , pagado == ? , estado= ?"
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
        String sql = "UPDATE reservas SET estado=0 WHERE idReserva= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Reserva eliminada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de reserva");
        }

    }

    public double calcularEstadia(Reserva res) {
        HabitacionData hd = new HabitacionData();
        TipoHabData thd = new TipoHabData();

        LocalDate ini = res.getInicio();
        LocalDate fin = res.getFin();
        double estadia = ChronoUnit.DAYS.between(ini, fin);

        Habitacion hab = hd.buscarHabitacion(String.valueOf(res.getIdHabitacion()));
        int idTipoHab = hab.getTipoHab();
        TipoHabitacion thab = thd.buscarTipoHab(idTipoHab);
        double precioNoche = thab.getPrecio();

        double total = estadia * precioNoche;

        return total;
    }

    public Reserva buscarReservaPorHesped(Huesped hue) {
        Reserva res = new Reserva();
        String sql = "SELECT * FROM  reservas WHERE idHuesped= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, hue.getIdHuesped());

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                res.setIdReserva(rs.getInt(1));
                res.setIdHuesped(rs.getInt(2));
                res.setIdHabitacion(rs.getInt(3));
                res.setInicio(rs.getDate(4).toLocalDate());
                res.setFin(rs.getDate(5).toLocalDate());
                res.setaPagar(rs.getDouble(6));
                res.setPagado(rs.getDouble(7));
                res.setEstado(rs.getBoolean(8));

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla reservas");
        }

        return res;

    }

    public void finReserva(Huesped hue) {

        Reserva baja = buscarReservaPorHesped(hue);
        HabitacionData hab = new HabitacionData();
        Habitacion libre = hab.buscarHabitacion(String.valueOf(baja.getIdHabitacion()));

        libre.setEstado(false);
        baja.setEstado(false);

    }

}
