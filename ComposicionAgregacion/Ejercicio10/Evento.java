/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author Doghy
 */
public class Evento {

    private String nombre;
    private Charla[] charlas = new Charla[50];
    private int nc = 0;

    public Evento(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCharla(Charla c) {
        if (nc < 50) {
            charlas[nc++] = c;
        }
    }

    public Charla[] getCharlas() {
        return charlas;
    }

    public int getNc() {
        return nc;
    }
}
