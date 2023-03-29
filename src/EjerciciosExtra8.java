/*
 Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 */
import java.util.Scanner;

public class EjerciciosExtra8 {

      public static void main(String[] args) {
       
          Scanner leer = new Scanner(System.in);

    System.out.println("Ingrese numeros enteros");
    System.out.println("Si el número ingresado es multiplo de 5 se detendrá la lectura");
    int contador=0, numPares=0, numImpar=0;
    
    while (true){
                    int num = leer.nextInt();
                    if (num>0){
                    contador ++;
                    
                    if (num % 2 == 0) {
                        numPares ++; 
                     }else {
                        numImpar ++;}
                     if (num % 5 == 0) {
                     System.out.println("El numero " + num + " es multiplo de 5. Se detiene la lectura.");
                     break;
                     } 
            }
      }   
              System.out.println("La cantidad de números positivos agregados fue: " +contador);
              System.out.println("La cantidad de números positivos pares agregados fue: " +numPares);
              System.out.println("La cantidad de números positivos impares agregados fue: " +numImpar);
  }
}