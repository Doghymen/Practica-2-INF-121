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
    public static void main(String[] args){
        // b) Adicionar N prendas al ropero
        Ropero ropero = new Ropero("Madera");
        System.out.println("b) Adicionando prendas al ropero");
        Ropa[] nuevas = new Ropa[6];
        nuevas[0] = new Ropa("Camisa", "Algodon");
        nuevas[1] = new Ropa("Pantalon", "Jean");
        nuevas[2] = new Ropa("Camisa", "Seda");
        nuevas[3] = new Ropa("Chaqueta", "Lana");
        nuevas[4] = new Ropa("Short", "Algodon");
        nuevas[5] = new Ropa("Vestido", "Seda");

        
        ropero.adicionarPrendas(nuevas, 5);
        ropero.mostrarMaterial("Algodon");
        System.out.println();
        ropero.mostrarTipo("Camisa");
        System.out.println();

        
        // c) Eliminar prendas de material "Algodón" y tipo "Camisa"
        System.out.println("c) Eliminando prendas de material Algodon");
        ropero.eliminarPorMaterial("Algodon");
        System.out.println("c) Eliminando prendas de tipo Camisa");
        ropero.eliminarPorTipo("Camisa");
        System.out.println();

        // d) Mostrar prendas DESPUÉS de eliminar
        System.out.println("d) Mostrando prendas DESPUES de eliminar");
        ropero.mostrarMaterial("Algodon");
        System.out.println();
        ropero.mostrarTipo("Camisa");
    }
}
