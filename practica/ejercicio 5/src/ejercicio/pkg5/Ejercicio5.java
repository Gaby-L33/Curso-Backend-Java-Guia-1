/*
 Escribir un programa que lea un número entero por teclado 
 y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
 Nota: investigar la función Math.sqrt().
 */

package ejercicio.pkg5;

import static java.lang.Math.sqrt;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, doble, triple;
        double raiz;
        String num;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num = leer.next();

        numero = Integer.parseInt(num);

        doble = numero * 2;
        triple = numero * 3;
        raiz = sqrt(numero);

        System.out.print("El doble de " + numero);
        System.out.print(" es " + doble);
        System.out.print(", el triple es " + triple);
        System.out.println(" y su raiz cuadrada es " + raiz);

        
    }
    
}
