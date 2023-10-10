package Entidades;

public class Habitacion {
    
    private int idHabitacion;
    private String nombre;
    private int piso;
    private TipoHabitacion tipoHab;
    private boolean estado;

    public Habitacion(int idHabitacion, String nombre, int piso, TipoHabitacion tipoHab, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.nombre = nombre;
        this.piso = piso;
        this.tipoHab = tipoHab;
        this.estado = estado;
    }

    public Habitacion() {
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPiso() {
        return piso;
    }

    public TipoHabitacion getTipoHab() {
        return tipoHab;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setTipoHab(TipoHabitacion tipoHab) {
        this.tipoHab = tipoHab;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
    
}
