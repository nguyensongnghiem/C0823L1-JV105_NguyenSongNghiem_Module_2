package Session02;
import java.util.Scanner;
public class ShapeDisplay {
    public static void main(String[] args) {
        boolean exitFlag = false;
        do {
            System.out.println("PRINT A SHAPE : ");
            System.out.println("1. Print Rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Select a shape : ");
            int selected = scanner.nextInt();
            switch (selected) {
                case 1:
                    System.out.println("print Rectangle");
                    printRectangle();
                    break;
                case 2:
                    System.out.println("print square triangle");
                    printSquareTriangle();
                    break;
                case 3:
                    System.out.println("print isosceles triangle");
                    printIsoscelesTriangle();
                    break;
                case 4:
                    System.out.println("Exit !");
                    exitFlag =true;
                    break;

            }
        } while (!exitFlag);

    }
    public static void printRectangle () {
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
    public static void printSquareTriangle () {
        int n =8;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
        System.out.print("\n");

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n-i ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
        System.out.print("\n");

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if  (j > n-i ) System.out.print("*");
                else  System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if  (j > i) System.out.print("*");
                else  System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public static void printIsoscelesTriangle () {
        int n = 20;
        for (int i = 1; i < n/2; i++) {
            for (int j = 1; j < n; j++) {
                if  (j > n/2-i && j < n/2+i) System.out.print("*");
                else  System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
