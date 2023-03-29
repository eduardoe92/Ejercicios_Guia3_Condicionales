/**
Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
 */

import java.util.Scanner;

public class EjercicioGuia1 {

    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
                
        System.out.println("Ingrese dos número para evaluar si es mayor a 25");
        int num1= leer.nextInt();
        int num2=leer.nextInt();
        
        if (num1>=25){
            System.out.println("El primer número es mayor o igual a 25");
        }else
            System.out.println("El primer número es menor a 25");
        if (num1>=25){
            System.out.println("El primer segundo es mayor o igual a 25");
        }else 
            System.out.println("El segundo número es menor a 25");
        
            
        
    }

}