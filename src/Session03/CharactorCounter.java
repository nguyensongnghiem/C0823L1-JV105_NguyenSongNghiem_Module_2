
package Session03;
import java.util.Scanner;

public class CharactorCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 chuỗi bất kỳ : ");
        String str = scanner.nextLine();
        System.out.print("Nhập vào 1 ký tự bất kỳ : ");
        char c = scanner.next().charAt(0);
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)== c) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + c + " là : " + count);
    }
}
