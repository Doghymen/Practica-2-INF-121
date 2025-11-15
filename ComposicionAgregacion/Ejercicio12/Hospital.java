/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author Doghy
 */
public class Hospital {

    private String nombre;
    private Doctor[] doctores = new Doctor[50];
    private int nd = 0;

    public Hospital(String nombre) {
        this.nombre = nombre;
    }

    // Agregación: el hospital usa doctores, no los crea
    public void agregarDoctor(Doctor d) {
        if (nd < 50) {
            doctores[nd++] = d;
        }
    }

    public void mostrarDoctores() {
        System.out.println("Doctores del hospital: " + nombre);
        for (int i = 0; i < nd; i++) {
            System.out.println(doctores[i].getNombre()
                    + " | Especialidad: " + doctores[i].getEspecialidad());
        }
    }
}
