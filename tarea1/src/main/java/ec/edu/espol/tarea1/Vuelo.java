/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1desarrollo;

import java.util.Date;

/**
 *
 * @author herreranc
 */
class Vuelo {
    private int idVuelo;
    private String aerolinea;
    private Asiento asiento;
    private Date horarioSalida;
    private int duracion;

    public Vuelo(int idVuelo, String aerolinea, Asiento asiento, Date horarioSalida, int duracion) {
        this.idVuelo = idVuelo;
        this.aerolinea = aerolinea;
        this.asiento = asiento;
        this.horarioSalida = horarioSalida;
        this.duracion = duracion;
    }
    
    
}
