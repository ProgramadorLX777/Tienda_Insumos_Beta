package model;

public class Reporte {
    private int idReporte; 
    private int idProducto; 
    private int productoMayorVentas; 
    private int stockInicial; 
    private int cantidadVendidos; 
    private int stockFinal; 
    private float ingresosGenerados; 
    // Coordinar tipos de datos fecha y hora por temas de base de datos
    private String fechaReporte;
    private String horaReporte;

    public Reporte() {
    }

    public Reporte(int idReporte, int idProducto, int productoMayorVentas, int stockInicial, int cantidadVendidos, int stockFinal, float ingresosGenerados, String fechaReporte, String horaReporte) {
        this.idReporte = idReporte;
        this.idProducto = idProducto;
        this.productoMayorVentas = productoMayorVentas;
        this.stockInicial = stockInicial;
        this.cantidadVendidos = cantidadVendidos;
        this.stockFinal = stockFinal;
        this.ingresosGenerados = ingresosGenerados;
        this.fechaReporte = fechaReporte;
        this.horaReporte = horaReporte;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public int getProductoMayorVentas() {
        return productoMayorVentas;
    }

    public int getStockInicial() {
        return stockInicial;
    }

    public int getCantidadVendidos() {
        return cantidadVendidos;
    }

    public int getStockFinal() {
        return stockFinal;
    }

    public float getIngresosGenerados() {
        return ingresosGenerados;
    }

    public String getFechaReporte() {
        return fechaReporte;
    }

    public String getHoraReporte() {
        return horaReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setProductoMayorVentas(int productoMayorVentas) {
        this.productoMayorVentas = productoMayorVentas;
    }

    public void setStockInicial(int stockInicial) {
        this.stockInicial = stockInicial;
    }

    public void setCantidadVendidos(int cantidadVendidos) {
        this.cantidadVendidos = cantidadVendidos;
    }

    public void setStockFinal(int stockFinal) {
        this.stockFinal = stockFinal;
    }

    public void setIngresosGenerados(float ingresosGenerados) {
        this.ingresosGenerados = ingresosGenerados;
    }

    public void setFechaReporte(String fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public void setHoraReporte(String horaReporte) {
        this.horaReporte = horaReporte;
    }

    @Override
    public String toString() {
        return "Reporte{" + "idReporte=" + idReporte + ", idProducto=" + idProducto + ", productoMayorVentas=" + productoMayorVentas + ", stockInicial=" + stockInicial + ", cantidadVendidos=" + cantidadVendidos + ", stockFinal=" + stockFinal + ", ingresosGenerados=" + ingresosGenerados + ", fechaReporte=" + fechaReporte + ", horaReporte=" + horaReporte + '}';
    }
    
    
}
