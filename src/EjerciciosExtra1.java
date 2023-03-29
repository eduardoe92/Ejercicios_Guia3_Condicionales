/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */

import java.util.Scanner;
public class EjerciciosExtra1 {
   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num;
        float  minutos;
        
        System.out.println("Bienvenido al convertidor de minutos!");
        System.out.println("Por favor ingrese un número para convertirlo a Dias y Horas");
        num = leer.nextInt();
        int dias = num / 1440; // 1440 minutos en un día
        int horas = (num % 1440) / 60; // 60 minutos en una hora
        int minutosRestantes = num % 60;
        System.out.println("Su número: " + num + "\nEn días, horas y minutos es: \n" + dias + " días y " + horas + " horas y " + minutosRestantes + " minutos\n");
    }
    
}
