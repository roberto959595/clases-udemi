import java.util.Scanner;

public class CodeGymMostramosLoQueObtenemos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String s = scanner.nextLine();
            if(s.equals("basta")){
                break;
            }
            System.out.println("s = " + s);
        }
    }
}
