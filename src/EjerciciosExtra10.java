/*
Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */

import java.util.Scanner;

public class EjerciciosExtra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("---Adivina el resultado---");
        
        int randomNum1 = (int) Math.floor(Math.random() * 11);
        int randomNum2 = (int) Math.floor(Math.random() * 11);
        int respuesta;
        do {
            System.out.println("¿Cúal es el resultado de la multiplicación? ");
            System.out.print(randomNum1+" x "+randomNum2+ " = ");
            respuesta=leer.nextInt();
            if (respuesta == randomNum1*randomNum2){
                System.out.println("Has adivinado el resultado");
            }else{
                System.out.println("Oh! Respuesta incorrecta");
                System.out.println("Intentalo de nuevo");
            }                
        }while (respuesta != randomNum1 * randomNum2);
  }
}
