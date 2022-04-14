public class Bisiesto {

    public int AnioBisiesto(int anio)
    {
        int resultado;
        if ( (anio % 4 ==0) && ((anio%400 !=0 ) || (anio%100!=0)) )
        {
            resultado = 1;
        }else{
            resultado=0;
        }

        return  resultado;
    }

}
