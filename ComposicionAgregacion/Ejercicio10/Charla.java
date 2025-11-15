/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author Doghy
 */
public class Charla {

    private String lugar;
    private String nombreCharla;
    private Speaker speaker;  // Composición
    private Participante[] participantes = new Participante[50];
    private int np = 0;

    public Charla(String lugar, String nombreCharla, Speaker speaker) {
        this.lugar = lugar;
        this.nombreCharla = nombreCharla;
        this.speaker = speaker;
    }

    public void agregarParticipante(Participante p) {
        if (np < 50) {
            participantes[np++] = p;
        }
    }

    public int getNumeroParticipantes() {
        return np;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public String getNombreCharla() {
        return nombreCharla;
    }
}
