public class EjemploStringMetodo {
    public static void main(String[] args) {

        String nombre = "Kevin";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Kevin\") = " + nombre.equals("Kevin"));
        System.out.println("nombre.equals(\"Kevin\") = " + nombre.equals("kevin"));
        System.out.println("nombre.equalsIgnoreCase(\"kevin\") = " + nombre.equalsIgnoreCase("kevin"));
        System.out.println("nombre.compareTo(\"Kevin\") = " + nombre.compareTo("Kevin"));
        System.out.println("nombre.compareTo(\"roberto\") = " + nombre.compareTo("roberto"));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));// para que sea completo es desde el 0
        System.out.println("nombre.substring(1) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(0,nombre.length()) = " + nombre.substring(0,nombre.length()));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(a,.) = " + trabalenguas.replace("a", "e"));
        System.out.println("trabalenguas = " + trabalenguas);// el String original trabalenguas no se modifica realmente sigue igual
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));// la ultima posicion donde se encuentra el caracter seleccionado
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("lenguas")); // el primer caracter se encuentra siempre en la posicion 0
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("lenguas"));// si contiene el caracter es true si no es false
        System.out.println("trabalenguas.startsWith(lenguas) = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());

    }
}
