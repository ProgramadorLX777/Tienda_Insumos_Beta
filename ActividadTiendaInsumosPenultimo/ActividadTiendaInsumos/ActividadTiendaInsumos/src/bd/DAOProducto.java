package bd;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DAOProducto {

    private Conexion oConexion;
    private List<Producto> listaDeProducto;

    /*
     constructor de DAO
     Genera la conexion entregando los datos
     */
    public DAOProducto() throws SQLException, Exception {
        oConexion = new Conexion(
                "localhost",
                "insumos_tecnologicos",
                "root",
                ""//pass
        );
    }

    public void crearProducto(Producto oProducto) throws SQLException {

    int idProducto = oProducto.getId_producto();
    String nombre = oProducto.getNombre();
    String descripcion = oProducto.getDescripcion();
    float precio = oProducto.getPrecio(); 
    int cantidadStock = oProducto.getCantidadStock();
    String categoria = oProducto.getCategoria();

    String sql = "INSERT INTO insumos_tecnologicos.producto (id_producto, nombre, descripcion, precio, cantidad_stock, categoria) VALUES (?, ?, ?, ?, ?, ?)";
    
    PreparedStatement statement = oConexion.prepareStatement(sql);
    statement.setInt(1, idProducto);
    statement.setString(2, nombre);
    statement.setString(3, descripcion);
    statement.setFloat(4, precio); 
    statement.setInt(5, cantidadStock);
    statement.setString(6, categoria);

    statement.executeUpdate();
    statement.close();

    }

    public List<Producto> getProducto() throws SQLException {
       listaDeProducto = new ArrayList<>();

        String sql = "SELECT * FROM insumos_tecnologicos.producto";
        try (PreparedStatement preparedStatement = oConexion.prepareStatement(sql)) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Producto oProducto = new Producto();
                    oProducto.setId_producto(resultSet.getInt("id_producto"));
                    oProducto.setNombre(resultSet.getString("nombre"));
                    oProducto.setDescripcion(resultSet.getString("descripcion"));
                    oProducto.setPrecio(resultSet.getFloat("precio"));
                    oProducto.setCantidadStock(resultSet.getInt("cantidad_stock"));
                    oProducto.setCategoria(resultSet.getString("categoria"));
                    listaDeProducto.add(oProducto);
            }
        }
    }

    return listaDeProducto;

    }
    
    public List<Producto> getProductosegunFiltro(String filtro) throws SQLException {
      listaDeProducto = new ArrayList<>();

        String sql = "SELECT * FROM insumos_tecnologicos.producto WHERE id_producto LIKE '%" + filtro + "%';";
        Producto oProducto;

    try (ResultSet resultSet = oConexion.ejecutarSelect(sql)) {
        while (resultSet.next()) {
            oProducto = new Producto();
            oProducto.setId_producto(resultSet.getInt("id_producto"));
            oProducto.setNombre(resultSet.getString("nombre"));
            oProducto.setDescripcion(resultSet.getString("descripcion"));
            oProducto.setPrecio(resultSet.getInt("precio"));
            oProducto.setCantidadStock(resultSet.getInt("cantidad_stock"));
            oProducto.setCategoria(resultSet.getString("categoria"));
            listaDeProducto.add(oProducto);
        }
    }

    return listaDeProducto;
}


    public Producto esProducto(String nombre) throws SQLException {
        Producto oProducto;
        String sql = "select * from insumos_tecnologicos.producto where nombre='" + nombre+ "'";
        oConexion.oResulset = oConexion.ejecutarSelect(sql);
        if (oConexion.oResulset.next()) {
            oProducto = new Producto();
            oProducto.setId_producto(oConexion.oResulset.getInt("id producto"));
            oProducto.setNombre(oConexion.oResulset.getString("nombre "));
            oProducto.setDescripcion(oConexion.oResulset.getString("descripcion"));
            oProducto.setPrecio(oConexion.oResulset.getInt("precio"));
            oProducto.setCantidadStock(oConexion.oResulset.getInt("cantidad_stock"));
            oProducto.setCategoria(oConexion.oResulset.getString("categoria"));

            oConexion.oResulset.close();
            return oProducto;
        } else {
            oConexion.oResulset.close();

            return null;
        }

    }
    public List<Producto> obtenerListaProducto() throws SQLException {
    listaDeProducto = new ArrayList<>();

    String sql = "SELECT * FROM insumos_tecnologicos.producto";
    try (PreparedStatement preparedStatement = oConexion.prepareStatement(sql)) {
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                Producto oProducto = new Producto();
                oProducto.setId_producto(resultSet.getInt("id_producto"));
                oProducto.setNombre(resultSet.getString("nombre"));
                oProducto.setDescripcion(resultSet.getString("descripcion"));
                oProducto.setPrecio(resultSet.getInt("precio"));
                oProducto.setCantidadStock(resultSet.getInt("cantidad_stock"));
                oProducto.setCategoria(resultSet.getString("categoria"));
                listaDeProducto.add(oProducto);
            }
        }
    }

    return listaDeProducto;
}
    
    public void borrarProducto(int id_producto) throws SQLException{
//        DELETE from persona where id=;
        String sql="DELETE from insumos_tecnologicos.producto where id_producto="+id_producto+";";
        oConexion.ejecutar(sql);
        
    }
    
public void UpdateProducto(int id_producto, String nombreUpdate, String descripcionUpdate, int precioUpdate, int cantidadUpdate, String categoriaUpdate) throws SQLException {
    try {
        // Preparar la consulta SQL para actualizar el producto
        String sql = "UPDATE insumos_tecnologicos.producto SET nombre=?, descripcion=?, precio=?, cantidad_stock=?, categoria=? WHERE id_producto=?";
        PreparedStatement statement = oConexion.prepareStatement(sql);
        
        // Establecer los valores de los parámetros en la consulta SQL
        statement.setString(1, nombreUpdate);
        statement.setString(2, descripcionUpdate);
        statement.setInt(3, precioUpdate);
        statement.setInt(4, cantidadUpdate);
        statement.setString(5, categoriaUpdate);
        statement.setInt(6, id_producto);
        
        // Ejecutar la consulta SQL para actualizar el producto
        statement.executeUpdate();
        
        // Cerrar la conexión y liberar recursos
        statement.close();
    } catch (SQLException ex) {
        // Manejar cualquier excepción de SQL
        ex.printStackTrace();
        throw ex; // Relanzar la excepción para que sea manejada en un nivel superior
    }
}

}