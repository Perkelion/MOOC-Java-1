
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");

        int number = Integer.valueOf(scanner.nextLine());
        int sum = 0, qnt = 0, even = 0, odd = 0;

        while (number != -1) {
            if ((number % 2) == 0) {
                even++;
            } else {
                odd++;
            }
            qnt++;
            sum += number;
            number = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + qnt);
        System.out.println("Average: " + sum / (qnt * 1.00));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
