/*
Una obra social tiene tres clases de socios:
1.- Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
2.- Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
3.- Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
4.- Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
 */
import java.util.Scanner;

public class EjerciciosExtra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tu clase de socio correspondiente (A, B, C)");
        String clase = leer.next();
        clase=clase.toUpperCase();
        System.out.println("Ingrese el monto de tu tratamiento");
        int monto = leer.nextInt();
        System.out.println("");
        
        switch (clase) {
                case "A":
                    monto = (monto*50)/100;
                    System.out.println("Correspondes a la clase A, tienes un 50% de descuento");
                    System.out.println("Tu tratamiento quedaría en: " +monto+ "$ pesos");
                    break;
                case "B":
                    monto = (monto*35)/100;
                    System.out.println("Correspondes a la clase B, tienes un 35% de descuento");
                    System.out.println("Tu tratamiento quedaría en: " +monto+ "$ pesos");
                    break;
                case "C":
                    System.out.println("Correspondes a la clase C, actualmente no recibes descuentos en tu tratamiento");
                    break;
                default:
                    System.out.println("Clase ingresada erronea");
         }    
      }       
   }
