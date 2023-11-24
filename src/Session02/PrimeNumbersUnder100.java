package Session02;

public class PrimeNumbersUnder100 {
    public static void main(String[] args) {

        System.out.print("Prime numbers under 100: ");
        for (int i = 2; i <100 ; i++) {
            if (isPrime(i)) System.out.print(i + " ; ");
        }

    }
    public static boolean isPrime (int number) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if (number%i==0) {
                isPrime = false;
                break;
            }
        }
        return  isPrime;
    }
}
