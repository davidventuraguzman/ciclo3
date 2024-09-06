
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        String input2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
        double numero1 = Double.parseDouble(input1);
        double numero2 = Double.parseDouble(input2);


        int eleccion = Integer.parseInt(JOptionPane.showInputDialog("""
                    "Elegi una opcion"
                    -1 Suma
                    -2 Resta
                    -3 Multiplicacion
                    -4 Division
                """));
    Operacion operacion = null;

        switch (eleccion) {
            case 0:
                operacion = new Suma(numero1, numero2);
                break;
            case 1:
                operacion = new Resta(numero1, numero2);
                break;
            case 2:
                operacion = new Multiplicacion(numero1, numero2);
                break;
            case 3:
                operacion = new Division(numero1, numero2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operación no válida");
                System.exit(0);
        }
        double resultado = operacion.ejecutar();
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
}
