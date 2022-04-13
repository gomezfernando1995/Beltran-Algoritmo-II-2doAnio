/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c.compararcadena;

import java.util.Scanner;

public class CompararCadena {
    
     public static void main(String[] args) {
         
            String cad1,cad2;
            Scanner lector = new Scanner(System.in);
            
            System.out.println("1ra cadena:");
            cad1 = lector.nextLine();
            System.out.println("\n2ra cadena:");
            cad2 = lector.nextLine();
            
            if (cad1.equals(cad2))
            {
                System.out.println("\n --------------\n Son iguales \n--------------");
            }else{System.out.println("Son distintas");}
            
    }
                
    
}
