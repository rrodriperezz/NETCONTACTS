package main;

public class Usuarios {

//    Declaracion de variables iguales a los datos en la tabla de usuario
    private int id;
    private String usuario;
    private String password;
    private String nombre;
    private String correo;
    private String last_conexion;

    //Setter & Getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLast_conexion() {
        return last_conexion;
    }

    public void setLast_conexion(String last_conexion) {
        this.last_conexion = last_conexion;
    }

}
