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
           Bblioteca biblioteca = new Bblioteca();

   
        biblioteca.agregarLibro(new Libro("El Principito"));
        biblioteca.agregarLibro(new Libro("Cien Anios de Soledad"));
        biblioteca.agregarLibro(new Libro("Don Quijote"));

     
        for (Libro libro : biblioteca) {
            System.out.println("Titulo: " + libro.getTitulo());
        }
    }
}
