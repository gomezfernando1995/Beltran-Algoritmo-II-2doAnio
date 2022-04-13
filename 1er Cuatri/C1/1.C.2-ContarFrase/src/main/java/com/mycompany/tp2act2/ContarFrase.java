
package com.mycompany.tp2act2;

import java.util.Scanner;

/**
 Pedir que se ingrese una frase por teclado y contar
 * la cantidad de caracteres (incluidos los espacios).
 */
public class ContarFrase {
    public static void main(String[] args) {
        String frase;
        Scanner lector= new Scanner(System.in);
        
        System.out.println("Ingrese Frase: ");
        frase = lector.nextLine();
        int cantidadCara= frase.length();
        
        System.out.println("La frase ingresada tiene "+cantidadCara);
        
    }
}
