/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utepino.proyectofinalll;

/**
 *
 * @author David
 */
public class Libro {
     private String titulo;
    private String autor;
    private String codigo;
    private boolean prestado;

    public Libro(String titulo, String autor, String codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean esPrestado() {
        return prestado;
    }

    public void prestar() {
        this.prestado = true;
    }

    public void devolver() {
        this.prestado = false;
    }

    @Override
    public String toString() {
        return "Libro " + "titulo ='" + titulo + '\'' +", autor ='" + autor + '\'' + ", codigo ='" + codigo + '\'' +", prestado =" + prestado +'}';
    }
}
