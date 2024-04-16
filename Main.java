//Estructuras de Condicionales dobles  

Condicionalesdobleimport java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int opcion;
        System.out.println("Elije una opción:");
        System.out.println(" 1 "+ " Para que ingreses un número");
        System.out.println(" 2 "  + " Leer un texto");
        opcion = a.nextInt();
        if (opcion == 1) {
            System.out.println("Ingresa tu edad");
            int num = a.nextInt();
            System.out.println("Tu tienes " + num + " años");
        } else {
            if (opcion == 2) {
                System.out.println("Ingresa tu nombre completo");
                String var = a.next();
                System.out.println("Tu nombre es: " + var);
            } else {
                System.out.println("Que no sabes leer??");
            }
        }
    }
}

