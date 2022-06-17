
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Where to?");
        int i = Integer.valueOf(scanner.nextLine());
     
        System.out.println("Where from?");
        int number = Integer.valueOf(scanner.nextLine());

        while (number <= i) {
            System.out.println(number);
            number++;
        }
    }
}
