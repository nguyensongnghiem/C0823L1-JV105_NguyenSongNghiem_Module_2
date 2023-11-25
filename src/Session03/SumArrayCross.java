
package Session03;
import java.util.Scanner;

public class SumArrayCross {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào kích thước của  mảng vuông 2 chiều : ");
        int size = scanner.nextInt();
        
        float[][] arr = new float[size][size];
        for (int i = 0; i < size;  i++) {
            for (int j = 0; j <size ; j++) {
                arr[i][j] = (float) (Math.random()*100);
            }
        }
        System.out.println("Mảng đã nhập: ");
        for (int i = 0; i < size;  i++) {
            for (int j = 0; j <size ; j++) {
                System.out.print(arr[i][j] + " ; " );
            }
            System.out.println("");
        }
        float sum = 0 ;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i==j) sum += arr[i][j];
            }
        }
        System.out.println("Tổng các phần tử trên đường chéo chính là : " + sum);
    }
}
