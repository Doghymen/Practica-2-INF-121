/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Doghy
 */
public class Ropero {

    private String material;
    private Ropa[] prendas;  // Tamaño fijo: 20
    private int nroRopas;

    // Constructor: capacidad fija de 20
    public Ropero(String material) {
        this.material = material;
        this.prendas = new Ropa[20];  // Tamaño EXACTO según el ejercicio
        this.nroRopas = 0;
    }

    // b) Adicionar N prendas
    public void adicionarPrendas(Ropa[] nuevasPrendas, int cantidad) {
        if (nuevasPrendas == null || cantidad <= 0) {
            return;
        }

        int agregadas = 0;
        for (int i = 0; i < cantidad && nroRopas < 20; i++) {
            if (nuevasPrendas[i] != null) {
                prendas[nroRopas++] = nuevasPrendas[i];
                agregadas++;
            }
        }
        if (nroRopas >= 20) {
            System.out.println("El ropero se encuentra lleno (capacidad: 20)");
        }
    }

    // c) Eliminar por material
    public void eliminarPorMaterial(String x) {
        if (x == null || nroRopas == 0) {
            return;
        }

        int cont = 0;
        for (int i = 0; i < nroRopas; i++) {
            if (prendas[i] != null && !prendas[i].getMaterial().equals(x)) {
                prendas[cont++] = prendas[i];
            }
        }
        for (int j = cont; j < nroRopas; j++) {
            prendas[j] = null;
        }
        nroRopas = cont;
    }

    // c) Eliminar por tipo
    public void eliminarPorTipo(String y) {
        if (y == null || nroRopas == 0) {
            return;
        }

        int cont = 0;
        for (int i = 0; i < nroRopas; i++) {
            if (prendas[i] != null && !prendas[i].getTipo().equals(y)) {
                prendas[cont++] = prendas[i];
            }
        }
        for (int j = cont; j < nroRopas; j++) {
            prendas[j] = null;
        }
        nroRopas = cont;
    }

    // d) Mostrar por material
    public void mostrarMaterial(String materialX) {
        if (materialX == null) {
            return;
        }

        boolean existe = false;
        System.out.println("Prendas de material => " + materialX);
        for (int i = 0; i < nroRopas; i++) {
            if (prendas[i] != null && prendas[i].getMaterial().equals(materialX)) {
                System.out.println(prendas[i]);
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("No hay prendas del material: " + materialX);
        }
    }

    // d) Mostrar por tipo
    public void mostrarTipo(String tipoY) {
        if (tipoY == null) {
            return;
        }

        boolean existe = false;
        System.out.println("Prendas de tipo => " + tipoY);
        for (int i = 0; i < nroRopas; i++) {
            if (prendas[i] != null && prendas[i].getTipo().equals(tipoY)) {
                System.out.println(prendas[i]);
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("No hay prendas del tipo: " + tipoY);
        }
    }
}
