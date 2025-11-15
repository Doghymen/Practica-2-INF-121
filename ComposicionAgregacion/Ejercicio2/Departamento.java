/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercico2;

/**
 *
 * @author Doghy
 */
public class Departamento {

    private String nombre;
    private String area;
    private Empleado[] empleados;
    private int cont;

    public Departamento(String nombre, String area, int capacidad) {
        this.nombre = nombre;
        this.area = area;
        this.empleados = new Empleado[capacidad];
        this.cont = 0;
    }

    public void agregarEmpleado(Empleado e) {
        if (cont < empleados.length) {
            empleados[cont] = e;
            cont++;
        }
    }

    public void mostrarEmpleados() {
        System.out.println("Departamento: " + nombre + " | Area: " + area);

        if (cont == 0) {
            System.out.println("No existen empleados en el departamento");
            return;
        }

        for (int i = 0; i < cont; i++) {
            System.out.println(" - " + empleados[i]);
        }
    }

    public void cambioSalario(double monto) {
        for (int i = 0; i < cont; i++) {
            double salarioNuevo = empleados[i].getSueldo() + monto;
            empleados[i].setSueldo(salarioNuevo);
        }
    }

    public boolean tieneEmpleado(Empleado e) {
        for (int i = 0; i < cont; i++) {
            if (empleados[i] == e) {
                return true;
            }
        }
        return false;
    }

    public void moverEmpleados(Departamento destino) {
        for (int i = 0; i < cont; i++) {
            destino.agregarEmpleado(empleados[i]);
            empleados[i] = null;
        }
        cont = 0;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public int getCont() {
        return cont;
    }
}
