import java.util.Scanner;
public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del primer familiar");
        String primerNombre = sc.nextLine();
        String primerNombreFormato = primerNombre.toUpperCase().charAt(1)+"."+primerNombre.substring(primerNombre.length()-2);
        System.out.println("primerNombreFormato = " + primerNombreFormato);

        System.out.println("Ingrese nombre de segundo familiar");
        String segundoNombre = sc.nextLine();
        String segundoNombreFormato = segundoNombre.toUpperCase().charAt(1)+"."+segundoNombre.substring(segundoNombre.length()-2);
        System.out.println("segundoNombreFormato = " + segundoNombreFormato);

        System.out.println("Ingrese nombre de tercer familiar");
        String tercerNombre = sc.nextLine();
        String tercerNombreFormato = tercerNombre.toUpperCase().charAt(1)+"."+segundoNombre.substring(segundoNombre.length()-2);
        System.out.println("tercerNombreFormato = " + tercerNombreFormato);

        String resultado = primerNombreFormato + "_" + segundoNombreFormato + "_" + tercerNombreFormato;
        System.out.println(resultado);

    }
}
