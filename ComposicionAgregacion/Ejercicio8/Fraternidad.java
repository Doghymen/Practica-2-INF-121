/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

import java.util.ArrayList;

/**
 *
 * @author Doghy
 */
public class Fraternidad {
    private String nombre;
    private Encargado encargado;
    private ArrayList<Participante> participantes;

    public Fraternidad(String nombre, Encargado encargado) {
        this.nombre = nombre;
        this.encargado = encargado;
        this.participantes = new ArrayList<>();
    }

    public void agregarParticipante(Participante p) {
        participantes.add(p);
    }

    public boolean tieneParticipante(String nombre) {
        for (Participante p : participantes) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public Encargado getEncargado() {
        return encargado;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }
}
