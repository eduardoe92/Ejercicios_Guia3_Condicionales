/**
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
17
 */

import java.util.Scanner;

public class EjercicioGuia5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int[] num = new int[4];
        
        //Leer los 4 números del usuario
        for (int i = 0; i < num.length; i++){
            do{ 
                    System.out.print("Ingrese un número aleatorios entre 1 y 20: ");
                    num[i] = leer.nextInt();

                    //Verificamos si es válido el número ingresado
                    if (num[i]<1 || num[i]>20){
                        System.out.println("El número ingresado no es válido");
                     } 
                 }while (num[i] < 1 || num[i]>20);
           }  
        //Imprimimos el número con los asteriscos
      for (int numero : num){
          System.out.print(numero+ ": ");
          
          for (int i=0; i<numero; i++){
              System.out.print("*");
          }
          //Realizamos el salto de linea
          System.out.println();
      }       
    }
}