package Entidades;


import java.time.LocalDate;


public class Reserva {
   private int idReserva;
   private int idHuesped;
   private int idHabitacion;
   private LocalDate inicio;
   private LocalDate fin;
   private double aPagar;
   private double pagado;
   private boolean estado;
    
   public Reserva(int idReserva, int idHuesped, int idHabitacion, LocalDate inicio, LocalDate fin, double aPagar, double pagado, boolean estado) {
       this.idReserva = idReserva;
       this.idHuesped = idHuesped;
       this.idHabitacion = idHabitacion;
       this.inicio = inicio;
       this.fin = fin;
       this.aPagar = aPagar;
       this.pagado = pagado;
       this.estado = estado;
}

   public Reserva(int idHuesped, int idHabitacion, LocalDate inicio, LocalDate fin, double aPagar, double pagado, boolean estado) {
       this.idHuesped = idHuesped;
       this.idHabitacion = idHabitacion;
       this.inicio = inicio;
       this.fin = fin;
       this.aPagar = aPagar;
       this.pagado = pagado;
       this.estado = estado;
   }

    public Reserva() {
    }
      
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    public double getaPagar() {
        return aPagar;
    }

    public void setaPagar(double aPagar) {
        this.aPagar = aPagar;
    }

    public double getPagado() {
        return pagado;
    }

    public void setPagado(double pagado) {
        this.pagado = pagado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
   


}
