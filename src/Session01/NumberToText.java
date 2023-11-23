package Session01;
import java.util.Scanner;

public class NumberToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter yours number : ");
        int number = scanner.nextInt();
        if (number < 0 || number > 999) {
            System.out.print(" Out of range");

        }
        else if (number==0){
            System.out.print("Zero");

        }
        else {
        int hundreds = number / 100;
        int dozens = number - (hundreds*100);
        int tens = dozens /10;
        int units = dozens - (tens*10);
        convertHundreds(hundreds);
        if ( hundreds !=0 && dozens != 0) {
            System.out.print(" and ");
        }
        convertTens(dozens);
        if (tens != 1 ) convertUnit(units);
        }
    }
    public static void convertUnit(int unit) {
        if (unit>=0 && unit<10) {
            switch (unit) {
                case 1 :
                    System.out.print(" one");
                    break;
                case 2 :
                    System.out.print(" two");
                    break;
                case 3 :
                    System.out.print(" three");
                    break;
                case 4 :
                    System.out.print(" four");
                    break;
                case 5 :
                    System.out.print(" five");
                    break;
                case 6 :
                    System.out.print(" six");
                    break;
                case 7 :
                    System.out.print(" seven");
                    break;
                case 8 :
                    System.out.print(" eight");
                    break;
                case 9 :
                    System.out.print(" nine");
                    break;
            }

        }

    }

    public static void convertTens(int number) {
        int tens = number / 10;
        int units = number - (tens*10);
        switch (tens) {
            case 0 :

                System.out.print(" " );
                break;
            case 1 :
                switch (units) {
                    case 0 :
                        System.out.println("ten");
                        break;
                    case 1 :
                        System.out.println("eleven");
                        break;
                    case 2 :
                        System.out.println("twelve");
                        break;
                    case 3 :
                        System.out.println("thirteen");
                        break;
                    case 4 :
                        System.out.println("fourteen");
                        break;
                    case 5 :
                        System.out.println("fifteen");
                        break;
                    case 6 :
                        System.out.println("sixteen");
                        break;
                    case 7 :
                        System.out.println("seventeen");
                        break;
                    case 8 :
                        System.out.println("eighteen");
                        break;
                    case 9 :
                        System.out.println("nineteen");
                        break;
                }
                break;
            case 2 :
                System.out.print("twenty ");
                break;
            case 3 :
                System.out.print("thirty");
                break;
            case 4 :
                System.out.print("forty");
                break;
            case 5 :
                System.out.print("fifty");
                break;
            case 6 :
                System.out.print("sixty");
                break;
            case 7 :
                System.out.print("seventy");
                break;
            case 8 :
                System.out.print("eighty");
                break;
            case 9 :
                System.out.print("ninety");
                break;
        }
//        if (number > 0 && number < 20  ) {
//
//        }
    }
    public static void convertHundreds(int hundreds) {
       if (hundreds > 0 ) {
           convertUnit(hundreds);
           System.out.print( " hundreds " );
        }
    }
}
