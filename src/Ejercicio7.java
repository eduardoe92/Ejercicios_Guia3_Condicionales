/*
Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */

import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
        String INPUTUSER;
        int largo, validas, invalidas;
              
        Boolean IsEOF;
        IsEOF = true;
        validas = 0;
        invalidas = 0;
          
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("INPUT");
            INPUTUSER = leer.next();
            largo = INPUTUSER.length();
           
            if (largo > 5 || largo < 1) {
                invalidas = invalidas +1; 
            }else {
                if ("X".equals(INPUTUSER.substring(0,1)) && "O".equals(INPUTUSER.substring(4,5))){
              validas = validas + 1;
                }else {
                    invalidas= invalidas+1;
                }
            }
            if ("&&&&&".equals(INPUTUSER)) {
               IsEOF = false;
               invalidas=invalidas-1;
        }
        } while (IsEOF);       
        System.out.println("La cantidad de entradas correctas fue: " + validas);
        System.out.println("La cantidad de entradas incorrectas fue: " +invalidas);       
    }
    
}
