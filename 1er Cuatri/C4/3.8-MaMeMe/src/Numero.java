import java.util.Scanner;

public class Numero {

    public  int inputNum(Scanner lector,String msj)
    {
        System.out.println(msj);
        int num = lector.nextInt();
        return  num;
    }

    public  int mayor(int a,int b,int c)
    {
        int mayor;
        if(a>b || a>c){
            mayor = a;


        }else if(b>c){

            mayor =b;
        }else{
            mayor = c;
        }
        return  mayor;
    }

    public int menor (int a, int b,int c)
    {
        int menor;
        if(a<b || a<c){
            menor = a;
        }else if(b<c){
            menor =b;
        }else{
            menor = c;
        }
        return  menor;

    }

    public int medio (int a, int b,int c)
    {
        int medio;
        if(a > b && a > c) {

            if (b > c) {
                medio = b;
            } else {
                medio = c;
            }
        }else if(b>c)
        {
            if(a>c)
            {
                medio=a;
            }else{
                medio=c;
            }
        }else{
            if(a>b)
            {
                medio =a;
            }else{
                medio = b;
            }
        }
        return  medio;
    }

}
