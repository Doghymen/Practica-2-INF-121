/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Doghy
 */
public class Principal {

    public static void main(String[] args) {

        System.out.println("Suma: " + Calculadora.sumar(10, 5));
        System.out.println("Resta: " + Calculadora.restar(10, 5));
        System.out.println("Multiplicacion: " + Calculadora.multiplicar(10, 5));

        // División correcta
        System.out.println("Division: " + Calculadora.dividir(10, 2));

        System.out.println("\n--- PRUEBAS CON ERRORES ---");

        // División entre cero
        try {
            Calculadora.dividir(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Excepcion capturada: " + e.getMessage());
        }

        // Conversión con error
        try {
            Calculadora.convertirAEntero("ABC123");
        } catch (NumeroInvalidoException e) {
            System.out.println("Excepcion capturada: " + e.getMessage());
        }

        // Correcta conversión
        try {
            int numero = Calculadora.convertirAEntero("123");
            System.out.println("Conversion correcta: " + numero);
        } catch (NumeroInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
