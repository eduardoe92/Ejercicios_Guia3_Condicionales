/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
 */

import java.util.Scanner;
public class EjerciciosExtra4 {

      public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
          System.out.println("Ingrese un número del 1 a 10");
          int num = leer.nextInt();
          
          if (num>=1 || num <=10){
                    switch(num){
                            case 1: 
                                System.out.println("El número ingresado en romano es I");
                                break;
                            case 2:
                                System.out.println("El número ingresado en romano es II");
                                break;
                            case 3:
                                System.out.println("El número ingresado en romano es III");
                                break;
                            case 4:
                                System.out.println("El número ingresado en romano es IV");
                                break;
                            case 5:
                                System.out.println("El número ingresado en romano es V");
                                break;
                            case 6:
                                System.out.println("El número ingresado en romano es VI");
                                break;
                            case 7:
                                System.out.println("El número ingresado en romano es VII");
                                break;
                            case 8:
                                System.out.println("El número ingresado en romano es VIII");
                                break;
                            case 9:
                                System.out.println("El número ingresado en romano es IX");
                                break;
                            case 10:
                                System.out.println("El número ingresado en romano es X");
                                break;            
              }
          } else if (num <= 0 || num >= 11){
          
              System.out.println("Número ingresado no válido");
      }
          
    }
    
}
