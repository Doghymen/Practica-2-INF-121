/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author Doghy
 */
public class CuentaBancaria {

    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // b) depositar
    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser positivo.");
        }
        saldo += monto;
    }

    // b) retirar
    public void retirar(double monto) throws FondosInsuficientesException {
        if (monto > saldo) {
            throw new FondosInsuficientesException("Fondos insuficientes para retirar " + monto);
        }
        saldo -= monto;
    }

    // b) mostrar información
    public void mostrarInfo() {
        System.out.println("Cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
