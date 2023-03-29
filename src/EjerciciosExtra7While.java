/*
Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Versión usando el bucle “While”.
 */
import java.util.Scanner;

public class EjerciciosExtra7While {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a ingresar: ");
        int cantidadNumeros = leer.nextInt();

        int contador = 1;
        double sumaNumeros = 0;
        double valorMaximo = Double.MIN_VALUE;
        double valorMinimo = Double.MAX_VALUE;

        while (contador <= cantidadNumeros) {
            System.out.print("Ingrese el número #" + contador + ": ");
            double numero = leer.nextDouble();

            sumaNumeros += numero;

            if (numero > valorMaximo) {
                valorMaximo = numero;
            }

            if (numero < valorMinimo) {
                valorMinimo = numero;
            }

            contador++;
        }

        double promedioNumeros = sumaNumeros / cantidadNumeros;

        System.out.println("El valor máximo es: " + valorMaximo);
        System.out.println("El valor mínimo es: " + valorMinimo);
        System.out.println("El promedio de los números ingresados es: " + promedioNumeros);
    }
}
