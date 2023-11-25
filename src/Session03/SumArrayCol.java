
package Session03;
import java.util.Scanner;

public class SumArrayCol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số hàng của mảng 2 chiều : ");
        int rowSize = scanner.nextInt();
        System.out.print("Nhập vào số cột của mảng 2 chiều : ");
        int colSize = scanner.nextInt();
        float[][] arr = new float[rowSize][colSize];
        for (int i = 0; i < rowSize;  i++) {
            for (int j = 0; j <colSize ; j++) {
                arr[i][j] = (float) (Math.random()*100);
            }
        }
        System.out.println("Mảng đã nhập: ");
        for (int i = 0; i < rowSize;  i++) {
            for (int j = 0; j <colSize ; j++) {
                System.out.print(arr[i][j] + " ; " );
            }
            System.out.println("");
        }
        int col;
        do {
        System.out.print("Nhập vào cột cần tính tổng : ");
        col = scanner.nextInt();
        } while (col>colSize) ;
        float sum = 0 ;
        for (int i = 0; i < rowSize; i++) {
            sum += arr[i][col];
        }
        System.out.println("Tổng các phần tử ở cột " + col +" là : " + sum);
    }
}
