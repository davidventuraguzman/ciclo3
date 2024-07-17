

package com.utepino.pagina1;

import java.io.FileWriter;
import java.io.IOException;
public class Pagina1 {

 public static void main(String[] args) {
        
        pagina alumno1= new pagina();
        alumno1.setNombre("Carlos");
        alumno1.setFoto("Si presento");
        alumno1.setEdad(20);
        alumno1.setPc1(15);
        alumno1.setPc2(18);
        alumno1.setPc3(19);
        alumno1.setEf(13);
        System.out.println("######OBJETO ALUMNO 1######");
        System.out.println("Los datos son:"+alumno1.toString());
        System.out.println("EL promedio es: "+alumno1.Promedio() );
        System.out.println();
        
       pagina a = new pagina("25, es una wawita","Cristian Calderon ",12,15,12,19,16);
        System.out.println("######OBJETO ALUMNO 2######");
        System.out.println("Los datos son:"+a.toString());
        System.out.println("EL promedio es: "+a.Promedio() );
        System.out.println();
    
        String reporte = ReporteHTML(a);

        
        try (FileWriter archivo = new FileWriter("Prueba.html")) {
            archivo.write(reporte);
            System.out.println("Reporte HTML generado con exito...");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public static String ReporteHTML(pagina alumno) {
        return "<html>" +
                "<head>"
                
                + "<title>Prueba</title>"
                
                + "</head>" +
                "<body "
                + "bgcolor=white>" +
                "<h2>LISTA DE NOTAS DEL ESTUDIANTE</h2>" +
                "<img src='imagen/imagen2.jpeg' alt='Perfil' style=width:400px; height:400px;>"  +
                "<table border=1 style=color:blue;>"+
                "<tr>"+
                "<td> Nombre </td>" +
                "<td> Edad </td>"  +
                "<td> PC1 </td>"  +
                "<td> PC2 </td>"  +
                "<td> PC3 </td>"  +
                "<td> EF </td>" +
                "<td> Prom </td>" +
                "</tr>"+
                "<tr>"+
                "<td>"+alumno.getFoto()+"</td>"+
                "<td>"+alumno.getNombre()+"</td>"+
                "<td>"+alumno.getEdad()+"</td>"+
                "<td>"+alumno.getPc1()+"</td>"+
                "<td>"+alumno.getPc2()+"</td>"+
                "<td>"+alumno.getPc3()+"</td>"+
                "<td>"+alumno.getEf()+"</td>"+
                "<td>"+alumno.Promedio()+"</td>"+
               "</table>"+
                "</body>" +
                "</html>";
    } 
}
