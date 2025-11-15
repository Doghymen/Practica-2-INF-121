/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Doghy
 */
public class Calculadora {

    // a)
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // b)
    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Error: No se puede dividir entre cero.");
        }
        return a / b;
    }

    // c)
    public static int convertirAEntero(String valor) throws NumeroInvalidoException {
        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            throw new NumeroInvalidoException("El valor '" + valor + "' no es un numero valido.");
        }
    }
}
