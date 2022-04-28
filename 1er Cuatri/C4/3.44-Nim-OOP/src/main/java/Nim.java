
import java.util.Scanner;

/**
 *
 * @author theBoss
 */
public class Nim {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        Monton pqt1 = new Monton();
        Monton pqt2 = new Monton();
        Monton pqt3 = new Monton();
        Monton_Palillo monto_palillo = new Monton_Palillo();
        int flagWhile = 0,jugador;
        int option_lot_user,option_lot_pc;
        
        pqt3.setMonton(0);
        while (flagWhile != 1) {
                   
                    monto_palillo.mostrarMontones(pqt1, pqt2, pqt3);
                    System.out.println("        JUEGA USTED     ");
                    jugador = 1;
                                   
                    option_lot_user = monto_palillo.pedirMonto(jugador, "\n      Que monton desea elegir: ", lector);
                    while(monto_palillo.verificarMonton(pqt1, pqt2, pqt3, option_lot_user) != 0){
                        System.out.println("      Error, ese montón ya no tiene palillos o no existe");
                        option_lot_user = monto_palillo.pedirMonto(jugador, "\n      Que monton desea elegir: ", lector);
                    }

        }

    }

}
