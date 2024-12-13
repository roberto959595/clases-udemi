class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public String leernombre (){
        return this.nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Andres");

        System.out.println("iniciamos el metodo main");

        System.out.println("persona.nombre = " + persona.leernombre());
        System.out.println("antes de llamar al metodo test");
        test(persona);
        System.out.println("despues de llamar al metodo test");

        System.out.println("persona.nombre = " + persona.leernombre());

        System.out.println("finaliza el metodo main con los datos de la persona modificado!" );
    }

    public static void test (Persona persona){
        System.out.println("iniciamos el metodo test");
       persona.modificarNombre("Pepe");
        System.out.println("finaliza el mmetodo test");
    }
}

