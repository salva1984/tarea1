/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1desarrollo;

/**
 *
 * @author herreranc
 */
abstract class Vehiculo {
    protected int idVehiculo;
    protected String placa;
    protected int costo;
    protected Proveedor proveedor;

    public Vehiculo(int idVehiculo, String placa, int costo, Proveedor proveedor) {
        this.idVehiculo = idVehiculo;
        this.placa = placa;
        this.costo = costo;
        this.proveedor = proveedor;
    }

    public void bloquear() {
    }

    public void desbloquear() {
    }
}