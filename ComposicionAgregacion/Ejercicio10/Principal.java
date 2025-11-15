/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author Doghy
 */
public class Principal {

    public static void main(String[] args) {

        Evento evento = new Evento("Tech Conference 2025");

        Speaker sp1 = new Speaker("Luis", "Quispe", 40, 1111, "Ciberseguridad");
        Speaker sp2 = new Speaker("Ana", "Flores", 35, 2222, "Inteligencia Artificial");
        Speaker sp3 = new Speaker("Miguel", "Choque", 45, 3333, "Bases de Datos");

        Charla c1 = new Charla("Auditorio A", "Hacking Etico", sp1);
        Charla c2 = new Charla("Auditorio B", "IA Avanzada", sp2);
        Charla c3 = new Charla("Sala 3", "SQL Performance", sp3);

        Participante p1 = new Participante("Maria", "Gomez", 22, 9001, 101);
        Participante p2 = new Participante("Carlos", "Rojas", 30, 9002, 102);
        Participante p3 = new Participante("Ana", "Flores", 28, 9003, 103);
        Participante p4 = new Participante("Luis", "Quispe", 26, 9004, 104);
        Participante p5 = new Participante("Diana", "Perez", 24, 9005, 105);

        c1.agregarParticipante(p1);
        c1.agregarParticipante(p2);

        c2.agregarParticipante(p3);
        c2.agregarParticipante(p4);
        c2.agregarParticipante(p5);

        c3.agregarParticipante(p1);

        evento.agregarCharla(c1);
        evento.agregarCharla(c2);
        evento.agregarCharla(c3);

        double promedio = edadPromedio(evento);
        System.out.println("Edad promedio de participantes: " + promedio);

        String nombreBuscado = "Ana";
        String apellidoBuscado = "Flores";

        boolean encontrado = buscarPersona(evento, nombreBuscado, apellidoBuscado);

        System.out.println("La persona " + nombreBuscado + " " + apellidoBuscado
                + " esta en el evento?: " + (encontrado ? "SI" : "NO"));

        int ciNoAsiste = 3333; // Speaker Miguel Choque

        eliminarCharlasPorSpeaker(evento, ciNoAsiste);

        System.out.println("Charlas luego de eliminar las del speaker CI " + ciNoAsiste + ":");
        mostrarCharlas(evento);

        ordenarCharlas(evento);

        System.out.println("Charlas ordenadas por numero de participantes:");
        mostrarCharlas(evento);
    }

    public static double edadPromedio(Evento e) {
        int suma = 0;
        int contador = 0;

        for (int i = 0; i < e.getNc(); i++) {
            Charla c = e.getCharlas()[i];

            if (c != null) {
                for (Participante p : c.getParticipantes()) {
                    if (p != null) {
                        suma += p.edad;
                        contador++;
                    }
                }
            }
        }
        return contador > 0 ? (double) suma / contador : 0;
    }

    public static boolean buscarPersona(Evento e, String nombre, String apellido) {
        for (int i = 0; i < e.getNc(); i++) {
            Charla c = e.getCharlas()[i];
            if (c != null) {
                Speaker s = c.getSpeaker();
                if (s.nombre.equalsIgnoreCase(nombre) && s.apellido.equalsIgnoreCase(apellido)) {
                    return true;
                }

                for (Participante p : c.getParticipantes()) {
                    if (p != null
                            && p.nombre.equalsIgnoreCase(nombre)
                            && p.apellido.equalsIgnoreCase(apellido)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void eliminarCharlasPorSpeaker(Evento e, int ci) {
        for (int i = 0; i < e.getNc(); i++) {
            Charla c = e.getCharlas()[i];
            if (c != null && c.getSpeaker().getCi() == ci) {
                e.getCharlas()[i] = null;
            }
        }
    }

    public static void ordenarCharlas(Evento e) {
        for (int i = 0; i < e.getNc() - 1; i++) {
            for (int j = 0; j < e.getNc() - i - 1; j++) {

                Charla c1 = e.getCharlas()[j];
                Charla c2 = e.getCharlas()[j + 1];

                if (c1 == null || c2 == null) {
                    continue;
                }

                if (c1.getNumeroParticipantes() > c2.getNumeroParticipantes()) {
                    Charla aux = c1;
                    e.getCharlas()[j] = c2;
                    e.getCharlas()[j + 1] = aux;
                }
            }
        }
    }

    public static void mostrarCharlas(Evento e) {
        for (int i = 0; i < e.getNc(); i++) {
            Charla c = e.getCharlas()[i];
            if (c != null) {
                System.out.println("- " + c.getNombreCharla()
                        + " | Participantes: " + c.getNumeroParticipantes());
            }
        }
    }
}
