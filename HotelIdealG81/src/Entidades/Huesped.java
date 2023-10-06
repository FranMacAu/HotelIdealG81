
package Entidades;

public class Huesped {
    private int idHuesped;
    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private String correo;
    private int telefono;
    private boolean estado;
    
    
    public Huesped () { 
        
    }

    public Huesped(String nombre, String apellido, int dni, String domicilio, String correo, int telefono, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
    }
    
    public Huesped(int idHuesped, String nombre, String apellido, int dni, String domicilio, String correo, int telefono, boolean estado) {
        this.idHuesped = idHuesped;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
    }
    
    public void setIdHuesped(int idHuesped){
        this.idHuesped = idHuesped;
    }
    
    public int getIdHuesped(){
        return idHuesped;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setHuesped(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setEstado(boolean estado){
        this.estado=estado;
    }
    
    public boolean isActivo(){
        return estado;
    }
    
}
