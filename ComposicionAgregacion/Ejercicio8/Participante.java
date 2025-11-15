/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Doghy
 */
public class Participante {

    private String nombre;
    private int edad;
    private Facultad facultad;      // Agregación
    private Fraternidad fraternidad; // Agregación

    public Participante(String nombre, int edad, Facultad facultad, Fraternidad fraternidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.facultad = facultad;
        this.fraternidad = fraternidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public Fraternidad getFraternidad() {
        return fraternidad;
    }
}
