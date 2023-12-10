package session07.practices01;

public class TestResizable {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("Diện tích trước : " + c1.getArea());
        c1.resize(10);
        System.out.println(c1);
        System.out.println("Diện tích sau resize : " + c1.getArea());
        Rectangle r1 = new Rectangle(2.5, 3.8);
        System.out.println(r1);
        System.out.println("Diện tích trước : " + r1.getArea());
        r1.resize(150);
        System.out.println(r1);
        System.out.println("Diện tích sau : " + r1.getArea());
    }

}
