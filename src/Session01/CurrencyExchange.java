package Session01;
import java.util.Scanner;
import static java.lang.Math.*;

public class CurrencyExchange {
    public static void main(String[] args) {
        final int RATE = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter money in USD : ");
        float usd = scanner.nextFloat();
        float result = usd * RATE;
        System.out.println("VND/USD Rate is : " + RATE);
        System.out.println("Your money in VND is : " + floor(result) + " VND");
    }
}
