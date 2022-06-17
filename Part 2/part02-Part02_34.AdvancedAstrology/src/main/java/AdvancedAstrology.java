
public class AdvancedAstrology {

    public static void printStars(int number) {

        while (number > 0) {
            number--;
            System.out.print("*");

        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 0, s = size, st = 0;
        while (i < size) {
            i++;
            s--;
            printSpaces(s);
            st++;
            printStars(st);
        }
    }

    public static void christmasTree(int height) {

        int i = 0, s = height, st = 1;
        while (i < height) {
            i++;
            s--;
            printSpaces(s);
            printStars(st);
            st += 2;
        }
        printSpaces(height - 2);
        System.out.println("***");
        printSpaces(height - 2);
        System.out.println("***");
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
