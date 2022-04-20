package com.mycompany.juegodenim;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Fernando Gomez
 *
 *
 *
 */
public class JuegoNim {

    public static void main(String[] args) {

        Paquetes pack = new Paquetes();
        Scanner lector = new Scanner(System.in);
        int opcion_monto_user, opcion_palillos_user;
        int opcion_monto_pc, opcion_palillos_pc;
        int pkt1 = pack.generaNumeroAleatorio(3, 6);
        int pkt2 = pack.generaNumeroAleatorio(3, 6);
        int pkt3 = pack.generaNumeroAleatorio(3, 6);
        int flagFin = 0, flagWin = 0;
        String nombre;

        System.out.println("\n\n/*********************  BIENVENIDO A JUEGO DE NIM  ******************/");
        System.out.println("/         INGRESE SU NOMBRE :   ");
        nombre = lector.next().toUpperCase();
        System.out.println("/*******************************************************************/\n");
        if (flagFin == 0) {

            while (flagFin != 1) {

                System.out.println("--------------------------------------------------------------------");
                pack.mostrarPqt(pkt1, "                PQT N°1 TIENE ");
                pack.mostrarPqt(pkt2, "                PQT N°2 TIENE ");
                pack.mostrarPqt(pkt3, "                PQT N°3 TIENE ");
                System.out.println("--------------------------------------------------------------------");

                  //##############################################################################################
                  //########################################   TURNO DEL PC    ######################################### 
                 //###############################################################################################
                    
                  // ---------------------------------------------------------------------------------------------------------------------------//
                 // ----------------------------------- CONDICIONAMIENTO Y PEDIDO DE SELECCION DE PAQUETE ------------------------------//
                 // --------------------------------------------------------------------------------------------------------------------------//
                    
                System.out.println("=======================  JUEGA  " + nombre + " SU TURNO =======================\n");

                if (pkt1 < 1) {
                    if (pkt2 < 1) {
                        System.out.println("      Quedo el paquete 3");
                        opcion_monto_user = 3;
                    } else if (pkt3 < 1) {
                        System.out.println("      Quedo el paquete 2");
                        opcion_monto_user = 2;

                    } else {
                        System.out.println("      ¿De qué montón quieres quitar palillos ( 2 ó 3) ?");
                        opcion_monto_user = lector.nextInt();

                        while (!(opcion_monto_user == 2 || opcion_monto_user == 3)) {
                            System.out.println("      Error, Ingrese un monto correcto  ( 2 ó 3): ");
                            opcion_monto_user = lector.nextInt();
                        }
                    }

                } else if (pkt2 < 1) {

                    if (pkt1 < 1) {
                        System.out.println("      Quedo el paquete 3");
                        opcion_monto_user = 3;
                    } else if (pkt3 < 1) {
                        System.out.println("      Quedo el paquete 1");
                        opcion_monto_user = 1;
                    } else {
                        System.out.println("      ¿De qué montón quieres quitar palillos (1 ó 3) ?");
                        opcion_monto_user = lector.nextInt();
                        while (!(opcion_monto_user == 1 || opcion_monto_user == 3)) {
                            System.out.println("      Error, Ingrese un monto correcto  ( 1 ó 3): ");
                            opcion_monto_user = lector.nextInt();
                        }
                    }

                } else if (pkt3 < 1) {
                    if (pkt1 < 1) {
                        System.out.println("      Quedo el paquete 2");
                        opcion_monto_user = 2;
                    } else if (pkt2 < 1) {
                        System.out.println("      Quedo el paquete 1");
                        opcion_monto_user = 1;
                    } else {

                        System.out.println("      ¿De qué montón quieres quitar palillos (1 ó 2) ?");
                        opcion_monto_user = lector.nextInt();

                        while (!(opcion_monto_user == 1 || opcion_monto_user == 2)) {
                            System.out.println("      Error, Ingrese un monto correcto  ( 1 ó 2): ");
                            opcion_monto_user = lector.nextInt();
                        }
                    }
                } else {
                    System.out.println("      ¿De qué montón quieres quitar palillos ( 1,2 ó 3) ?");
                    opcion_monto_user = lector.nextInt();
                    while (!(opcion_monto_user == 1 || opcion_monto_user == 2 || opcion_monto_user == 3 )) {
                            System.out.println("      Error, Ingrese un monto correcto  ( 1, 2 o 3): ");
                            opcion_monto_user = lector.nextInt();
                        }
                }

                // --------------------------------------------------------------------------------------------------------------------------//
                // --------------------------------------------------- PEDIDO DE PALILLOS --------------------------------------------------//
                // --------------------------------------------------------------------------------------------------------------------------//

                System.out.println("      ¿Cuántos palillos quieres quitar del montón " + opcion_monto_user + " (1 o 2)?");
                opcion_palillos_user = lector.nextInt();

                if ( ((pkt1 == 1 || pkt2 == 1 || pkt3 == 1) && (opcion_palillos_user > 1)) || (pkt1 == 2 && pkt2 == 0 && pkt3 == 0) || (pkt1 == 0 && pkt2 == 2 && pkt3 == 0) || (pkt1 == 0 && pkt2 == 0 && pkt3 == 2 )) {

                    while (opcion_palillos_user != 1) {
                        System.out.println("      Error, solo puede quitar un palillo al monto  " + opcion_monto_user);
                        opcion_palillos_user = lector.nextInt();
                    }

                } 
                
                if (((pkt1 == 3 && pkt2 == 0 && pkt3 == 0) || (pkt1 == 0 && pkt2 == 3 && pkt3 == 0) || (pkt1 == 0 && pkt2 == 0 && pkt3 == 3)) || opcion_palillos_user>2 || opcion_palillos_user<1) {

                    while (opcion_palillos_user != 1 && opcion_palillos_user != 2) {
                        System.out.println("      Error: el número de palillos que puedes quitar es 1 ó 2: ");
                        opcion_palillos_user = lector.nextInt();
                    }

                }

                switch (opcion_monto_user) {
                    case 1 ->
                        pkt1 = pkt1 - opcion_palillos_user;
                    case 2 ->
                        pkt2 = pkt2 - opcion_palillos_user;
                    case 3 ->
                        pkt3 = pkt3 - opcion_palillos_user;

                }

                if ((pkt1 < 2 && pkt2 == 0 && pkt3 == 0)
                        || (pkt1 == 0 && pkt2 < 2 && pkt3 == 0)
                        || (pkt1 == 0 && pkt2 == 0 && pkt3 < 2)) {

                    flagFin = 1;
                }

                if (flagFin != 1) {

                    //################################################################ ####################### ################
                    //###################################### ######   TURNO DEL PC    ######################### ##################### 
                    //########################################################## ####################### ######################
                 
                    System.out.println("\n =======================     JUEGA LA PC    ======================= \n");

                    // ---------------------------------------------------------------------------------------------------------------------------//
                    // ----------------------------------- CONDICIONAMIENTO Y PEDIDO DE SELECCION DE PAQUETE ------------------------------//
                    // --------------------------------------------------------------------------------------------------------------------------//
                    
             
                    if (pkt1 < 1) {
                        if (pkt2 < 1) {
                            System.out.println("      Quedo el paquete 3");
                            opcion_monto_pc = 3;
                        } else if (pkt3 < 1) {
                            System.out.println("      Quedo el paquete 2");
                            opcion_monto_pc = 2;
                        } else {
                            System.out.println("      ¿De qué montón quieres quitar palillos ( 2 ó 3) ?");
                            opcion_monto_pc = pack.generaNumeroAleatorio(2, 3);
                            
                            /*while (!(opcion_monto_pc == 2 || opcion_monto_pc == 3)) {
                                System.out.println("      Error, Ingrese un monto correcto  ( 2 ó 3): ");
                                opcion_monto_pc = (int) Math.floor(Math.random() * (2 - 2 + 1) + 3);
                            }*/
                        }

                    } else if (pkt2 < 1) {

                        if (pkt1 < 1) {
                            System.out.println("      Quedo el paquete 3");

                            opcion_monto_pc = 3;
                        } else if (pkt3 < 1) {
                            System.out.println("      Quedo el paquete 1");

                            opcion_monto_pc = 1;
                        } else {
                            
                            System.out.println("      ¿De qué montón quieres quitar palillos (1 ó 3) ?");
                            opcion_monto_pc = pack.generaNumeroAleatorio(1, 3);
                            
                            while (!(opcion_monto_pc == 1 || opcion_monto_pc == 3)) {
           
                                System.out.println("      Error, Ingrese un monto correcto  ( 1 ó 3): ");
                                opcion_monto_pc = pack.generaNumeroAleatorio(1, 3);                 
                            }
                        }

                    } else if (pkt3 < 1) {
                        if (pkt1 < 1) {
                            System.out.println("      Quedo el paquete 2");

                            opcion_monto_pc = 2;
                        } else if (pkt2 < 1) {
                            System.out.println("      Quedo el paquete 1");

                            opcion_monto_pc = 1;
                        } else {
                            System.out.println("      ¿De qué montón quieres quitar palillos (1 ó 2) ?");
                            opcion_monto_pc = pack.generaNumeroAleatorio(1, 2);
                          /*  while (!(opcion_monto_pc == 1 || opcion_monto_pc == 2)) {
                                System.out.println("      Error, Ingrese un monto correcto  ( 1 ó 2): ");
                                opcion_monto_pc = pack.generaNumeroAleatorio(1, 2);
                            }*/
                        }
                    } else {
                      
                        System.out.println("      ¿De qué montón quieres quitar palillos ( 1,2 ó 3) ?");
                        opcion_monto_pc = pack.generaNumeroAleatorio(1,3);
                    }

                    // --------------------------------------------------------------------------------------------------------------------------//
                    // --------------------------------------------------- PEDIDO DE PALILLOS ---------------------------------------------------//
                    // --------------------------------------------------------------------------------------------------------------------------//
                               
                    System.out.println("      Monto seleccionado " + opcion_monto_pc); 
                    opcion_palillos_pc = pack.generaNumeroAleatorio(1, 2);
                    System.out.println("      ->Palillos : " + opcion_palillos_pc);
                              
                    //SI 2 PAQUETES ESTAN VACIOS Y EN EL ULTIMO QUEDAN 3 PALILLOS, SOLO PUEDE SACAR 2, Y SI QUEDAN 2 PUEDE SACAR 1. 
                    //TAMBIEN ENTRA SI LA MAQUINA INGRESA EL 3 PALILLO EL CUAL NO DEBERIA ESTAR PERO POR LAS DUDAS

                     if (((pkt1 == 3 && pkt2 == 0 && pkt3 == 0) || (pkt1 == 0 && pkt2 == 3 && pkt3 == 0) || (pkt1 == 0 && pkt2 == 0 && pkt3 == 3))  || opcion_palillos_pc>2) {
                       
                         while (opcion_palillos_pc != 1 && opcion_palillos_pc != 2) {
                            System.out.println("      Error: el número de palillos que puedes quitar es 1 ó 2: ");
                            opcion_palillos_pc = pack.generaNumeroAleatorio(1, 2);
                        }  
                         
                     }  else if (((pkt1 == 2 && pkt2 == 0 && pkt3 == 0) || (pkt1 == 0 && pkt2 == 2 && pkt3 == 0) || (pkt1 == 0 && pkt2 == 0 && pkt3 == 2))) {

                        while (opcion_palillos_pc != 1 ) {
                            System.out.println("      Error: el número de palillos que puedes quitar es 1 : ");
                            opcion_palillos_pc =1;
                        }
                        
                    }               
                     //SI HAY UN SOLO PALILLO EN LOS PAQUETES, SOLO PUEDE SACAR UN SOLO PALO

                    if ((((opcion_monto_pc == 1 && pkt1 == 1) || (opcion_monto_pc == 2 && pkt2 == 1) || (opcion_monto_pc == 3 && pkt3 == 1)) && !(opcion_palillos_pc == 1))) {

                        while (opcion_palillos_pc != 1) {
                            System.out.println("      Error, solo puede quitar un palillo al monto  " + opcion_monto_pc);
                            opcion_palillos_pc = 1;
                        }
                        
                    }
                       
                    // DESCONTAMOS LOS PALILLOS AL PAQUETE  
                    switch (opcion_monto_pc) {
                        case 1 ->
                            pkt1 = pkt1 - opcion_palillos_pc;
                        case 2 ->
                            pkt2 = pkt2 - opcion_palillos_pc;
                        case 3 ->
                            pkt3 = pkt3 - opcion_palillos_pc;

                    }
                        
                    //EN TAL CASO QUE QUEDE 1 SOLO PALILLO FINALIZAMOS EL JUEGO
                    
                    if ((pkt1 < 2 && pkt2 == 0 && pkt3 == 0)
                            || (pkt1 == 0 && pkt2 < 2 && pkt3 == 0)
                            || (pkt1 == 0 && pkt2 == 0 && pkt3 < 2)) {

                        flagFin = 1;      // DA POR FINALIZADO EL BUCLE
                        flagWin = 2;    // GANA LA PC
                    }

                }

                //-------------------------------------------------------------------------------------
            } //FIN LLAVE DEL WHILE

        }// FIN DE LLAVE DEL IF PRINCIPAL
        if (flagWin == 2) {
            System.out.println("\n\n==========================================================\n                   UH LA PROXIMA SERA, PERDISTES  "+ nombre+"               \n==========================================================\n" );
        } else {
            System.out.println("\n\n==========================================================\n                  FELICITACIONES GANASTES  "+ nombre+" !!!              \n==========================================================\n");
        }

    }//FIN DE LLAVE DEL MAIN

}// LLAVE DE CLASE PRINCIPAL

