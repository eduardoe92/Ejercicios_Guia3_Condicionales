/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese un número positivo");
        int limite=leer.nextInt();
        
        int suma=0;
        int numero;
        
        do{
            System.out.println("Ahora ingrese uno o varios números hasta superar el primer valor");
            numero = leer .nextInt();
            suma += numero;
           
         
        }while (suma < limite );
            System.out.println("Los números ingresados han superado el primer valor, con un total de:" +suma);  
        }
}

