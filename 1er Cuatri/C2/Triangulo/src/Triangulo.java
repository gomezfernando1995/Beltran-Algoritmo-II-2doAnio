import java.util.Scanner;

public class Triangulo {
    private double base;
    private double altura;

    public void cargarbase(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base: ");
        base = lector.nextDouble();
    }

    public double mostrarbase(){
        return base;
    }

    public void cargaraltura(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el valor de la altura: ");
        altura = lector.nextDouble();
    }

    public double mostraraltura(){
        return altura;
    }

    public double calculararea(){
        double area = base*altura/2;
        return area;
    }


}
