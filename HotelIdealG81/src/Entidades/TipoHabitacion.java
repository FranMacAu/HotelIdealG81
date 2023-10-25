package Entidades;

public class TipoHabitacion {
    
    private int codigo;
    private String nombre;
    private int capacidad;
    private int cantidadCamas;
    private String tipoCama;
    private double precio;

    public TipoHabitacion(int codigo, String nombre, int capacidad, int cantidadCamas, String tipoCama, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.cantidadCamas = cantidadCamas;
        this.tipoCama = tipoCama;
        this.precio = precio;
    }

    public TipoHabitacion(String nombre, int capacidad, int cantidadCamas, String tipoCama, double precio) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.cantidadCamas = cantidadCamas;
        this.tipoCama = tipoCama;
        this.precio = precio;
    }
    
    

    public TipoHabitacion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void cambiarPrecio(double precio){
        this.precio=precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "TipoHabitacion{" + "codigo=" + codigo + ", nombre=" + nombre + ", capacidad=" + capacidad + ", cantidadCamas=" + cantidadCamas + ", tipoCama=" + tipoCama + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
    
    
    
}
