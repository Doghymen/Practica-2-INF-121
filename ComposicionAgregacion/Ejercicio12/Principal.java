/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author Doghy
 */
public class Principal {

    public static void main(String[] args) {

        Doctor d1 = new Doctor("Luis Quispe", "Cardiologia");
        Doctor d2 = new Doctor("Ana Flores", "Pediatria");
        Doctor d3 = new Doctor("Carlos Rojas", "Traumatologia");

        
        Hospital h1 = new Hospital("Hospital La Paz");
        Hospital h2 = new Hospital("Hospital del Sur");

        
        h1.agregarDoctor(d1);
        h1.agregarDoctor(d2);

        h2.agregarDoctor(d2);
        h2.agregarDoctor(d3);

        h1.mostrarDoctores();
        System.out.println();
        h2.mostrarDoctores();
    }
}
