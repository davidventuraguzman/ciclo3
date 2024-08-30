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
import java.util.HashMap;
public class bibloteca {
    
    private ArrayList<Libro> catalogo;
    private HashMap<String, Usuario> usuarios;

    public bibloteca() {
        catalogo = new ArrayList<>();
        usuarios = new HashMap<>();
        inicializarLibros();
    }
    private void inicializarLibros() {
        catalogo.add(new Libro(" Boulevard", " Flor M. Salvador", " 123456"));
        catalogo.add(new Libro(" Los cinco continentes del amor", " Javier Ruescas Francesc Miralles", " 12345"));
        catalogo.add(new Libro(" Anónima", " Wendy Mora", " 1234"));
        catalogo.add(new Libro(" El día que dejo de nevar en Alaska", " Alice Kellen", " 123"));
        catalogo.add(new Libro(" Frankenstein", " Mary Shelly", " 12"));
    }
    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }

    public Usuario buscarUsuario(String id) {
        return usuarios.get(id);
    }

    public Libro buscarLibro(String codigo) {
        for (Libro libro : catalogo) {
            if (libro.getCodigo().equals(codigo)) {
                return libro;
            }
        }
        return null;
    }

    public void prestarLibro(String userId, String codigo) {
        Usuario usuario = buscarUsuario(userId);
        Libro libro = buscarLibro(codigo);
        if (usuario != null && libro != null && !libro.esPrestado()) {
            usuario.prestarLibro(libro);
            libro.prestar();
            System.out.println("Libro prestado con éxito.");
        } else {
            System.out.println("No se puede prestar el libro.");
        }
    }

    public void devolverLibro(String userId, String codigo) {
        Usuario usuario = buscarUsuario(userId);
        Libro libro = buscarLibro(codigo);
        if (usuario != null && libro != null && libro.esPrestado()) {
            usuario.devolverLibro(libro);
            libro.devolver();
            System.out.println("Libro devuelto con éxito.");
        } else {
            System.out.println("No se puede devolver el libro.");
        }
    }

    public void mostrarCatalogo() {
        for (Libro libro : catalogo) {
            System.out.println(libro);
        }
    }

    public void mostrarUsuarios() {
        for (Usuario usuario : usuarios.values()) {
            System.out.println(usuario);
        }
    }
}
