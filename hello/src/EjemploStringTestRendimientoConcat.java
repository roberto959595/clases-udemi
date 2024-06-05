public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio =   System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
            //c = c.concat(a).concat(b).concat("\n");    //500=> 2ms,   1000=> 3ms,   10 000 => 109ms, 100 000 => 6752ms
            //c += a + b + "\n";                         //500=> 10ms, 1000 => 10ms,  10 000 => 55ms,  100 000 => 2394ms
            //sb.append(a).append(b).append("\n");       //500=> 0ms,   1000=>  0ms,  10 000 => 1ms,   100 000 => 7ms
            //  sb.append(a); // 500=> 0ms  1000=> 0ms
             //sb.append(b);
             //sb.append("\n");

        }
        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb.toString() = " + sb.toString());
    }
}
