
package com.mycompany.juegodenim;

import java.util.Scanner;

/**
 *
 * @author theBoss
 */
public class Palillos {
    
    
         public int verifcarPalillos(int opcion_palillos,int opcion_monto,int turno,int pkt1,int pkt2, int pkt3, Scanner lector){
               
             
                  while (opcion_palillos != 1 && opcion_palillos != 2) {

                        System.out.println("      Error: el número de palillos que puedes quitar es 1 ó 2: ");
                        opcion_palillos = lector.nextInt();
                    }
                  
                //  SI ALGUNO DE LOS PQTS TIENE 1 SOLO PALILLO SOLO PODRA SACAR 1 .
                //  SI EN ULTIMO PAQUETE QUEDA 2 PALILLOS SOLO PODRA SACAR 1.
                if ((((pkt1 == 1 && opcion_monto == 1) || (pkt2 == 1 && opcion_monto == 2) || (pkt3 == 1 && opcion_monto == 3)) && (opcion_palillos > 1)) 
                        || (pkt1 == 2 && pkt2 == 0 && pkt3 == 0) || (pkt1 == 0 && pkt2 == 2 && pkt3 == 0) || (pkt1 == 0 && pkt2 == 0 && pkt3 == 2)) 
                 {

                    while (opcion_palillos != 1) {

                        if (turno == 2) {

                            System.out.println("      Error: el número de palillos que puedes quitar es 1 : ");
                            opcion_palillos = 1;

                        } else {
                            System.out.println("      Error, solo puede quitar un palillo al monto  " + opcion_monto);
                            opcion_palillos = lector.nextInt();
                        }
                    }

                }
                      
                 return opcion_palillos;
         }
         
}  
         
    
    

