/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author Doghy
 */
public class Principal {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("TechSoft", 10);

        // a)
        empresa.agregarEmpleado(new Empleado("Juan", "Programador", 3500));
        empresa.agregarEmpleado(new Empleado("Ana", "FrondEnd", 3200));
        empresa.agregarEmpleado(new Empleado("Luis", "Gerente", 5000));

        // b)
        empresa.mostrarEmpresa();

        // c)
        Empleado buscado = empresa.buscarEmpleado("Ana");
        if (buscado != null) {
            System.out.println("\nEmpleado encontrado: " + buscado);
        } else {
            System.out.println("\nEmpleado no encontrado.");
        }

        // d)
        boolean eliminado = empresa.eliminarEmpleado("Juan");
        System.out.println("\nJuan eliminado? " + eliminado);

        empresa.mostrarEmpresa();

        // e)
        System.out.println("\nPromedio salarial: " + empresa.promedioSalarial());

        // Empleados con salario mayor a X
        empresa.listarSalarioMayorA(3300);
    }
}
