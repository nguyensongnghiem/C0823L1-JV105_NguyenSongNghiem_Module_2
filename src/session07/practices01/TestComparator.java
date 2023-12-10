package session07.practices01;

import java.util.Arrays;

public class TestComparator {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(2);
        circles[2] = new Circle("yellow", false, 1.5);
        System.out.println("---Mảng chưa sort");
        for (Circle circle : circles) {
            System.out.println(circle.toString());
        }
        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("---Mảng đã sort");

        for (Circle circle : circles) {
            System.out.println(circle.toString());
        }
    }

}
