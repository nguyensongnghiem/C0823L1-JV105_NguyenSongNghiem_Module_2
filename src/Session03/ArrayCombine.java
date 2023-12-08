
package Session03;
import java.util.Scanner;

public class ArrayCombine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào kích thước của mảng 1 : ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1    ; i++) {
            System.out.print("Nhập số nguyên vào phần tử thứ " + i +" : ") ;
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Nhập vào kích thước của mảng 2 : ");
        int size2 = scanner.nextInt();

        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("Nhập số nguyên vào phần tử thứ " + i +" : ") ;
            arr2[i] = scanner.nextInt();
        }
        System.out.println("2 Mảng đã nhập : ");
        for (int x:arr1) {
            System.out.print(x + " ; ");
        }
        System.out.println("");
        for (int x:arr2) {
            System.out.print(x + " ; ");
        }
        int[] newArr = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length+i] = arr2[i];
        }
        System.out.println("\n");

        System.out.println("Mảng gọp : ");
        for (int x:newArr) {
            System.out.print(x + " ; ");
        }
    }
}
