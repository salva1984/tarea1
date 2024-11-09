/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1desarrollo;

/**
 *
 * @author herreranc
 */
abstract class Asiento {
    protected int idAsiento;
    protected int ubicacion;
    protected double costo;

    public Asiento(int idAsiento, int ubicacion,double costo) {
        this.idAsiento = idAsiento;
        this.ubicacion = ubicacion;
        this.costo=costo;
    }
    
    public void bloquearAsiento() {
    }

    public void desbloquearAsiento() {
    }

    public void confirmarAsiento() {
    }

    public void reservarAsiento() {
    }
}
