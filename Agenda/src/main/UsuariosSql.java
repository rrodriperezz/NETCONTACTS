package main;

import com.mysql.jdbc.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuariosSql extends Conexion {

    public boolean registrar(Usuarios usr) {

        PreparedStatement ps = null;
        Connection con = (Connection) getConexion();
        String sql = "INSERT INTO usuarios (usuario, password, nombre, correo) VALUES (?, ?, ?, ?)";

        try {

            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getPassword());
            ps.setString(3, usr.getNombre());
            ps.setString(4, usr.getCorreo());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(UsuariosSql.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

//    Registrar string de usuario
    public String nickUsuario(String usuario) throws SQLException {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) getConexion();
        String sql = "SELECT usuario FROM usuarios WHERE usuario = ?";

        try {

            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getString(1);
            }
            return rs.getString(1);

        } catch (SQLException ex) {
            Logger.getLogger(UsuariosSql.class.getName()).log(Level.SEVERE, null, ex);
            return rs.getString(1);
        }

    }

//  Metodo autentificar usuario
    public boolean Login(Usuarios usr) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) getConexion();
        String sql = "SELECT id, usuario, password, nombre FROM usuarios WHERE usuario = ?";

        try {

            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {

//              Comprobar si la contraseña ingresada coincide en la base de datos
                if (usr.getPassword().equals(rs.getString(3))) {

                    String sqlActualizar = "UPDATE usuarios SET last_session = ? WHERE id = ?";

                    ps = (PreparedStatement) con.prepareStatement(sqlActualizar);
                    ps.setString(1, usr.getLast_conexion());
                    ps.setInt(2, rs.getInt(1));
                    ps.execute();

                    usr.setId(rs.getInt(1));
                    usr.setNombre(rs.getString(4));
                    return true;

                } else {
                    return false;
                }

            }
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(UsuariosSql.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

//  Metodo para comprobar existencia de usuario en la base de datos
    public int existeUsuario(String usuario) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = (Connection) getConexion();
        String sql = "SELECT count(id) FROM usuarios WHERE usuario = ?";

        try {

            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(UsuariosSql.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }

    //   Metodo comprobar si el num es valido
    public static boolean esInt(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

//   Metodo comprobar si el email es valido
    public static boolean esEmail(String email) {

        boolean valido = false;

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+´)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mEmail = pattern.matcher(email.toLowerCase());
        if (mEmail.matches()) {
            valido = true;
        }
        return valido;
    }

//   Metodo comprobar si la pass es valida
    public static boolean esContra(String contra) {

        if (contra.length() < 8) {
            return false;
        }
        int letr = 0;
        int num = 0;
        int may = 0;
        for (int i = 0; i < contra.length(); i++) {

            char ch = contra.charAt(i);

            if (ch >= '0' && ch <= '9') {
                num++;
            } else if (Character.isLowerCase(ch)) {
                letr++;
            } else if (Character.isUpperCase(ch)) {
                may++;
            } else {
                return false;
            }
        }

        return (letr >= 2 && num >= 2 && may >= 1);
    }

}
