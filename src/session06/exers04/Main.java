package session06.exers04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào lần lượt chiều dài 3 cạnh tam giác:");
        double side1 = Double.parseDouble(scanner.nextLine());
        double side2 = Double.parseDouble(scanner.nextLine());
        double side3 = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào màu sắc : ");
        String color = scanner.nextLine();
        Triangle t1 = new Triangle(side1, side2, side3);
        t1.setColor(color);
        System.out.println(t1);
        System.out.println("Diên tích hình tam giác:" + t1.getArea());
        System.out.println("Chu vi hình tam giác:" + t1.getPerimeter());

    }
}
