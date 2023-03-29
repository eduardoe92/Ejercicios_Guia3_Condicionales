/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */

import java.util.Scanner;

public class EjerciciosExtra14 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Familias a evaluar");
        int numFami = leer.nextInt();
        int contadorEdades=0;
        int contadorHijos=0;
        
        
        for (int i=1; i<=numFami; i++ ){
            System.out.println("");
            System.out.println("===========================================");
            System.out.println("");
            System.out.println("Ingrese la cantidad de hijos que hay en la familia " +i);
            int numHijos = leer.nextInt();
            for (int j=1; j<=numHijos; j++){
                System.out.println("Ingrese las edades del hijo " +j+ " de la familia " +i);
                int numEdades=leer.nextInt();
                contadorEdades=numEdades+contadorEdades;
                contadorHijos++;
            }
        }
    int promedio;
        System.out.println("Edad=" +contadorEdades);
        System.out.println("Hijos= " +contadorHijos);
    promedio=contadorEdades/contadorHijos;
        System.out.println("El promedio de edades de todos los hijos es: " +promedio);
                
    }
 }


