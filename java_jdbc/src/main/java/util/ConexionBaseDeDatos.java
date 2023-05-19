package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDeDatos {
    private static String url = "jdbc:mysql://localhost:3306/java";    private static String username = "root";
    private static String password = "Macrioctavio97";

    public static Connection getConecction() throws SQLException{
        Connection con = DriverManager.getConnection(url,username,password);
        return con;
    }
}
