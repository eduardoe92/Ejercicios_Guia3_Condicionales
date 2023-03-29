
import java.util.Scanner;
public class EjemploVideo1 {
    public static void main(String[] args) {
       
        int opinion;
        Scanner leer = new Scanner (System.in);
        System.out.println("Clasifique la pelicula de 1 a 5 estrellas");
        opinion = leer.nextInt();
        
        if (opinion >=1 && opinion <=5) {
            
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados que no hayas disfrutado la peli...");
                    break;
                case 3:
                    System.out.println("Has calificado la pelicula como buena");
                    break;
                case 4:
                    System.out.println("Has calificado la pelicula como muy buena");
                    break;
                case 5:
                    System.out.println("Fantastico que hayas disfrutado una excelente pelicula"); 
                    break;
            }
        }else if (opinion <0){
            System.out.println("¿Una calificación negativa? ¿Tan mala fue la pelicula?");
        }else if (opinion ==0){
            System.out.println("Calificación no válida para la evaluación");
        }else {
            System.out.println(opinion+"! Wow! Se te fue la mano con la calificacion! :D ");
        }
        System.out.println("¡Hasta la próxima!");
    }
}
