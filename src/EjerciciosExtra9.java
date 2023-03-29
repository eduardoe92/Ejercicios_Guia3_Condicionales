/*
 Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
¿Aún no lo entendiste? Recomendamos googlear división con restas
sucesivas.
 */

import java.util.Scanner;

public class EjerciciosExtra9 {
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Obtener el Cociente y Residuo dado dos números enteros");
        System.out.print("Ingrese el Dividendo: ");
        int num1=(int) leer.nextInt();
        System.out.print("Ingrese el Divisor: ");
        int num2=(int) leer.nextInt();
        int cociente = 0;
        int residuo = 0;
        
        while (num1>=num2){
            num1-=num2;
            cociente ++;
        }
           residuo = num1;
              
        System.out.println("El cociente del número ingresado es: " +cociente+ ".");
        System.out.println("El residuo del número ingresado es: " +residuo+ ".");
        
    }
    
}
