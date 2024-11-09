/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tarea1;

import java.util.Date;

/**
 *
 * @author herreranc
 */
class Pago {
    private int idPago;
    private MetodoPago metodoPago;
    private Date fechaPago;

    public Pago(int idPago, MetodoPago metodoPago, Date fechaPago) {
        this.idPago = idPago;
        this.metodoPago = metodoPago;
        this.fechaPago = fechaPago;
    }
    
    
    public void pagarReserva() {
        // Lógica para realizar el pago de una reserva
    }

    public void procesarPago() {
        // Lógica para procesar el pago
    }
}
