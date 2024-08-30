/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utepino.proyectofinalll;

/**
 *
 * @author David
 */
import java.util.ArrayList;
public class Usuario {
      private String nombre;
    private String id;
    private ArrayList<Libro> librosPrestados;

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void prestarLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
    }

    @Override
    public String toString() {
        return "Usuario" + "nombre ='" + nombre + '\'' +", id='" + id + '\'' + ", libros Prestados =" + librosPrestados + '}';
    }
}
