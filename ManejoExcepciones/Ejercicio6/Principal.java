/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author Doghy
 */
public class Principal {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("12345", "Juan Perez", 1000);

        System.out.println("=== Informacion inicial de la cuenta ===");
        cuenta.mostrarInfo();

        System.out.println("\n=== DEPOSITOS ===");

        try {
            cuenta.depositar(500);
            System.out.println("Deposito exitoso.");
            cuenta.mostrarInfo();
        } catch (Exception e) {
            System.out.println("Error en deposito: " + e.getMessage());
        }

        try {
            cuenta.depositar(-200);
        } catch (Exception e) {
            System.out.println("Excepcion esperada: " + e.getMessage());
        }

        System.out.println("\n=== RETIROS ===");

        try {
            cuenta.retirar(300);
            System.out.println("Retiro exitoso.");
            cuenta.mostrarInfo();
        } catch (FondosInsuficientesException e) {
            System.out.println("Error en retiro: " + e.getMessage());
        }

        try {
            cuenta.retirar(5000);
        } catch (FondosInsuficientesException e) {
            System.out.println("Excepcion esperada: " + e.getMessage());
        }
    }
}
