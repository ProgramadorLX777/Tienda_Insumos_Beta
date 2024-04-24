package model;

public class Proveedor {
    private int idProveedor;
    private int idProducto;
    private String nombre;
    private String direccion;
    private String correo;
    private String fono;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, int idProducto, String nombre, String direccion, String correo, String fono) {
        this.idProveedor = idProveedor;
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.fono = fono;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getFono() {
        return fono;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", idProducto=" + idProducto + ", nombre=" + nombre + ", direccion=" + direccion + ", correo=" + correo + ", fono=" + fono + '}';
    }



}