import java.util.Scanner;

public class DetalleDeFacturaAbelardoMirafuentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la razón social del cliente");
        String razonSocial= scanner.nextLine();

        System.out.println("Ingrese el nombre del producto 1");
        String producto= scanner.nextLine();
        System.out.println("Ingrese el primer precio del producto");
        double precio1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo precio del producto");
        double precio2 = scanner.nextDouble();
        double bruto = precio1 + precio2;
        double impuesto = bruto * 0.19;
        double precioNeto = bruto + impuesto;

        String detalleFactura= "La factura de " + razonSocial
                + ", tiene un total bruto de " + bruto
                + ", con un impuesto de " + impuesto
                + ", que suman un total neto de " + precioNeto;
        System.out.println(detalleFactura);
    }
}
