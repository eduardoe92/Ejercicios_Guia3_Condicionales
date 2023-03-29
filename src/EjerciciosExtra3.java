/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 */
import java.util.Scanner;

public class EjerciciosExtra3 {

      public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
          
          System.out.println("Ingresa una letra para evaluar si es una vocal o no");
          String letra= leer.next();
          letra=letra.toUpperCase();
          
          if ("A".equals(letra) || "E".equals(letra) || "I".equals(letra) || "O".equals(letra) || "U".equals(letra)){
              System.out.println("La letra ingresada es una vocal");
          }else System.out.println("La letra ingresada no es una vocal");
    }
    
}
