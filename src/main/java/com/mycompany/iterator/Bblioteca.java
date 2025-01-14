/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iterator;

/**
 *
 * @author lopez
 */
import java.util.*;
import java.util.Iterator;


public class Bblioteca implements Iterable<Libro> {

   private List<Libro> libros;

    public Bblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public Iterator<Libro> iterator() {
        return libros.iterator(); 
    }
}
