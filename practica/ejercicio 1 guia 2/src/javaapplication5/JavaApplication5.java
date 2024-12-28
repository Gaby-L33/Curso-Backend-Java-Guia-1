//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
//El programa deberá después mostrar el resultado de la suma
package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {

    public static void main(String[] args) {
        int resultado, numero1,numero2;
        String num1, num2;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        num1 = leer.next();
        
        System.out.println("Ingrese un numero");
        num2 = leer.next();
        
        numero1= Integer.parseInt(num1);
        numero2= Integer.parseInt(num2);
        
        resultado= numero1 + numero2;
        
        System.out.println("El Resultado de la suma es " + resultado);
        
    
}
    
}
