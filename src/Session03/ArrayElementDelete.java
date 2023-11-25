package Session03;
import java.util.Scanner;
public class ArrayElementDelete {
    public static void main(String[] args) {
        System.out.print("Nhập vào kích thước của mảng : ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size    ; i++) {
            System.out.print("Nhập số nguyên vào phần tử thứ " + i +" : ") ;
            arr[i] = scanner.nextInt();
        }
        System.out.print("Mảng đã nhập : ");

        for (int x:arr) {
            System.out.print(x + " ; ");
        }
        System.out.print("\nNhập vào phần tử cần xóa : ");
        int element = scanner.nextInt();
        for (int i = 0; i <size ; i++) {
            if (arr[i] == element) {
                for (int j = i; j < size; j++) {
                    if (j<size-1) {
                        arr[j] = arr[j+1];
                    }
                    else arr[j]=0;
                }
            }
        }
        System.out.print("Mảng sau khi xóa : ");

        for (int x:arr) {
            System.out.print(x + " ; ");
        }
    }
}
