
import java.util.Scanner;

/**
 *
 * @author theBoss
 */
public class Monton_Palillo {

    public void mostrarMontones(Monton pqt1, Monton pqt2, Monton pqt3) {

        System.out.println("----------------   LOS PAQUETES TIENEN  --------------------");
        System.out.println("   PQT N°1 TIENE: " + pqt1.getMonton());
        System.out.println("   PQT N°2 TIENE: " + pqt2.getMonton());
        System.out.println("   PQT N°3 TIENE: " + pqt3.getMonton());
        System.out.println("-------------------------------------------------------------");

    }

    public int pedirMonto(int user, String txt, Scanner lector) {

        int lot;
        if (user == 1) {
            System.out.println(txt);
            lot = lector.nextInt();
        } else {
            lot = (int) Math.floor(Math.random() * (3 - 1 + 1) + (1));
        }

        return lot;
    }

    public int verificarMonton(Monton pqt1, Monton pqt2, Monton pqt3, int opcion) {

        int retorno = 0;

        switch (opcion) {
            case 1 -> {
                if (pqt1.getMonton() < 1) {
                    retorno = 1;
                }
            }
            case 2 -> {
                if (pqt2.getMonton() < 1) {
                    retorno = 1;
                }
            }
            case 3 -> {
                if (pqt3.getMonton() < 1) {
                    retorno = 1;
                }
            }
            default -> {
                if (opcion != 1 || opcion != 2 || opcion != 3) {
                    retorno = 1;
                }
            }
        }

        return retorno;
    }

}
