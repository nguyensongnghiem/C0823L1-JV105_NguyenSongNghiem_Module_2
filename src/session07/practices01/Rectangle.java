package session07.practices01;

public class Rectangle extends Shape implements Resizable, Colorable {
    private double width = 1.0;
    private double height = 1.0;
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getArea() {
        return width*height;
    }

    public double getPerimeter() {
        return 2*height*width;
    }
    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        setHeight(percent*getHeight()/100);
        setWidth(percent*getWidth()/100);
    }
    @Override
    public void howToColor() {
        System.out.println("Paint all 4 sides !");
    }




}
