
import java.util.Scanner;

public class User {

    private double dineroI;
    private double apuestaI;

    // CONSTRUCTOR
    public User() {
        this.dineroI = 0;
        this.apuestaI = 0;
    }

    //GETTER DINERO 
    public double getDineroI() {
        return dineroI;
    }

    // SETTER DINERO
    public void setDineroI(double user_cash) {
        this.dineroI = user_cash;
    }

    //GETTER APUESTA 
    public double getApuestaI() {
        return apuestaI;
    }

    // SETTER APUESTA
    public void setApuestaI(double apuestaI) {
        this.apuestaI = apuestaI;
    }

    // INGRESO DE DINERO O VALOR
    public double ingresarDinero(String msj_a_mostrar) {

        Scanner lector = new Scanner(System.in);
        int d;
        System.out.println(msj_a_mostrar);
        d = lector.nextInt();

        return d;
    }

    // VERIFICA RANGO DEL DINERO O VALOR 
    public int vRangosDiner(double dinero, double menor, double mayor) {
        int retorno = 0;
        if (dinero <= menor) {
            retorno = -1;  // el dinero es menor a lo posible

        } else if (dinero > mayor) {
            retorno = -2;  // el dinero es amyor a lo posible

        }
        return retorno;
    }

}
