package bd;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    
    private Connection oConnection;
    private Statement oStatement;
    ResultSet oResulset;

    public Conexion(String server, String bd, String user, String pass) throws SQLException {
        MysqlDataSource mysql = new MysqlDataSource();

        mysql.setServerName(server);
        mysql.setDatabaseName(bd);
        mysql.setUser(user);
        mysql.setPassword(pass);

        oConnection = mysql.getConnection();
    }

    public void cerrarConexion() throws SQLException {
        if (oConnection != null && !oConnection.isClosed()) {
            oConnection.close();
        }
    }

    public void ejecutar(String sql) throws SQLException {
        oStatement = oConnection.createStatement();
        oStatement.executeUpdate(sql);
        oStatement.close();
    }

    public ResultSet ejecutarSelect(String select) throws SQLException {
        oStatement = oConnection.createStatement();
        oResulset = oStatement.executeQuery(select);
        return oResulset;
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return oConnection.prepareStatement(sql);
    }

    public void commit() throws SQLException {
        if (oConnection != null && !oConnection.isClosed()) {
            oConnection.commit();
        }
    }
}
