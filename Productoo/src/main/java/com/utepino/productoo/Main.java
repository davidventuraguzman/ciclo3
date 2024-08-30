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

public class Main {
    
    public static void main(String[] args) {
        
        String nombree=JOptionPane.showInputDialog("Ingrese su nombre");
        String direccion=JOptionPane.showInputDialog("Ingrese su direccion");
        String telefono=JOptionPane.showInputDialog("Ingrese su telefono ");
        
       Cliente cliente = new Cliente(nombree,direccion,telefono);
        
        String nombre=JOptionPane.showInputDialog("Ingrese el nombre del producto");
        double precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
        int cantidadEnStick=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de stock"));
        String codigo = JOptionPane.showInputDialog("Ingrese el codigo del producto");
        
       Productoo producto = new Productoo(nombre,precio,cantidadEnStick,codigo);
       
       cliente.mostrarInfoCliente();
       producto.mostrarInfoProducto();
    }
}
