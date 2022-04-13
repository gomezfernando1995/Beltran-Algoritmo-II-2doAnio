/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act4;

import java.util.Scanner;

/**
 *
 * @author theBoss
 */
public class productoIVA {
    
    public static void main(String[] args) {
        
        float importe,iva,totalIVA;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese Compra: ");
        importe = lector.nextFloat();
        
        iva= (float) (importe*0.21);
        totalIVA =iva+importe;
        System.out.println("Importe total de la compra: "+importe);
                System.out.println("IVA: "+iva);
        System.out.println("Importe total a pagar: "+totalIVA);
 
    }    
}
