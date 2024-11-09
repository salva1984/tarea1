package ec.edu.espol.tarea1;
public abstract class Usuario {
    private String nombre;
    private String contrasenia;
    private String correo;

    public Usuario(String nombre, String contrasenia, String correo) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.correo = correo;
    }
    
    public void iniciarSesion(){}
}
