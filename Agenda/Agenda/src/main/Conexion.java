package main;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

//    Declaracion de Variables
    private final String base = "usuarios";
    private final String user = "root";
    private final String password = "Rodri53761996P.";
    private final String url = "jdbc:mysql://localhost:3306/usuarios?characterEncoding=utf8";
    private static Connection con = null;

//    Conectar con la base de datos
    public Connection getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
