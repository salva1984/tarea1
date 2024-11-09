package ec.edu.espol.tarea1;

class Soporte extends Usuario {
    private int idSoporte;

    public Soporte(String nombre, String contrasenia, String correo,int idSoporte) {
        super(nombre, contrasenia, correo);
        this.idSoporte=idSoporte;
    }

    public void revisarIncidencia() {
    }

    public void escalarIncidencia() {
    }
}

