/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tarea1;

/**
 *
 * @author RUCO HOUSE
 */
class Incidente {
    private int idIncidente;
    private String descripcion;
    private EstadoIncidente estado;

    public Incidente(int idIncidente, String descripcion, EstadoIncidente estado) {
        this.idIncidente = idIncidente;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    
}