/**
Considera que estás desarrollando una web para una empresa que fabrica
motores (suponemos que se trata del tipo de motor de una bomba para mover
fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese un valor
entre 1 y 4.
* El programa debe mostrar lo siguiente:
1.- Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es
una bomba de agua”.
2.- Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es
una bomba de gasolina”.
3.- Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es
una bomba de hormigón”.
4.- Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es
una bomba de pasta alimenticia”.
5.- Si no se cumple ninguno de los valores anteriores mostrar el mensaje
“No existe un valor válido para tipo de bomba”
 */

import java.util.Scanner;

public class EjercicioGuia2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingresa un valor para saber que tipo de bomba tienes");
        int tipoMotor = leer.nextInt();
        
        switch (tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de Agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de Gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de Hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de Pasta Alimenticia");
                break;
            default:
                System.out.println("El valor ingresado es inválido");
        }
        
        
        
        
    }

}