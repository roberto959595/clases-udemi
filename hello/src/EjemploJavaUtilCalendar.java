import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        calendario.set(2024, Calendar.DECEMBER,11, 9, 22, 55 );
        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);
    }
}
