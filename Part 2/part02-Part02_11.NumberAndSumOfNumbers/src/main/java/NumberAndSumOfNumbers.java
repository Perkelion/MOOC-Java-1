
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float qrt = 0;
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
        System.out.println("Average of the numbers: " + (qrt / qnt));
    }
}
