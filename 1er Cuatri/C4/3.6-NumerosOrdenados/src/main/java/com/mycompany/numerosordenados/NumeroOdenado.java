package com.mycompany.numerosordenados;

import java.util.Scanner;

/**
 * Ejercicio 3.6: Números ordenados (*) Leer tres números por teclado, X, Y y Z,
 * y decidir si están ordenados de menor a mayor. Complétalo con otro método que
 * nos diga si los números, además de estar ordenados, son consecutivos.
 */
public class NumeroOdenado {

    public static void main(String[] args) {
        int arrayNum[], i, opcion;
        arrayNum = new int[3];
        OrdenNumero ordenNumeros = new OrdenNumero();
        Scanner lector = new Scanner(System.in);
        Solitud solicitar = new Solitud();

        for (i = 0; arrayNum.length > i; i++) {
            arrayNum[i] = solicitar.pedirDatoInt(lector, "\n  Introducir numero:");
        }
        System.out.println("\n   1-Menor a Mayor\n   2-Mayor a menor: ");
        opcion = lector.nextInt();
        while (opcion > 2 || opcion < 1) {
            System.out.println("  Reingrese opcion!\n   1-Menor a Mayor\n  2-Mayor a menor:");
            opcion = lector.nextInt();
        }
        if (opcion == 1) {
            ordenNumeros.sortMenMay(arrayNum);
        } else if (opcion == 2) {
            ordenNumeros.sortMayMen(arrayNum);
        }

        for (i = 0; i < arrayNum.length; i++) {
            System.out.print("| "+arrayNum[i]+" |");
        }

        if (ordenNumeros.esConsecutivo(arrayNum) == 1) {
            System.out.println("\n Es consecutivo");
        } else {
            System.out.println("\n No es consecutivo");
        }

    }
}
