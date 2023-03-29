/**
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */

import java.util.Scanner;

public class EjercicioGuia3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
      
        double nota;
        
            do {
                System.out.print("Ingresa una nota entre 0 y 10: ");
                nota = leer.nextDouble();        
                
                 if (nota<0 || nota >10) 
                    System.out.println("Valor ingresado incorrecto");
            }while (nota<0 || nota >10);
        }    
}