
package com.mycompany.tp2act1;

import java.util.Scanner;

/**
 
 *1. Pedir el nombre y el apellido de una persona y mostrarlos en una sola cadena.
 */
public class act1 {
    
    public static void main(String[] args) {
    String nombre,apellido;
    Scanner lector = new Scanner(System.in);
    
        System.out.println("Ingrese nombre: ");
        nombre = lector.next();
        
        System.out.println("Ingrese apellido: ");
        apellido = lector.next();
    
           System.out.println(" "+nombre+" "+apellido);
    }
    
    
   
            
           
            
           
            
    
}
