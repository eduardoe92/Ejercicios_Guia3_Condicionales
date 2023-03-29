/*
Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.
 */

import java.util.Scanner;

public class EjerciciosExtra11 {
    
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un número, para saber cuantos dígitos lo componen: ");
        int num = (int) leer.nextInt();
        int contador = 0;
        while (num != 0) {
            num = num / 10;
            contador++;
        }
        if (contador==1){
        System.out.println("El número ingresado se compone de: " +contador+ " digito.");
        }else System.out.println("El número ingresado se compone de: " +contador+ " digitos.");
    }
    
}
