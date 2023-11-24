package Session02;

public class Print20PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        System.out.print("20 prime numbers : ");
        while (count < 20) {
            if (isPrime(number)) {
                System.out.print(number + " ; ");
                count++;
            }
            number++;
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
