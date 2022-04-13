/*
 *Ejercicio 2.2: Clase ConversorDivisas (*)

Escribe una clase llamada ConversorDivisas que convierta pesos en dólares y viceversa, mediante dos métodos llamados dolaresAPesos() y pesosADolares(). La clase contará con dos constructores.

El constructor ConversorDivisas() establecerá el tipo de cambio en 92,73.

El constructor ConversorDivisas(double) permitirá configurar el tipo de cambio al crear el objeto.

Como en el ejercicio anterior, también debes escribir un método main() que te permita comprobar que el programa funciona correctamente a partir de datos introducidos por teclado.

 */
package com.mycompany.convertidodedivisas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertidorDeDivisas {

    public static void main(String[] args) {

               Scanner lector= new Scanner(System.in);
               ConversorDivisa convertir = new ConversorDivisa();
               DecimalFormat  formatoDecimal =new DecimalFormat("#.00");
               double monto;
               String opcion;
               
               
                    //PEDIDO DE PESOS
                System.out.println("  Ingrese la cantidad de pesos a convertir : " );
                monto = lector.nextDouble();
                System.out.println("Por esos pesos te daran te daran US$ "+formatoDecimal.format(convertir.pesoAdolar(monto)));
               
                //PEDIDO DE DOLARES
                System.out.println(" \n -------------------------------\n Ingrese la cantidad de dolares a convertir : " );
                monto = lector.nextDouble();
                System.out.println("Por esos dolares te daran $ "+ formatoDecimal.format(convertir.dolarApeso(monto)));
                   
          }
                       
    }

