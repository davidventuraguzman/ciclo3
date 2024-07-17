/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.utepino.reporte;

public class Reporte {


    public static void main(String[] args) {
       RepositorioVnetas repositorio = new  RepositorioVnetas();
        repositorio.agregarVenta(new Venta(1, "Producto ", 10, 15.5, "2024-07-16", "Cliente 1"));
        repositorio.agregarVenta(new Venta(2, "Producto ", 5, 20.0, "2024-07-16", "Cliente 2"));
        repositorio.agregarVenta(new Venta(3, "Producto ", 7, 30.0, "2024-07-16", "Cliente 3"));
        repositorio.agregarVenta(new Venta(4, "Producto ", 3, 25.0, "2024-07-16", "Cliente 4"));
        repositorio.agregarVenta(new Venta(5, "Producto ", 8, 12.0, "2024-07-16", "Cliente 5"));
        repositorio.agregarVenta(new Venta(6, "Producto ", 2, 40.0, "2024-07-16", "Cliente 6"));
        repositorio.agregarVenta(new Venta(7, "Producto ", 1, 50.0, "2024-07-16", "Cliente 7"));
        repositorio.agregarVenta(new Venta(8, "Producto ", 9, 22.0, "2024-07-16", "Cliente 8"));
        repositorio.agregarVenta(new Venta(9, "Producto ", 4, 18.0, "2024-07-16", "Cliente 9"));
        repositorio.agregarVenta(new Venta(10, "Producto ", 6, 35.0, "2024-07-16", "Cliente 10"));

        RepositorioVentas reporte = new RepositorioVentas(repositorio);
        reporte.generarReporteHTML("reporte.html");
    }
}
        
        
        
  

