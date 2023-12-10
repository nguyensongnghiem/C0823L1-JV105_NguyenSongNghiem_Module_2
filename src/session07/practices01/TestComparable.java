package session07.practices01;

import java.util.Arrays;

public class TestComparable {
public static void main(String[] args) {
    ComparableCircle[] circles = new ComparableCircle[3];
    circles[0] = new ComparableCircle();
    circles[1] = new ComparableCircle(2);
    circles[2] = new ComparableCircle("yellow",false, 1.5);
    System.out.println("---Mảng chưa sort");
    for (ComparableCircle comparableCircle : circles) {
        System.out.println(comparableCircle.toString());
    }
    Arrays.sort(circles);
    System.out.println("---Mảng đã sort");

    for (ComparableCircle comparableCircle : circles) {
        System.out.println(comparableCircle.toString());        
    }

}
}
