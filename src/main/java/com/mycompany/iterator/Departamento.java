/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iterator;

/**
 *
 * @author lopez
 */
import java.util.Iterator;
import java.util.*;

public class Departamento implements Iterable<Empleados> {

    private String nombre;
    private List<Empleados> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarEmpleado(Empleados empleado) {
        empleados.add(empleado);
    }

    @Override
    public Iterator<Empleados> iterator() {
        return empleados.iterator();
    }
}

