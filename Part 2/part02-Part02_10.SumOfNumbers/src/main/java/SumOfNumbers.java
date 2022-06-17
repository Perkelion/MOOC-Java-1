
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qrt = 0;
        int qnt = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number != 0) {
                qrt = qrt + number;
                qnt++;
                continue;
            }
            break;
        }
        System.out.println("Number of numbers: " + qnt);
        System.out.println("Sum of the numbers: " + qrt);
    }
}
