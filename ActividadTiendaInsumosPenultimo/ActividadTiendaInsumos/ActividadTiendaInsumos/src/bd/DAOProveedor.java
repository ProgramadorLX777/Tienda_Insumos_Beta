package bd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Proveedor;

public class DAOProveedor {
    
    private Conexion oConexion;
    private List<Proveedor> listaDeProveedores;
    
    public DAOProveedor() throws SQLException{
        oConexion = new Conexion(
                "localhost",
                "insumos_tecnologicos",
                "root",
                ""//pass
        );
    }
    
    public void crearProveedor(Proveedor oProveedor) throws SQLException {

    int idProveedor = oProveedor.getIdProveedor();
    int idProductoAsociado = oProveedor.getIdProducto();
    String nombreProveedor = oProveedor.getNombre();
    String direccionProveedor = oProveedor.getDireccion(); 
    String fono = oProveedor.getFono();
    String correo = oProveedor.getCorreo();

    String sql = "INSERT INTO insumos_tecnologicos.proveedor (id_producto_asociado, nombre_proveedor, direccion_proveedor, fono, correo) VALUES (?, ?, ?, ?, ?)";
    
    PreparedStatement statement = oConexion.prepareStatement(sql);
    statement.setInt(1, idProductoAsociado);
    statement.setString(2, nombreProveedor); 
    statement.setString(3, direccionProveedor);
    statement.setString(4, fono);
    statement.setString(5, correo);

    statement.executeUpdate();
    statement.close();

    }
    
    public List<Proveedor> getProveedor() throws SQLException {
       listaDeProveedores = new ArrayList<>();

        String sql = "SELECT * FROM insumos_tecnologicos.proveedor";
        try (PreparedStatement preparedStatement = oConexion.prepareStatement(sql)) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Proveedor oProveedor = new Proveedor();
                    oProveedor.setIdProveedor(resultSet.getInt("id_proveedor"));
                    oProveedor.setIdProducto(resultSet.getInt("id_producto_asociado"));
                    oProveedor.setNombre(resultSet.getString("nombre_proveedor"));
                    oProveedor.setDireccion(resultSet.getString("direccion_proveedor"));
                    oProveedor.setFono(resultSet.getString("fono"));
                    oProveedor.setCorreo(resultSet.getString("correo"));
                    listaDeProveedores.add(oProveedor);
            }
        }
    }
        
    return listaDeProveedores;
        
    }
    
    public void borrarProveedor(int id_proveedor) throws SQLException{
        String sql="DELETE from insumos_tecnologicos.proveedor where id_proveedor="+id_proveedor+";";
        oConexion.ejecutar(sql);
        
    }
    
    public void UpdateProveedor(int id_proveedor, int id_producto_asociado, String nombre_proveedor, String direccion_proveedor, String fono, String correo) throws SQLException {
        try {
        // Preparar la consulta SQL para actualizar el proveedor
        String sql = "UPDATE insumos_tecnologicos.proveedor SET id_producto_asociado=?, nombre_proveedor=?, direccion_proveedor=?, fono=?, correo=? WHERE id_proveedor=?";
        PreparedStatement statement = oConexion.prepareStatement(sql);
        
        // Establecer los valores de los parámetros en la consulta SQL
        statement.setInt(1, id_producto_asociado);
        statement.setString(2, nombre_proveedor);
        statement.setString(3, direccion_proveedor);
        statement.setString(4, fono);
        statement.setString(5, correo);
        statement.setInt(6, id_proveedor);
        
        // Ejecutar la consulta SQL para actualizar el proveedor
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

