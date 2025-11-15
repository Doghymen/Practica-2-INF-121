/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercico2;

/**
 *
 * @author Doghy
 */
public class Principal {

    public static void main(String[] args) {
        Departamento dep1 = new Departamento("Recursos Humanos", "Administracion", 10);
        Departamento dep2 = new Departamento("Informatica", "Backend", 10);

        Empleado e1 = new Empleado("Ana Lopez", "Analista", 3500);
        Empleado e2 = new Empleado("Carlos Perez", "Coordinador", 4200);
        Empleado e3 = new Empleado("Maria Ruiz", "Asistente", 3000);
        Empleado e4 = new Empleado("Jorge Gomez", "Especialista", 4600);
        Empleado e5 = new Empleado("Luis Fernando", "Tecnico", 3200);

        dep1.agregarEmpleado(e1);
        dep1.agregarEmpleado(e2);
        dep1.agregarEmpleado(e3);
        dep1.agregarEmpleado(e4);
        dep1.agregarEmpleado(e5);

        System.out.println("============ B) Mostrar Empleado ============");
        dep1.mostrarEmpleados();
        dep2.mostrarEmpleados();

        System.out.println("======= C) Cambio Salario Departamento Espesifico =======");
        dep1.cambioSalario(200);
        dep1.mostrarEmpleados();

        System.out.println("============ D) Algun empleado de dep1 pertenece al dep2 ? ============");
        boolean pertenece = false;
        for (int i = 0; i < dep1.getCont(); i++) {
            if (dep2.tieneEmpleado(dep1.getEmpleados()[i])) {
                pertenece = true;
                break;
            }
        }

        if (pertenece) {
            System.out.println("Existe uno o mas empleados del dep1 pertenece a dep2");
        } else {
            System.out.println("No existe ningun empleado");
        }

        System.out.println("============ E) Moviendo Empleados al DEP2 ============");
        dep1.moverEmpleados(dep2);
        dep1.mostrarEmpleados();
        dep2.mostrarEmpleados();
    }
}
