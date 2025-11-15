/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author Doghy
 */
public class Empresa {

    private String nombre;
    private Empleado[] empleados;
    private int contador;

    public Empresa(String nombre, int capacidad) {
        this.nombre = nombre;
        this.empleados = new Empleado[capacidad];
        this.contador = 0;
    }

    // a)
    public void agregarEmpleado(Empleado e) {
        if (contador < empleados.length) {
            empleados[contador] = e;
            contador++;
        } else {
            System.out.println("No hay espacio para mas empleados.");
        }
    }

    // b)
    public void mostrarEmpresa() {
        System.out.println("Empresa: " + nombre);
        System.out.println("Lista de empleados:");
        for (int i = 0; i < contador; i++) {
            System.out.println(" - " + empleados[i]);
        }
    }

    // c)
    public Empleado buscarEmpleado(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (empleados[i].getNombre().equalsIgnoreCase(nombre)) {
                return empleados[i];
            }
        }
        return null;
    }

    // d)
    public boolean eliminarEmpleado(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (empleados[i].getNombre().equalsIgnoreCase(nombre)) {

                for (int j = i; j < contador - 1; j++) {
                    empleados[j] = empleados[j + 1];
                }

                empleados[contador - 1] = null;
                contador--;
                return true;
            }
        }
        return false;
    }

    // e)
    public double promedioSalarial() {
        if (contador == 0) {
            return 0;
        }

        double suma = 0;
        for (int i = 0; i < contador; i++) {
            suma += empleados[i].getSalario();
        }
        return suma / contador;
    }

    public void listarSalarioMayorA(double valor) {
        System.out.println("Empleados con salario mayor a " + valor + ":");
        for (int i = 0; i < contador; i++) {
            if (empleados[i].getSalario() > valor) {
                System.out.println(empleados[i]);
            }
        }
    }
}
