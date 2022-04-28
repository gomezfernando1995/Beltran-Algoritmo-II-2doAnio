package com.mycompany.juegodenim;

import java.util.Scanner;

public class Paquetes {

    public void mostrarPqt(int pqt, String msj) {
        System.out.print(msj + pqt + " PALILLOS =");
        for (int i = 0; i < pqt; i++) {
            System.out.print("[]");
        }
        System.out.println("");
    }

    public int generaNumeroAleatorio(int minimo, int maximo) {

        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }

    public int verificar_Pedir_pqt(int pkt1, int pkt2, int pkt3, int turno, Scanner lector) {

        int opcion_monto;

        if (pkt1 < 1) {     // SI EN EL MONTO 1 = 0 , TENDRA QUE ELEGIR OTRO ....

            if (pkt2 < 1) {
                System.out.println("      Solo queda el monto 3");
                opcion_monto = 3;

            } else if (pkt3 < 1) {
                System.out.println("      Solo queda el monto 2");
                opcion_monto = 2;

            } else {
                if (turno == 2) {
                    opcion_monto = this.generaNumeroAleatorio(2, 3);

                } else {
                    System.out.println("      ¿De qué monto quieres quitar palillos ( 2 ó 3) ?");
                    opcion_monto = lector.nextInt();
                    while (!(opcion_monto == 2 || opcion_monto == 3)) {
                        System.out.println("      Error, Ingrese un monto correcto  ( 2 ó 3): ");
                        opcion_monto = lector.nextInt();

                    }
                }
            }

        } else if (pkt2 < 1) // SI EN EL MONTO 2 = 0 , TENDRA QUE ELEGIR OTRO ....
        {

            if (pkt1 < 1) {
                System.out.println("      Solo queda el monto 3");
                opcion_monto = 3;
            } else if (pkt3 < 1) {
                System.out.println("      Solo queda el monto 1");
                opcion_monto = 1;
            } else {

                if (turno == 2) {
                    opcion_monto = this.generaNumeroAleatorio(1, 3);
                    while (!(opcion_monto == 1 || opcion_monto == 3)) {
                        opcion_monto = this.generaNumeroAleatorio(1, 3);
                    }
                } else {
                    System.out.println("      ¿De qué monto quieres quitar palillos (1 ó 3) ?");
                    opcion_monto = lector.nextInt();
                    while (!(opcion_monto == 1 || opcion_monto == 3)) {
                        System.out.println("      Error, Ingrese un monto correcto  ( 1 ó 3): ");
                        opcion_monto = lector.nextInt();
                    }
                }
            }

        } else if (pkt3 < 1) // SI EN EL MONTO 3 = 0 , TENDRA QUE ELEGIR OTRO ....
        {
            if (pkt1 < 1) {
                System.out.println("      Solo queda el monto 2");
                opcion_monto = 2;
            } else if (pkt2 < 1) {
                System.out.println("      Solo queda el monto 1");
                opcion_monto = 1;
            } else {
                if (turno == 2) {
                    opcion_monto = this.generaNumeroAleatorio(1, 2);
                } else {
                    System.out.println("      ¿De qué monto quieres quitar palillos (1 ó 2) ?");
                    opcion_monto = lector.nextInt();
                    while (!(opcion_monto == 1 || opcion_monto == 2)) {
                        System.out.println("      Error, Ingrese un monto correcto  ( 1 ó 2): ");
                        opcion_monto = lector.nextInt();

                    }
                }
            }

        } else // SI LOS 3 MONTONES ESTAN COMPLETOS SERA EL SIGUENTE MSJ
        {
            if (turno == 2) {
                opcion_monto = this.generaNumeroAleatorio(1, 3);
            } else {
                System.out.println("      ¿De qué monto quieres quitar palillos ( 1,2 ó 3) ?");
                opcion_monto = lector.nextInt();
                while (!(opcion_monto == 1 || opcion_monto == 2 || opcion_monto == 3)) {
                    System.out.println("      Error, Ingrese un monto correcto  ( 1, 2 o 3): ");
                    opcion_monto = lector.nextInt();
                }
            }
        }
        return opcion_monto;
    }

    public int finDelJuego(int pkt1, int pkt2, int pkt3, int turno) {

        int flagFin = 0;

        if ((pkt1 < 2 && pkt2 == 0 && pkt3 == 0)
                || (pkt1 == 0 && pkt2 < 2 && pkt3 == 0)
                || (pkt1 == 0 && pkt2 == 0 && pkt3 < 2)) {

            flagFin = 1;
        }

        return flagFin;
    }

    public int ganador(int flag, int turno) {

        int flagWinner = 0;

        if (flag == 1) {
            if (turno == 2) {
                flagWinner = 2;      // GANA LA PC
            } else {
                flagWinner = 1;      // GANA EL HUMANO        
            }
        }
        return flagWinner;
    }

    public void msjFinal(int flagWinner, String nombre) {

        if (flagWinner == 2) {
            System.out.println("\n\n       ========================================================== \n    UH LA PROXIMA SERA, PERDISTES  " + nombre + "\n       ========================================================== \n");
        } else {
            System.out.println("\n\n==========================================================\n                  FELICITACIONES GANASTES  " + nombre + " !!!              \n==========================================================\n");
        }
    }

}
