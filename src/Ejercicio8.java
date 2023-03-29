/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:

*  *  *  *
*        *
*        *
*  *  *  *

 */

import java.util.Scanner;

public class Ejercicio8 {

       public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
           
           int lado;
           
           System.out.println("Ingrese el tamaño del cuadrado");
           lado = leer.nextInt();
           
           for (int a = 1; a <= lado; a++) {
               for (int b = 1; b <= lado; b++) { 
                   if (a > 1 && a < lado && b > 1 && b < lado) {
                   System.out.print("  ");
               } else {
                       System.out.print("* ");
                       }
               }System.out.println("");    
           }
    }
}
