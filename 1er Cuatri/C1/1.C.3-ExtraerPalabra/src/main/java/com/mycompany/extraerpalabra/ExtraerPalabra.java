/*
 *Pedir que se ingrese una frase por teclado y extraer una palabra de la frase.
 */
package com.mycompany.extraerpalabra;

import java.util.Scanner;


public class ExtraerPalabra {
    
    public static void main(String[] args) {
        String frase;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese frase");
        frase= lector.nextLine();
        
        frase= frase.substring(0, 4);
        
        System.out.println(frase);
        
         
    }

}
