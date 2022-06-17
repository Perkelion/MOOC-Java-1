
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int i = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int number = Integer.valueOf(scanner.nextLine());
        int o = 0;

        while (i <= number) {
            o += i;
            i++;
        }

        System.out.println("The sum is " + o);
    }
}
