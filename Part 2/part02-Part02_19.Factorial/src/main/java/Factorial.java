
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int i = 0;
        int o = 1;

        while (i != number) {
            i++;     
            o *= i;
           
        }
        System.out.println("Factorial: " + o);
    }
}
