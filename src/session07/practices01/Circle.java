package session07.practices01;

public class Circle extends Shape implements Resizable{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }   
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
  
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    public double getPerimeter() {
        return Math.PI*radius*2;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.setRadius(this.getRadius()*percent/100.0);
       
    }  
}
