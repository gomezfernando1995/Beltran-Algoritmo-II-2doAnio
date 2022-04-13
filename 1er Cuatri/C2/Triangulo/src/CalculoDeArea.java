import java.util.Scanner;

public class CalculoDeArea {
    public static void main(String[] args) {
        Triangulo tri1 = new Triangulo();
        Rectangulo rec1 = new Rectangulo();

        //Cargo valores y calculo área del triángulo
        tri1.cargarbase();
        tri1.cargaraltura();
        System.out.println("El área del triángulo es: "+ tri1.calculararea());
        System.out.println("La base del triángulo mide: "+tri1.mostrarbase());
        System.out.println("La altura del triángulo mide: "+tri1.mostraraltura());

        //Cargo valores y calculo área del rectángulo
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo: ");
        double dato = lector.nextDouble();
        rec1.setBase(dato);
        System.out.println("Ingrese la altura del rectángulo: ");
        dato = lector.nextDouble();
        rec1.setAltura(dato);
        System.out.println("El área del rectángulo es: "+rec1.calcularArea());
        System.out.println("La base del rectángulo mide: "+rec1.getBase());
        System.out.println("La altura del rectángulo mide: "+rec1.getAltura());

        //Calcular el área del círculo
        Circulo cir1 = new Circulo();
        System.out.println("Ingrese el radio del círculo: ");
        dato = lector.nextDouble();
        cir1.setRadio(dato);
        System.out.println("El área del círculo es: "+cir1.calcularArea());
        System.out.println("El radio del círculo mide: "+cir1.getRadio());
    }
}
