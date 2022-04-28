
/*
 Ejercicio 3.7:Contar cifras(*)Determinar el número de cifras de un número entero.El algoritmo
 debe funcionar para números de hasta 5 cifras,considerando los negativos.Por ejemplo,si se
  introduce el número 5342,la respuesta del programa debe ser4.Si se introduce –250,la respuesta
  debe ser3.Para los quisquillosos:no,el 0a la izquierda no cuenta.

 */
import java.util.Scanner;

public class ContarCifra {

    public static void main(String[] args) {

        int num,cifrasNum;
        Cifras cifras = new Cifras();
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese numero de hasta 5 cifras : ");
        num = lector.nextInt();

        while(num>99999 || num<-99999)
        {
            System.out.println("Reingrese el numero, debe ser de hasta 5 cifras : ");
            num = lector.nextInt();
        }

        cifrasNum = cifras.cantCifras(num);
        System.out.println(cifrasNum);
    }
}
