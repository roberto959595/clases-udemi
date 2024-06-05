import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;

        System.out.println("suma = " + suma);
        System.out.println("i + j = " + (i + j));

        int resta = i - j;
        System.out.println(resta);
        System.out.println("(i - j)= " + resta);

        int multi = i * j;
        System.out.println("multiplicacion = " + multi);

        int div = i / j;
        double div2 = (float) i / j;
        System.out.println("division = " + div);
        System.out.println("div2 = " + div2);

        int resto = 8 % 4;
        System.out.println("resto = " + resto);
        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if (numero % 2 == 0) {
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }
    }
}

