    
package model;

public class Venta {
    private int id_venta;
    private int id_productoVenta;
    private String nombreCliente;
    private String fechaVenta;
    private int cantidadVendida;
    private float precioUnitario;
    private float precioTotal;

    public Venta() {
    }

    public Venta(int id_venta, int id_productoVenta, String nombreCliente, String fechaVenta, int cantidadVendida, float precioUnitario, float precioTotal) {
        this.id_venta = id_venta;
        this.id_productoVenta = id_productoVenta;
        this.nombreCliente = nombreCliente;
        this.fechaVenta = fechaVenta;
        this.cantidadVendida = cantidadVendida;
        this.precioUnitario = precioUnitario;
        this.precioTotal = precioTotal;
    }

    public int getId_venta() {
        return id_venta;
    }

    public int getId_productoVenta() {
        return id_productoVenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public void setId_productoVenta(int id_productoVenta) {
        this.id_productoVenta = id_productoVenta;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Venta{" + "id_venta=" + id_venta + ", id_productoVenta=" + id_productoVenta + ", nombreCliente=" + nombreCliente + ", fechaVenta=" + fechaVenta + ", cantidadVendida=" + cantidadVendida + ", precioUnitario=" + precioUnitario + ", precioTotal=" + precioTotal + '}';
    }

    
    
    
}
    

    