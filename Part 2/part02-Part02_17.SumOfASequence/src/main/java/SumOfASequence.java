
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int number = Integer.valueOf(scanner.nextLine());
        int i = 0;
        int o = 0;

        while (i != number) {
            i++;
            o += i;
           
        }
        System.out.println("The sum is " + o);
    }
}
