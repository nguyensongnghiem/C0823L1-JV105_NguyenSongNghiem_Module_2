package Session01;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter yours name : ");
        String str = scanner.nextLine();
        System.out.println("Hello " + str);
    }
}
