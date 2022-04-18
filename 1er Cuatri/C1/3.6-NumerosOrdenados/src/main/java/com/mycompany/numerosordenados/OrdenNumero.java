package com.mycompany.numerosordenados;

public class OrdenNumero {

    //Atributo
    private int numero;
    //Contructor

    public OrdenNumero() {
        numero = 0;
    }
    
    
  //----------------------------------------   METODOS   ----------------------------------------

    public int OrdenDeNumeros(int a, int b, int c) {
        if (a < b && c > b) {
            numero = 1; // ORDEN DE MENOR A MAYOR
        } else {
            numero = 0;//ORDEN DE MAYOR A MENOS
        }
        return numero;
    }

 //---------------------------------------- ORDENAR DE MAYOR A MENOR ----------------------------------------
    public int sortMayMen(int[] array) {
        int contador = 0, retorno, aux, limite = array.length, nuevoLimite;
        boolean flag;
        nuevoLimite = limite - 1;

        do {
            flag = false;
            for (int i = 0; i < nuevoLimite; i++) {
                contador++;
                if (array[i] < array[i + 1]) {
                    flag = true;
                    aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                }
            }
            nuevoLimite--;
        } while (flag);

        return contador;
    }

    // ---------------------------------------- ORDENAR DE MENOR A MAYOR ----------------------------------------
    public int sortMenMay(int[] array) {
        int contador = 0, aux, limite = array.length, nuevoLimite;
        boolean flag;
        nuevoLimite = limite - 1;

        do {
            flag = false;
            for (int i = 0; i < nuevoLimite; i++) {
                contador++;
                if (array[i] > array[i + 1]) {
                    flag = true;
                    aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                }
            }
            nuevoLimite--;
        } while (flag);

        return contador;
    }

 //---------------------------------------- ES CONSECUTIVO ----------------------------------------
    public int esConsecutivo(int[] array) {

        int retorno = 0, consecutivo1,consecutivo2;
     
        int pos1= array[0];
        int pos2= array[1];
        int pos3= array[2];
        consecutivo1 = pos1-pos2;
        consecutivo2 = pos2-pos3;
            
         if ((consecutivo1 == 1 || consecutivo1 == -1)&&(consecutivo2 ==1 || consecutivo2==-1)   ) {
             retorno = 1;
         }
        
        return retorno;
    }

}
