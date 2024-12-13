public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {


        Object texto = "Creando un objeto de la clase String ...que tal!";
        //String texto = new String("Creando un objeto de la clase String ...que tal!"); esto es lo completo pero ya no se usa el new String

        //Integer num = new Integer(7); arriba seria la forma correcta y completa
        Number num = Integer.valueOf(7);
        //Number num = 7; el de arribA ES LA FORMA CORRECTA de crear una instancia de hecho el value of lo que retorna es un tipo Integer no es un valor primitivo

        Boolean b1 = texto instanceof String;

        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo Object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("b1 texto es del tipo Integer = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Object = " + b1);

        b1 = num instanceof Long;
        System.out.println("num es del tipo Long = " + b1);

        b1 = num instanceof Double;
        System.out.println("num es del tipo Double = " + b1);

        Number decimal = 45.54f;
        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double = " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float = " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);

        



    }
}
