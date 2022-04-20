
package com.mycompany.juegodenim;

public class Paquetes {
    
    
        public void mostrarPqt(int pqt,String msj)
        {
                   System.out.print(msj+pqt+" PALILLOS =");
                   for(int i =0;i<pqt;i++)
                  {
                      System.out.print("[]");
                  }
                   System.out.println("");
        }
        
        
         public  int generaNumeroAleatorio(int minimo,int maximo){
        
                 int num=(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
                 return num;
              }
}
