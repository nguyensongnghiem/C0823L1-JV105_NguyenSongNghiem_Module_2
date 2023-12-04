package Session05;

public class Circle {
   private double radius = 1.0;
   private String color  = "red";
    public Circle () {

    }
    public Circle(double radius) {
        this.radius = radius;
    }
    double getRadius() {
        return radius;
    }
    double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3.5);
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());

    }
}

