/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utepino.reporte;

/**
 *
 * @author David
 */
   
import java.io.FileWriter;
import java.io.IOException;


public class RepositorioVentas {

    private RepositorioVnetas repositorio;

    public RepositorioVentas(RepositorioVnetas repositorio) {
        this.repositorio = repositorio;
    }

    public void generarReporteHTML(String archivo) {
        try (FileWriter writer = new FileWriter(archivo)) {
            writer.write("<html><head><title>Ventas</title></head><body>");
            writer.write("<h1>Reporte de Ventas</h1>");
            writer.write("<table border='1'>");
            writer.write("<tr><th>ID</th><th>Producto</th><th>Cantidad</th><th>Precio Unitario</th><th>Fecha</th><th>Cliente</th><th>Total</th></tr>");

            for (Venta venta : repositorio.obtenerVentas()) {
                writer.write("<tr>");
                writer.write("<td>" + venta.getId() + "</td>");
                writer.write("<td>" + venta.getProducto() + "</td>");
                writer.write("<td>" + venta.getCantidad() + "</td>");
                writer.write("<td>" + venta.getPrecioUnitario() + "</td>");
                writer.write("<td>" + venta.getFecha() + "</td>");
                writer.write("<td>" + venta.getCliente() + "</td>");
                writer.write("<td>" + venta.getTotal() + "</td>");
                writer.write("</tr>");
            }

            writer.write("</table>");
            writer.write("</body></html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

