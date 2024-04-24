package model;

public class Inventario {
    private int idInventario;
    private int idProducto;
    private String nombreProducto;
    private String categoriaProducto;
    private String ubicacionProducto;
    private int cantidad_producto;
    private int cantidadMinima;
    // Coordinar tipos de datos fecha y hora por temas de base de datos
    private String fechaInventario;
    private String horaInventario;

    public Inventario() {
    }

    public Inventario(int idInventario, int idProducto, String nombreProducto, String categoriaProducto, String ubicacionProducto, int cantidad_producto, int cantidadMinima, String fechaInventario, String horaInventario) {
        this.idInventario = idInventario;
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.categoriaProducto = categoriaProducto;
        this.ubicacionProducto = ubicacionProducto;
        this.cantidad_producto = cantidad_producto;
        this.cantidadMinima = cantidadMinima;
        this.fechaInventario = fechaInventario;
        this.horaInventario = horaInventario;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public String getUbicacionProducto() {
        return ubicacionProducto;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public String getFechaInventario() {
        return fechaInventario;
    }

    public String getHoraInventario() {
        return horaInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public void setUbicacionProducto(String ubicacionProducto) {
        this.ubicacionProducto = ubicacionProducto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public void setFechaInventario(String fechaInventario) {
        this.fechaInventario = fechaInventario;
    }

    public void setHoraInventario(String horaInventario) {
        this.horaInventario = horaInventario;
    }

    @Override
    public String toString() {
        return "Inventario{" + "idInventario=" + idInventario + ", idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", categoriaProducto=" + categoriaProducto + ", ubicacionProducto=" + ubicacionProducto + ", cantidad_producto=" + cantidad_producto + ", cantidadMinima=" + cantidadMinima + ", fechaInventario=" + fechaInventario + ", horaInventario=" + horaInventario + '}';
    }
    
    
}
