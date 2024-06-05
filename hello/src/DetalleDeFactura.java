import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su razon social para la factura:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el nombre del producto 1:");
        String producto = scanner.nextLine();

        System.out.println("Ingrese un precio del producto 1:");
        double precio1 = 0 ;

        try {
             precio1 = scanner.nextDouble();
            //Integer.parseInt(numeroStr);
        } catch (InputMismatchException e){
            System.out.println("error debe ingresar un nombre, sin numeros!");

            main(args);
            System.exit(0);
        }
        scanner.nextLine(); // Consume "\n"
        System.out.println("ingrese nombre del producto 2:");
        String articulo = scanner.nextLine();

        System.out.println("Ingrese precio del producto 2:");
        double precio2 = scanner.nextDouble();

        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        String detalle = "La factura para " + nombre + ",con articulos tal " + producto + " y " + articulo + " tiene un total bruto de " + totalBruto
                + ", con un impuesto de " + impuesto
                + " y el monto despues de impuesto es de " + totalNeto;

        System.out.println(detalle);

    }
}
