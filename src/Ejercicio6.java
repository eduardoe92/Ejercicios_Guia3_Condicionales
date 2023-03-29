/*
Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir.
"Elija una opcion"

 */

import java.util.Scanner;
public class Ejercicio6 {
  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa dos números enteros positivos");
        System.out.print("Primer número: ");
        int num1=leer.nextInt();
        System.out.print("Segundo número: ");
        int num2=leer.nextInt();
        
        int suma = num1+num2;
        int resta = num1-num2;
        int multi = num1*num2;
        double divi = num1/num2;
        boolean salir;
        salir=true;
        
        do {
            System.out.println("");
            System.out.println("=====================");
            System.out.println("-----MENU-----");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir ");
            System.out.println("5.- Salir");
            System.out.println("=====================");
            
            int opcion = leer.nextInt();
        
            if (opcion >= 1 || opcion <=4) 
                switch (opcion) {
                        case 1:
                                System.out.println("La suma de los números es: ");
                                System.out.println(suma);
                                break;
                        case 2:
                                System.out.println("La resta de los números es: " +resta);
                                break;
                        case 3:
                                System.out.println("La multiplicacion de los números es: " +multi);
                                break;
                        case 4:
                                System.out.println("La división de los números es: " +divi);
                                break;
                        case 5:
                                System.out.println("¿Estás seguro que deseas salir? (S/N)");
                                String respuesta = leer.next();
                                if ("S".equals(respuesta) || "s".equals(respuesta)){
                                        salir=false;
                                         break;
                                          }
                                    break;
                        default:
                               System.out.println("Opción invalida");
                        } 
         }while (salir);
        System.out.println("Sesión finalizada");
     }
}
    
    

