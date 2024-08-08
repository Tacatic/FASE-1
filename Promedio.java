import java.util.Scanner;

/**
* Esta es la clase Promedio que se encarga de calcular
* el promedio de cuatro examenes
* @author David Soc
* @since 2024-08-02
*/

public class Promedio{

/**
* Metodo principal de la clase que se encarga de 
* calcular el promedio de cuatro examenes
* @param args que representan un listado de valores al momento de ejecutar el programa
* @author David Soc
* @since 2024-08-02
*/

public static void main(String [] args){
// Declaramos los comandos con double en caso de que hayan decimales.
Scanner scan = new Scanner(System.in);
double primerNota,segundaNota,terceraNota,cuartaNota, notaFinal, resultado;

        // Leer las notas del usuario
        //Pedir que el usuario ingrese los cuatro examenes
        System.out.print("Ingrese la primera nota: ");
        primerNota = scan.nextInt();

        System.out.print("Ingrese la segunda nota: ");
        segundaNota = scan.nextInt();

        System.out.print("Ingrese la tercera nota: ");
        terceraNota = scan.nextInt();
        System.out.print("Ingrese la cuarta nota: ");
        cuartaNota = scan.nextInt();
        
resultado = primerNota + segundaNota + terceraNota + cuartaNota;

notaFinal = resultado / 4;

System.out.println("El promedio es: " + notaFinal);
}

}