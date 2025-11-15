/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Doghy
 */
public class Principal {

    public static void main(String[] args) {

        // Crear Facultades
        Facultad ingSistemas = new Facultad("Ingenieria de Sistemas");
        Facultad medicina = new Facultad("Medicina");

        // Crear Encargados
        Encargado enc1 = new Encargado("Luis Choque", 40, "Presidente");
        Encargado enc2 = new Encargado("Maria Flores", 38, "Coordinadora");

        // Crear Fraternidades
        Fraternidad morenada = new Fraternidad("Morenada Central", enc1);
        Fraternidad tinkus = new Fraternidad("Tinkus San Simon", enc2);

        // Crear Participantes
        Participante p1 = new Participante("Juan", 20, ingSistemas, morenada);
        Participante p2 = new Participante("Ana", 22, medicina, tinkus);
        Participante p3 = new Participante("Carlos", 19, ingSistemas, morenada);
        Participante p4 = new Participante("Lucia", 21, medicina, tinkus);
        Participante p5 = new Participante("Pedro", 23, ingSistemas, morenada);

        // Registrar participantes
        morenada.agregarParticipante(p1);
        morenada.agregarParticipante(p3);
        morenada.agregarParticipante(p5);

        tinkus.agregarParticipante(p2);
        tinkus.agregarParticipante(p4);

        // Verificación: ningún participante puede estar en más de una fraternidad
        System.out.println("Verificando duplicados...");
        verificarParticipantes(morenada, tinkus);

        // Mostrar datos
        mostrarInformacionFraternidad(morenada);
        mostrarInformacionFraternidad(tinkus);
    }

    public static void verificarParticipantes(Fraternidad f1, Fraternidad f2) {
        for (Participante p1 : f1.getParticipantes()) {
            for (Participante p2 : f2.getParticipantes()) {
                if (p1.getNombre().equalsIgnoreCase(p2.getNombre())) {
                    System.out.println("ERROR: " + p1.getNombre() + " esta en dos fraternidades.");
                }
            }
        }
    }

    public static void mostrarInformacionFraternidad(Fraternidad f) {
        System.out.println("\n--- Fraternidad: " + f.getNombre() + " ---");
        System.out.println("Encargado: " + f.getEncargado().getNombre());

        for (Participante p : f.getParticipantes()) {
            System.out.println("Participante: " + p.getNombre()
                    + " | Edad: " + p.getEdad()
                    + " | Facultad: " + p.getFacultad().getNombre());
        }
    }
}
