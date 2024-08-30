/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.utepino.productoo;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Productoo {

 private String nombre;
 private double precio;
 private int cantidadEnStick;
 protected String codigo;

    public Productoo(String nombre, double precio, int cantidadEnStick, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStick = cantidadEnStick;
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnStick() {
        return cantidadEnStick;
    }

    public void setCantidadEnStick(int cantidadEnStick) {
        this.cantidadEnStick = cantidadEnStick;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Productoo{" + "nombre=" + nombre + ", precio=" + precio + ", cantidadEnStick=" + cantidadEnStick + ", codigo=" + codigo + '}';
    }
 
    protected void mostrarInfoProducto (){
        
        JOptionPane.showMessageDialog(null, "\n-Nombre= " + nombre + "\n-Precio= " + precio + "\n-CantidadEnStick= " + cantidadEnStick + "\n-Codigo= " + codigo);
            
    }      
}
