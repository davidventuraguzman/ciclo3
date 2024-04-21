import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        short opcion;
            System.out.println("Menú de opciones:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Potencia");
            opcion = lector.nextShort();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el primer número: ");
                    double num1 = lector.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    double num2 = lector.nextDouble();
                    double suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    System.out.print("Ingresa el primer número: ");
                    double num3 = lector.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    double num4 = lector.nextDouble();
                    double resta = num3 - num4;
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                    System.out.print("Ingresa el primer número: ");
                    double num5 = lector.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    double num6 = lector.nextDouble();
                    double multiplicacion = num5 * num6;
                    System.out.println("La multiplicación es: " + multiplicacion);
                    break;
                case 4:
                    System.out.print("Ingresa el primer número: ");
                    double num7 = lector.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    double num8 = lector.nextDouble();
                    double potencia  = Math.pow(num7,num8);
                    System.out.println("La multiplicación es: " + potencia);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
    }
}