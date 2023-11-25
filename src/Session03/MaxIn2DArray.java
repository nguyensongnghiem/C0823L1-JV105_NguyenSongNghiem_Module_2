
package Session03;
import java.util.Scanner;

public class MaxIn2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số hàng của mảng 2 chiều : ");
        int rowSize = scanner.nextInt();
        System.out.print("Nhập vào số cột của mảng 2 chiều : ");
        int colSize = scanner.nextInt();
        int[][] arr = new int[rowSize][colSize];
        for (int i = 0; i < rowSize;  i++) {
            for (int j = 0; j <colSize ; j++) {
                arr[i][j] = (int) (Math.random()*100);
            }
        }
        System.out.print("Mảng đã nhập: ");
        for (int i = 0; i < rowSize;  i++) {
            for (int j = 0; j <colSize ; j++) {
                System.out.print(arr[i][j] + " ; " );
            }
            System.out.println("");

        }
        // Find max  element
        int max= arr[0][0];
        for (int i = 0; i < rowSize;  i++) {
            for (int j = 0; j <colSize ; j++) {
               if (max < arr[i][j]) max =arr[i][j]  ;
            }

        }
        System.out.println(" Phần tử lớn nhất trong mảng là : " + max);
    }
}
