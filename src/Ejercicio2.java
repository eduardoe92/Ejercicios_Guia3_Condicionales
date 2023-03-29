/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
*/

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String palabra;        
        
        System.out.println("Adivina la palabra secreta");
        palabra = leer.next();
        
        palabra = palabra.toLowerCase();
        
        if ("eureka".equals(palabra)) {
            System.out.println("Has adivinado la palabra secreta");
        }else {
            System.out.println("No has acertado la palabra secreta");
        }       
    }
    }