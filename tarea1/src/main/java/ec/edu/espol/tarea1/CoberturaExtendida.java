/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1desarrollo;

/**
 *
 * @author herreranc
 */
class CoberturaExtendida extends ServiciosExtra {
    private Vehiculo vehiculo;

    public CoberturaExtendida(int idServicio, int precio,Vehiculo vehiculo) {
        super(idServicio, precio);
        this.vehiculo = vehiculo;
    }
}