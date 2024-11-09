package ec.edu.espol.tarea1;

public class Administrador extends Usuario{
    private int idAdmin;

    public Administrador(String nombre, String contrasenia, String correo, int idAdmin) {
        super(nombre, contrasenia, correo);
        this.idAdmin=idAdmin;
    }
    
    public void notificarUsuario(){}
    
    public void verificarDevolucion(){}
    
}