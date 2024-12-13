public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10;

        System.out.println("iniciamos el metodo main con i = " + i);
        test(1);
        System.out.println("finaliza el metodo main con el valor de i(se mantiene igual) = " + i);
    }

    public static void test (int i){
        System.out.println("iniciamos el metodo test con i = " + i);
        i = 35;
        System.out.println("finaliza el mmetodo test con i = " + i);
    }
}
