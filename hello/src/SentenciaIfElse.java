public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 5.5f;

        if(promedio >= 8.0){
            System.out.println("felicitaciones, excelente promedio!");
        } else if(promedio >= 7.0){
            System.out.println("Muy buen promedio!");
        } else if (promedio >=6.0){
            System.out.println("Buen promedio!");
        } else if(promedio >= 4.0){
            System.out.println("Regular necesitas esforzarte un poco mas!");
        } else if(promedio >=3.0) {
            System.out.println("Insuficiente, necesitas estudiar mas!");
        } else {
            System.out.println("Reprobado!");
        }

        System.out.println(" Tu promedio es = " + promedio);
    }
}

