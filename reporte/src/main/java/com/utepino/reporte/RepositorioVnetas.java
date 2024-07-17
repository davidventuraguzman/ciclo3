/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utepino.reporte;

/**
 *
 * @author David
 */
import java.util.ArrayList;
import java.util.List;

public class RepositorioVnetas {
    
    private List<Venta> ventas;

    public RepositorioVnetas() {
        this.ventas = new ArrayList<>();
    }

    public void agregarVenta(Venta venta) {
        this.ventas.add(venta);
    }

    public List<Venta> obtenerVentas() {
        return this.ventas;
    }
}

    

