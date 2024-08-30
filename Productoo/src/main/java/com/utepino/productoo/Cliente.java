/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utepino.productoo;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Cliente {
    
    private String nombree;
    private String direccion;
    private String telefono;

    public Cliente(String nombre, String direccion, String telefono) {
        this.nombree = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombree;
    }

    public void setNombre(String nombre) {
        this.nombree = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombree + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    protected void mostrarInfoCliente (){
            JOptionPane.showMessageDialog(null, "\n-Nombre: "+ nombree + "\n-Direccion: " + direccion + "\n-Telefono: " + telefono);
} 
}
