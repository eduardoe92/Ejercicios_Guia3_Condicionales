/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */

import java.util.Scanner;

public class EjerciciosExtra6 {

 public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas: ");
        int cantidadPersonas = leer.nextInt();

        double sumaEstaturas = 0;
        double cantidadEstaturasMenores = 0;
        double sumaEstaturasMenores = 0;

        for (double i = 1; i <= cantidadPersonas; i++) {
                    System.out.print("Ingrese la estatura de la persona " + i + " en metros: ");
                    double estatura = leer.nextDouble();

                    sumaEstaturas += estatura;

                                if (estatura < 1.6) {
                                    cantidadEstaturasMenores++;
                                    sumaEstaturasMenores += estatura;
                    }
                }

        double promedioEstaturas = sumaEstaturas / cantidadPersonas;
        double promedioEstaturasMenores = 0;

        if (cantidadEstaturasMenores > 0) {
            promedioEstaturasMenores = sumaEstaturasMenores / cantidadEstaturasMenores;
        }

        System.out.println("Promedio de estaturas en general: " + promedioEstaturas + " metros");
        System.out.println("Promedio de estaturas por debajo de 1.60 m es: " + promedioEstaturasMenores + " metros");
    }
}