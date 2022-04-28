package com.mycompany.juegodenim;
import java.util.Random;

import java.util.Scanner;
/*      
        ALUMNO GOMEZ FERNANDO GABRIEL
*/
public class JuegoNim {

    public static void main(String[] args) {

        Paquetes pack = new Paquetes();
        Palillos palillos = new Palillos();
        Scanner lector = new Scanner(System.in);
        int opcion_monto_user, opcion_palillos_user;
        int opcion_monto_pc, opcion_palillos_pc;
        int pkt1 = pack.generaNumeroAleatorio(3, 6);
        int pkt2 = pack.generaNumeroAleatorio(3, 6);
        int pkt3 = pack.generaNumeroAleatorio(3, 6);
        int flagFin = 0,flagWinner=0, turno;
        String nombre;

        System.out.println("\n\n/*********************  BIENVENIDO A JUEGO DE NIM  ******************/");
        System.out.println("/         INGRESE SU NOMBRE :   ");
        nombre = lector.next().toUpperCase();
        System.out.println("/*******************************************************************/\n");
      
            while (flagFin !=1) {

                System.out.println("--------------------------------------------------------------------");
                pack.mostrarPqt(pkt1, "                PQT N°1 TIENE ");
                pack.mostrarPqt(pkt2, "                PQT N°2 TIENE ");
                pack.mostrarPqt(pkt3, "                PQT N°3 TIENE ");
                System.out.println("--------------------------------------------------------------------");

                //########################################   TURNO DEL JUGADOR    #####################################
                
                System.out.println("=======================  JUEGA  " + nombre + " SU TURNO =======================\n");
                turno = 1;

                //  PEDIDO DE PQT 
                opcion_monto_user = pack.verificar_Pedir_pqt(pkt1, pkt2, pkt3, turno, lector);

                // PEDIDO DE PALILLOS 
                System.out.println("      ¿Cuántos palillos quieres quitar del montón " + opcion_monto_user + " (1 o 2)?");
                opcion_palillos_user = lector.nextInt();

                //VERIFICAMOS PALILLOS
                opcion_palillos_user = palillos.verifcarPalillos(opcion_palillos_user, opcion_monto_user, turno, pkt1, pkt2, pkt3, lector);

                // DESCONTAMOS LOS PALILLOS AL PAQUETE  
                switch (opcion_monto_user) {
                    case 1 ->
                        pkt1 = pkt1 - opcion_palillos_user;
                    case 2 ->
                        pkt2 = pkt2 - opcion_palillos_user;
                    case 3 ->
                        pkt3 = pkt3 - opcion_palillos_user;
                }

                //VERIFICAMOS FIN DEL JUEGO          
                 flagFin = pack.finDelJuego(pkt1, pkt2, pkt3, turno);
                 flagWinner =pack.ganador(flagFin, turno);

                if (flagFin < 1) {
                    //###################################### ######   TURNO DEL PC    ######################### ##################### 
                    
                    System.out.println("\n =======================     JUEGA LA PC    ======================= \n");
                    turno = 2;
                    //  PEDIDO DE PQT 
                    opcion_monto_pc = pack.verificar_Pedir_pqt(pkt1, pkt2, pkt3, turno, lector);

                    // PEDIDO DE PALILLOS 
                    System.out.println("      Monto  PC seleccionado : " + opcion_monto_pc);
                    opcion_palillos_pc = pack.generaNumeroAleatorio(1, 2);
                    System.out.println("      Palillos PC seleccionados : " + opcion_palillos_pc);

                    //VERIFICAMOS PALILLOS
                    opcion_palillos_pc = palillos.verifcarPalillos(opcion_palillos_pc, opcion_monto_pc, turno, pkt1, pkt2, pkt3, lector);
                  
                    // DESCONTAMOS LOS PALILLOS AL PAQUETE  
                    switch (opcion_monto_pc) {
                        case 1 ->
                            pkt1 = pkt1 - opcion_palillos_pc;
                        case 2 ->
                            pkt2 = pkt2 - opcion_palillos_pc;
                        case 3 ->
                            pkt3 = pkt3 - opcion_palillos_pc;
                    }
           
                    //VERIFICAMOS FIN DEL JUEGO          
                    flagFin = pack.finDelJuego(pkt1, pkt2, pkt3, turno);
                    flagWinner =pack.ganador(flagFin, turno);
                }            
            } //FIN LLAVE DEL WHILE
                
            pack.msjFinal(flagWinner, nombre);
            
    }//FIN DE LLAVE DEL MAIN

}// LLAVE DE CLASE PRINCIPAL

