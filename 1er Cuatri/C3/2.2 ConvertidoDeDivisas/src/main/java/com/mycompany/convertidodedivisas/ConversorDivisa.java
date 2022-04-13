/*
 *Ejercicio 2.2: Clase ConversorDivisas (*)

Escribe una clase llamada ConversorDivisas que convierta pesos en dólares y viceversa, mediante dos métodos llamados dolaresAPesos() y pesosADolares(). La clase contará con dos constructores.

El constructor ConversorDivisas() establecerá el tipo de cambio en 92,73.

El constructor ConversorDivisas(double) permitirá configurar el tipo de cambio al crear el objeto.

Como en el ejercicio anterior, también debes escribir un método main() que te permita comprobar que el programa funciona correctamente a partir de datos introducidos por teclado.

 */
package com.mycompany.convertidodedivisas;

public class ConversorDivisa {
        
        private double cambio;
      
        public ConversorDivisa(){
            cambio = 92.73;
        }
         public ConversorDivisa(double dato){
            cambio = dato;
        }
        
         public double pesoAdolar(double pesos){
                  return   pesos/cambio;
         }
         public double dolarApeso(double pesos){
                  return   pesos*cambio;
         }
        
}
