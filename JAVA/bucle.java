import java.util.Scanner;

public class bucle {
public static void main(String[] args) {
    Scanner lector = new Scanner(System.in); 
    System.out.println("Hello World!");
   int i=0;
   final int intento = 5;
   String contrav = "P@55w0rd";
    
   while (i < 5){
       System.out.println("Ingresa tu correo electronico");
       String correo = lector.next();
       
       if (correo.equalsIgnoreCase(("u23217169"))){
       System.out.print("Ingresa tu clave de acceso: ");
       String contra =lector.next();
  
           if(contra.equals (contrav)){
               System.out.println("Bienvenido al sistema");
               break;      
               
        }else{
           System.out.println("Acceso denegado");
           }
           
    }else{
           System.out.println("Acceso denegado");
       }
       
       i++;
}   
 if (i >= intento) {
        System.out.println("Cuenta suspendida");
    }  
}
}