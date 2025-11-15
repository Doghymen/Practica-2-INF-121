/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Doghy
 */
public class Principal {

    public static void main(String[] args) {

        Inventario inventario = new Inventario(10);

        System.out.println("=== PRUEBAS DEL INVENTARIO ===\n");

        try {
            inventario.agregarProducto(new Producto("P001", "Mouse", 50.0, 20));
            inventario.agregarProducto(new Producto("P002", "Teclado", 80.0, 15));
            System.out.println("Productos agregados correctamente.");
        } catch (Exception e) {
            System.out.println("Error al agregar producto: " + e.getMessage());
        }

        try {
            inventario.agregarProducto(new Producto("P001", "Mouse Gamer", 150.0, 10));
        } catch (Exception e) {
            System.out.println("Excepcion esperada: " + e.getMessage());
        }

        try {
            inventario.agregarProducto(new Producto("P003", "Monitor", -200.0, 5));
        } catch (Exception e) {
            System.out.println("Excepcion esperada: " + e.getMessage());
        }

        try {
            Producto p = inventario.buscarProducto("P001");
            System.out.println("Producto encontrado: " + p.getNombre());
        } catch (ProductoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            inventario.buscarProducto("P999");
        } catch (ProductoNoEncontradoException e) {
            System.out.println("Excepcion esperada: " + e.getMessage());
        }

        try {
            inventario.venderProducto("P001", 5);
            System.out.println("Venta realizada correctamente.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            inventario.venderProducto("P002", 50);
        } catch (Exception e) {
            System.out.println("Excepcion esperada: " + e.getMessage());
        }
    }
}
