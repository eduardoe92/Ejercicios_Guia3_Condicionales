//Crear un programa que dado un número determine si es par o impar.
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
          int num;
        System.out.println("Ingrese un número para saber si es par o impar");
      
        num=leer.nextInt();

        if (num % 2 == 0){
            System.out.println("Tú número es par");
        }  else {
            System.out.println("Tú número es impar");
        }
    }    
    }