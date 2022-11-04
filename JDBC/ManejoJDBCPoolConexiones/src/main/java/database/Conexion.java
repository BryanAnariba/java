package database;
import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {
    private static final String OPCIONES_CONEXION = "?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_URL = "jdbc:mysql://localhost:3307/test" + Conexion.OPCIONES_CONEXION;
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";
    
    public static DataSource getDataSource () {
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASSWORD);
        
        
        // DEFINIMOS LA CANTIDAD DE CONEXIONES POOL
        ds.setInitialSize( 5 );
        
        return ds;
    }
    
    public static Connection getConnection () throws SQLException {
        //return DriverManager.getConnection( Conexion.JDBC_URL, Conexion.JDBC_USER, Conexion.JDBC_PASSWORD );    
        return getDataSource().getConnection();
    }
    
    public static void close ( ResultSet rs ) throws SQLException {
        rs.close();
    }
    
    public static void close ( Statement stmt ) throws SQLException {
        stmt.close();
    }
    
    public static void close ( PreparedStatement stmt ) throws SQLException {
        stmt.close();
    }
    
    public static void close ( Connection conn ) throws SQLException {
        conn.close();
    }
}
