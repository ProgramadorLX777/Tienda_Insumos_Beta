package bd;

import java.sql.SQLException;
import java.util.List;
import model.Venta;
import java.util.ArrayList;

public class DAOBoleta {
 
    private Conexion oConexion;
    private List<Venta> ListaDeVenta;
    
    public DAOBoleta() throws SQLException{
        oConexion = new Conexion(
                "localhost",
                "insumos_tecnologicos",
                "root",
                ""
        );
    }
    
    public List<Venta>getVenta() throws SQLException{
        ListaDeVenta = new ArrayList<>();
        
        String query = "SELECT id_venta, id_productoVenta, nombre_cliente, fecha_venta, cantidad_vendida, precio_unitario, precio_total"
                + "FROM venta"
                + "INNER JOIN producto ON id_productoVenta=id_producto";
        Venta oVenta ;
        oConexion.oResulset = oConexion.ejecutarSelect(query);
        
        while (oConexion.oResulset.next()){
            oVenta = new Venta();
            oVenta.setId_venta(oConexion.oResulset.getInt("id_venta"));
            oVenta.setId_productoVenta(oConexion.oResulset.getInt("id_productoVenta"));
            oVenta.setNombreCliente(oConexion.oResulset.getString("nombre_cliente"));
            oVenta.setFechaVenta(oConexion.oResulset.getString("fecha_venta"));
            oVenta.setCantidadVendida(oConexion.oResulset.getInt("cantidad_vendida"));
            oVenta.setPrecioUnitario(oConexion.oResulset.getFloat("precio_unitario"));
            oVenta.setPrecioTotal(oConexion.oResulset.getInt("precio_total"));
            ListaDeVenta.add(oVenta);
        }
        oConexion.oResulset.close();
        return ListaDeVenta;  
    }
            
    
    }
    
