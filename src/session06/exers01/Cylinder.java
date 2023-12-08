package session06.exers01;

public class Cylinder extends Circle {
    private float height;
    public Cylinder() {
        super();
        this.height = 1;
    }

    public Cylinder(float radius, String color, float height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2*Math.PI*getRadius()*getHeight();
    }
    public double getVolume () {
        return super.getArea()*height;
    }
    @Override
    public String toString () {
        return "Cylinder: " +  getColor() + "; radius : " +getRadius() + "; area : " + getArea() + " ; Volume :" + getVolume();
    }
}
