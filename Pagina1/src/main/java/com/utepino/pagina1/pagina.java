/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utepino.pagina1;


public class pagina {
    
     private String nombre,foto;
    private int edad,pc1,pc2,pc3,ef;  

    public pagina () {
    }
    
    public pagina(String nombre, String foto, int edad, int pc1, int pc2, int pc3, int ef) {
        this.nombre = nombre;
        this.foto = foto;
        this.edad = edad;
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.ef = ef;
    }

    public pagina(String nombre, String foto, int edad) {
        this.nombre = nombre;
        this.foto = foto;
        this.edad = edad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPc1() {
        return pc1;
    }

    public void setPc1(int pc1) {
        this.pc1 = pc1;
    }

    public int getPc2() {
        return pc2;
    }

    public void setPc2(int pc2) {
        this.pc2 = pc2;
    }

    public int getPc3() {
        return pc3;
    }

    public void setPc3(int pc3) {
        this.pc3 = pc3;
    }

    public int getEf() {
        return ef;
    }

    public void setEf(int ef) {
        this.ef = ef;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", foto=" + foto + ", edad=" + edad + ", pc1=" + pc1 + ", pc2=" + pc2 + ", pc3=" + pc3 + ", ef=" + ef;
    }
    
   
    public double Promedio(){
       return (double)(pc1+pc2+pc3+ef)/4;
    }

}
