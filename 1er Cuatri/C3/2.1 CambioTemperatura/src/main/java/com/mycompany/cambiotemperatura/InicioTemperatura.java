
package com.mycompany.cambiotemperatura;

import java.util.Scanner;

/**
Ejercicio 2.1: Clase Temperatura (*)

Escribe en Java una clase Temperatura que convierta de grados Celsius a Farenheit y viceversa. Para ello crea dos métodos:

double celsiusToFarenheit(double) double farenheitToCelsius(double)

Recuerda que, para convertir de una unidad a otra, la fórmula adecuada es:

De Farenheit a Celsius: C = (F – 32) / 1,8

De Celsius a Farenheit: F = (1,8) x C + 32

Escribe también un método main() para poder probar los métodos anteriores a partir de un número introducido por el usuario del programa.

 */
public class InicioTemperatura {

    public static void main(String[] args) {
        
            Scanner lector = new Scanner(System.in);
            Temperatura temp = new Temperatura();
            double tempIngresada;
            
             System.out.println("Ingrese grados Celcius: ");
             tempIngresada = lector.nextDouble();
             System.out.println("Esos Celcius equivalen a "+temp.celciusAfarenheit(tempIngresada)+" Farenheit \n");
             
             System.out.println("\n--------------------------------------------------------------------------------\nIngrese grados Farenheit: ");
             tempIngresada = lector.nextDouble();
             System.out.println("Esos Farenheit equivalen a "+temp.farenheitAcelcius(tempIngresada)+" Celcius \n");
    }
}
