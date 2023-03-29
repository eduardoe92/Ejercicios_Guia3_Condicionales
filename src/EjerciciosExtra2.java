/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
import java.util.Scanner;

public class EjerciciosExtra2 {

     public static void main(String[] args) {
       
         Scanner leer = new Scanner(System.in);
         int variable1, variable2, variable3, variable4, aux;
         System.out.println("Declara 4 variables de tipo Entero");
            variable1=leer.nextInt();
            variable2=leer.nextInt();
            variable3=leer.nextInt();
            variable4=leer.nextInt();
         
            System.out.println("");        
            System.out.println("Las variables declaradas son: ");
            System.out.println("A = " +variable1);
            System.out.println("B = " +variable2);
            System.out.println("C = " +variable3);
            System.out.println("D = " +variable4);
            System.out.println("");
         
            aux=variable2;
            variable2 = variable3;
            variable3 = variable1;
            variable1 = variable4;
            variable4 = aux;

            System.out.println("Las variables invertidas quedaría asi:");
            System.out.println("A = " +variable1);
            System.out.println("B = " +variable2);
            System.out.println("C = " +variable3);
            System.out.println("D = " +variable4);
         
         
    }
    
}
