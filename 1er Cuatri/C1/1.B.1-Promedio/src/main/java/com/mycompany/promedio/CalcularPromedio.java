package com.mycompany.promedio;

import java.util.Scanner;

/**
 *
 * @author theBoss
 */
public class CalcularPromedio {

    public static void main(String[] args) {
        int num, num2, num3, num4, num5, total;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese num:");
        num= lector.nextInt();
        System.out.println("Ingrese num:");
        num2= lector.nextInt();
         System.out.println("Ingrese num:");
        num3= lector.nextInt();
         System.out.println("Ingrese num:");
        num4= lector.nextInt();
         System.out.println("Ingrese num:");
        num5= lector.nextInt();

        total = num+num2+num3+num4+num5;
        
        System.out.println("El promedio de "+total+" es "+total/5);
        

    }

}
