/**
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */

import java.util.Scanner;

public class EjercicioGuia4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
      
        int num, suma = 0 ;
        
        for (int i = 1 ; i <= 20 ; i++){
        System.out.print("Ingresar números aleatorios: ");
            num = leer.nextInt();
        
                if (num == 0) {
                System.out.println("Se capturó el número cero");
                break;
    }
                if (num > 0 ) {
                    suma += num;
           }
      }
    System.out.println("La cantidad de números positivos ingresados dan una suma de: " +suma);
}
}
       
    
