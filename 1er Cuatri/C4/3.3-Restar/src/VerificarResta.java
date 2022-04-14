public class VerificarResta {

     public double verificar(double num1,double num2){

        double resultado;
        if(num1<num2){
            resultado = num2-num1;
        }else{
            resultado = num1-num2;
        }
        return  resultado;
    }

}
