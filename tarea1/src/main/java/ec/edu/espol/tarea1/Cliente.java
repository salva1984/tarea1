package ec.edu.espol.tarea1;

public class Cliente extends Usuario{
    private int idCliente;
    private Reserva reservacion;

    public Cliente(String nombre, String contrasenia, String correo,int idCliente,Reserva reservacion) {
        super(nombre, contrasenia, correo);
        this.idCliente =idCliente;
        this.reservacion= reservacion;
    }

    public void reservar(Vuelo vuelo, Vehiculo vehiculo) {
    }
}