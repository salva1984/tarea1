/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tarea1;

/**
 *
 * @author herreranc
 */
abstract class ServiciosExtra {
    protected int idServicio;
    protected int precio;

    public ServiciosExtra(int idServicio, int precio) {
        this.idServicio = idServicio;
        this.precio = precio;
    }

    public void añadirServicioExtra() {
    }
}
