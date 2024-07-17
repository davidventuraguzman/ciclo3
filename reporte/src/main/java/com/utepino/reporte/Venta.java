/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utepino.reporte;

/**
 *
 * @author David
 */
public class Venta {
    private int id;
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private String fecha;
    private String cliente;

    public Venta(int id, String producto, int cantidad, double precioUnitario, String fecha, String cliente) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public double getTotal() {
        return this.cantidad * this.precioUnitario;
    }

    // Getters y setters
    public int getId() { return id; }
    public String getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
    public double getPrecioUnitario() { return precioUnitario; }
    public String getFecha() { return fecha; }
    public String getCliente() { return cliente; }

    public void setId(int id) { this.id = id; }
    public void setProducto(String producto) { this.producto = producto; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public void setPrecioUnitario(double precioUnitario) { this.precioUnitario = precioUnitario; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public void setCliente(String cliente) { this.cliente = cliente; }
}

    

