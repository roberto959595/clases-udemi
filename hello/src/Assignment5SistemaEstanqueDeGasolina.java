import java.util.Scanner;

public class Assignment5SistemaEstanqueDeGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacidadActual; // la capacidad a ingresar

        System.out.println("Introdusca la capacidad actual del estanque (max 70 litros): ");
        capacidadActual = scanner.nextDouble();

        if (capacidadActual >= 0 && capacidadActual < 20) {
            System.out.println(" insuficiente ");
        }else if (capacidadActual >= 20 && capacidadActual < 35) {
            System.out.println("suficiente");
        } else if (capacidadActual >= 35 && capacidadActual < 40) {
            System.out.println("medio tanque");
        } else if (capacidadActual >= 40 && capacidadActual < 60) {
            System.out.println("Estanque 3/4");
        } else if (capacidadActual >= 60 && capacidadActual < 70) {
            System.out.println("Estanque casi lleno");
        } else if (capacidadActual == 70) {
            System.out.println("Estanque lleno");
        }
    }
}
