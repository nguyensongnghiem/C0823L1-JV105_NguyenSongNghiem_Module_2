package session06.exers01;

public class Circle {
    private double radius ;
    private String color;
    public Circle () {
        this.radius = 1.0;
        this.color = "blue";
    }

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return (Math.PI*Math.pow(radius,2));
    }
    @Override
    public String toString () {
      return "Circle :" + getColor() + "; radius : " +getRadius() + "; area : " + getArea();
    }
}
