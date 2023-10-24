package Entidades;

public class Habitacion {
    
    private int idHabitacion;
    private String nombre;
    private int piso;
    private int tipoHab;
    private boolean estado; //true o 1: habitación ocupada 

    public Habitacion(int idHabitacion, String nombre, int piso, int tipoHab, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.nombre = nombre;
        this.piso = piso;
        this.tipoHab = tipoHab;
        this.estado = estado;
    }
    
    public Habitacion(String nombre, int piso, int tipoHab, boolean estado) {
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

    public int getTipoHab() {
        return tipoHab;
    }

    public boolean isActivo() {
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

    public void setTipoHab(int tipoHab) {
        this.tipoHab = tipoHab;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
    
}
