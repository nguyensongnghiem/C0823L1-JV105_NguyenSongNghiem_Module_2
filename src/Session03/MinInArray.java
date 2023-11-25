
package Session03;
import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào kích thước mảng  : ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size;  i++) {
                arr[i] = (int) (Math.random()*100);
        }
        System.out.print("Mảng đã nhập: ");
        for (int i = 0; i < size;  i++) {
                System.out.print(arr[i] + " ; " );
        }
        System.out.println("");

        // Find min  element
        int min= arr[0];
        for (int i = 0; i < size;  i++) {
               if (min > arr[i]) min =arr[i];
        }
        System.out.println(" Phần tử nhỏ nhất trong mảng là : " + min);
    }
}
