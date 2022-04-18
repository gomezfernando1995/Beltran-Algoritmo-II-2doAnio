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

        Paquetes parquetes = new Paquetes();
        Scanner lector = new Scanner(System.in);
        int opcion_monto_user, opcion_palillos_user;
        int opcion_monto_pc, opcion_palillos_pc;
        int pkt1 = (int) Math.floor(Math.random() * (4 - 3 + 1) + 3);
        int pkt2 = (int) Math.floor(Math.random() * (4 - 3 + 1) + 3);
        int pkt3 = (int) Math.floor(Math.random() * (4 - 3 + 1) + 3);
        int flagFin = 0, flagWin = 0;
        String nombre;

        System.out.println("\n\n/***********************BIENVENIDO A JUEGO DE NIM ***********************/");
        System.out.println("/         INGRESE SU NOMBRE :   ");
        nombre = lector.next();
        System.out.println("/**********************************************************************/\n");
        if (flagFin == 0) {

            while (flagFin != 1) {

                System.out.println("-----------------------------------------------------------------------");
                parquetes.mostrarPqt(pkt1, "PQT N°1 TIENE ");
                parquetes.mostrarPqt(pkt2, "PQT N°2 TIENE ");
                parquetes.mostrarPqt(pkt3, "PQT N°3 TIENE ");
                System.out.println("-----------------------------------------------------------------------");

                

                    //##################### ############### #######################// 
                    //#####################  TURNO DEL JUGADOR  #######################//
                    //##################### ############### #######################//
                    // ----------------------------------------------------------------//
                    // -------------------- PEDIDO DE MONTON ------------------------//
                    // ----------------------------------------------------------------//
                    System.out.println("===================JUGADOR  " + nombre + " SU TURNO ===================\n");

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
                    }

                    // ----------------------------------------------------------------//
                    // ---------------------- PEDIDO DE PALILLOS ----------------------//
                    // ----------------------------------------------------------------//
                    System.out.println("      ¿Cuántos palillos quieres quitar del montón " + opcion_monto_user + " ?");
                    opcion_palillos_user = lector.nextInt();

                    if ((pkt1 == 1 || pkt2 == 1 || pkt3 == 1) && !(opcion_palillos_user == 1) ) {

                        while (opcion_palillos_user != 1) {
                            System.out.println("      Error, solo puede quitar un palillo al monto  " + opcion_monto_user);
                            opcion_palillos_user = lector.nextInt();
                        }
                        
                    } else if (((pkt1 == 2 && pkt2 == 0 && pkt3 == 0) || (pkt1 == 0 && pkt2 == 2 && pkt3 == 0) || (pkt1 == 0 && pkt2 == 0 && pkt3 == 2))) {

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

                   if (flagFin !=1){

                    //#########################################################
                    //#####################   TURNO DEL PC    ####################### 
                    //#########################################################
                    System.out.println("\n\n=================== JUEGA LA PC===================\n");

                    // -----------------------------------------------------------------//
                    // -------------------- PEDIDO DE MONTON ------------------------//
                    // ----------------------------------------------------------------//
                    if (pkt1 < 1) {
                        if (pkt2 < 1) {
                            opcion_monto_pc = 3;
                        } else if (pkt3 < 1) {
                            opcion_monto_pc = 2;
                        } else {
                            opcion_monto_pc = (int) Math.floor(Math.random() * (1 - 2 + 1) + 3);
                            while (!(opcion_monto_pc == 2 || opcion_monto_pc == 3)) {
                                opcion_monto_pc = (int) Math.floor(Math.random() * (1 - 2 + 1) + 3);
                            }
                        }

                    } else if (pkt2 < 1) {

                        if (pkt1 < 1) {
                            opcion_monto_pc = 3;
                        } else if (pkt3 < 1) {
                            opcion_monto_pc = 1;
                        } else {
                            opcion_monto_pc = (int) Math.floor(Math.random() * (1 - 2 + 1) + 3);
                            while (!(opcion_monto_pc == 1 || opcion_monto_pc == 3)) {
                                opcion_monto_pc = (int) Math.floor(Math.random() * (1 - 2 + 1) + 3);
                                System.out.println(opcion_monto_pc);
                            }
                        }

                    } else if (pkt3 < 1) {
                        if (pkt1 < 1) {                   
                            opcion_monto_pc = 2;
                        } else if (pkt2 < 1) {                      
                            opcion_monto_pc = 1;
                        } else {                     
                            opcion_monto_pc = (int) Math.floor(Math.random() * (1 - 2 + 1) + 3);

                            while (!(opcion_monto_pc == 1 || opcion_monto_pc == 2)) {
                                
                                opcion_monto_pc = (int) Math.floor(Math.random() * (1 - 2 + 1) + 3);
                            }
                        }
                    } else {             
                        System.out.println("entre aca xq estan todos los paquetes");
                        opcion_monto_pc = (int) Math.floor(Math.random() * (1 - 2 + 1) + 3);
                    }

                    // ----------------------------------------------------------------//
                    // ---------------------- PEDIDO DE PALILLOS ----------------------//
                    // ----------------------------------------------------------------//
                    System.out.println("Monto seleccionado " + opcion_monto_pc ); // aca se piden cuandtos palitos quiere sacar
                
                    opcion_palillos_pc = (int) Math.floor(Math.random() * (1 - 2 + 1) + 2);
                     System.out.println("          ->Palillos : "+opcion_palillos_pc);
                       
                    if ((( (opcion_monto_pc ==1 &&  pkt1 == 1) ||( opcion_monto_pc==2 && pkt2 == 1) || ( opcion_monto_pc==3 && pkt3 == 1)) && !(opcion_palillos_pc == 1)) ) {

                        while (opcion_palillos_pc != 1) {
                            
                            System.out.println("      Error, solo puede quitar un palillo al monto  " + opcion_monto_pc);
                            opcion_palillos_pc = 1;
                            
                        }
                    } else if (  ((pkt1 == 2 && pkt2 == 0 && pkt3 == 0) || (pkt1 == 0 && pkt2 == 2 && pkt3 == 0) || (pkt1 == 0 && pkt2 == 0 && pkt3 == 2))  ){

                        while (opcion_palillos_pc != 1 && opcion_palillos_pc != 2) {
                            System.out.println("      Error: el número de palillos que puedes quitar es 1 ó 2: ");
                             opcion_palillos_pc = (int) Math.floor(Math.random() * (1 - 2 + 1) + 2);
                        }

                    }

                    switch (opcion_monto_pc) {
                        case 1 ->
                            pkt1 = pkt1 - opcion_palillos_pc;
                        case 2 ->
                            pkt2 = pkt2 - opcion_palillos_pc;
                        case 3 ->
                            pkt3 = pkt3 - opcion_palillos_pc;

                    }

                    if ((pkt1 < 2 && pkt2 == 0 && pkt3 == 0)
                        || (pkt1 == 0 && pkt2 < 2 && pkt3 == 0)
                        || (pkt1 == 0 && pkt2 == 0 && pkt3 < 2)) {

                        flagFin = 1;
                       flagWin=2;
                    }
                  
            }

                //-------------------------------------------------------------------------------------
            } //FIN LLAVE DEL WHILE

        }// FIN DE LLAVE DEL IF PRINCIPAL
        if(flagWin==2){
            System.out.println("      PERDISTES  "+nombre);
        }else{
             System.out.println("      GANASTES "+nombre+" !!");
        }

    }//FIN DE LLAVE DEL MAIN

}// LLAVE DE CLASE PRINCIPAL

