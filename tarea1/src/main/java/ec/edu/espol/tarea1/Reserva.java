/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tarea1;

import java.util.Date;

/**
 *
 * @author RUCO HOUSE
 */
class Reserva {
    private int idReserva;
    private Pago pago;
    private String destino;
    private Date fecha;
    private String preferencias;
    private Vuelo vuelo;
    private EstadoIncidente incidente;
    private Vehiculo vehiculo;

    public Reserva(int idReserva, Pago pago, String destino, Date fecha, String preferencias, Vuelo vuelo, EstadoIncidente incidente, Vehiculo vehiculo) {
        this.idReserva = idReserva;
        this.pago = pago;
        this.destino = destino;
        this.fecha = fecha;
        this.preferencias = preferencias;
        this.vuelo = vuelo;
        this.incidente = incidente;
        this.vehiculo = vehiculo;
    }

    
    public void confirmarReserva() {
    }

    public void cancelarReserva() {
    }

    public void verificarDisponibilidad() {
    }

    public void reportarIncidente() {
    }
}
