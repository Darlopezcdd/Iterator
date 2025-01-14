/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.iterator;

/**
 *
 * @author lopez
 */
public class Iterator {

    public static void main(String[] args) {

        Departamento departamento1 = new Departamento("Contabilidad");
        Departamento departamento2 = new Departamento("Sistemas");

        departamento1.agregarEmpleado(new Empleados("Henrry Moreta", "Administrador"));
        departamento1.agregarEmpleado(new Empleados("Carlos Guerrero", "Gerente"));

        departamento2.agregarEmpleado(new Empleados("Anjelo Hernandez", "Desarrollador"));
        departamento2.agregarEmpleado(new Empleados("Dario Lopez", "Gerente"));

        System.out.println("Empleados en el departamento de " + departamento1.getNombre() + ":");
        for (Empleados empleado : departamento1) {
            System.out.println("Nombre: " + empleado.getNombre() + ", Puesto: " + empleado.getPuesto());
        }

        System.out.println("\nEmpleados en el departamento de " + departamento2.getNombre() + ":");
        for (Empleados empleado : departamento2) {
            System.out.println("Nombre: " + empleado.getNombre() + ", Puesto: " + empleado.getPuesto());
        }
    }
}
