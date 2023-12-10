package session07.practices01;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Shape c1 = new Circle(1.5);
        Shape r1 = new Rectangle(4, 5);
        Shape t1 = new Triangle(3, 4, 5);
        shapes[0] = c1;
        shapes[1] = r1;
        shapes[2] = t1;
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Rectangle) {
                ((Rectangle) shape).howToColor();
            } else
                System.out.println("I'm not a rectangle !");

        }

    }
}
