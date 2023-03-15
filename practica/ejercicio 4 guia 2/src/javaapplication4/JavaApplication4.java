/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double grado;
      double farenheit;
     
          Scanner leer= new Scanner (System.in);
         System.out.println("ingrese los grados a convertir");
         grado= leer.nextDouble();
     //con cualquier tipo de dato al lado de next
         farenheit = 32 + (9 * grado / 5);
     //System.out.println(grados);
         System.out.println("los grados farenheit son :" + farenheit);
         // F = 32 + (9 * C / 5)
         
    }
    
}
