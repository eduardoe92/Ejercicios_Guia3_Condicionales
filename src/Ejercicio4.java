/*
Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 */
import java.util.Scanner;

public class Ejercicio4 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       String palabra;
        System.out.println("Ingrese una palabra que inicie con A");
        palabra=leer.next();
        
        if ("A".equals(palabra.substring(0,1)) || "a".equals(palabra.substring(0,1)))
            System.out.println("La palabra inicia con A");
        else
            System.out.println("Error, la palabra no empieza con A");
    }
    
}
