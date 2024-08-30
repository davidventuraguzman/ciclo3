/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.utepino.proyectofinalll;

/**
 *
 * @author David
 */
import java.util.Scanner;
public class Proyectofinalll {   
    private static bibloteca biblioteca = new bibloteca();
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        
        int opcion = 0;
        do {            
            mostrarMenu();
            opcion = lector.nextInt();
            lector.nextLine();
            
            switch  (opcion) {
                case 1:
                    agregarLibro(lector);
                    break;
                case 2:
                    registrarUsuario(lector);
                    break;
                case 3:
                    prestarLibro(lector);
                    break;
                case 4:
                    devolverLibro(lector);
                    break;
                case 5:
                    biblioteca.mostrarCatalogo();
                    break;
                case 6:
                    biblioteca.mostrarUsuarios();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                      System.out.println("Opción no válida");  
            }
            
        } while (opcion !=0);
        lector.close();
    }
    private static void mostrarMenu() {
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1.- Agregar libro");
        System.out.println("2.- Registrar usuario");
        System.out.println("3.- Prestar libro");
        System.out.println("4.- Devolver libro");
        System.out.println("5.- Mostrar catálogo");
        System.out.println("6.- Mostrar usuarios");
        System.out.println("0.- Salir");
        System.out.println("Elija una opción: ");
    }
    private static void agregarLibro(Scanner lector) {
        System.out.print("Ingrese el título del libro: ");
        String titulo = lector.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = lector.nextLine();
        System.out.print("Ingrese el codigo del libro: ");
        String codigo = lector.nextLine();
        
        Libro libro = new Libro(titulo, autor, codigo);
        biblioteca.agregarLibro(libro);
        System.out.println("Libro agregado con éxito");
    }
    private static void registrarUsuario(Scanner lector) {
        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = lector.nextLine();
        System.out.print("Ingrese el ID del usuario: ");
        String id = lector.nextLine();
        
        Usuario usuario = new Usuario(nombre, id);
        biblioteca.registrarUsuario(usuario);
        System.out.println("Usuario registrado con éxito.");
}
    private static void prestarLibro(Scanner lector) {
        System.out.print("Ingrese el ID del usuario: ");
        String userId = lector.nextLine();
        System.out.print("Ingrese el codigo del libro: ");
        String codigo = lector.nextLine();
        
        biblioteca.prestarLibro(userId, codigo);
    }
    private static void devolverLibro(Scanner scanner) {
        System.out.print("Ingrese el ID del usuario: ");
        String userId = scanner.nextLine();
        System.out.print("Ingrese el codigo del libro: ");
        String codigo = scanner.nextLine();
        
        biblioteca.devolverLibro(userId, codigo);                         
    }
}
