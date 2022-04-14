public class VerificarNum {
    private int resultado;


    public int Positvivo_Negativo(int entrada)
    {
         if(entrada <0){
             resultado = 0;
         }else if (entrada >=0)
         {
             resultado = 1;
         }
         return  resultado;
    }
}
