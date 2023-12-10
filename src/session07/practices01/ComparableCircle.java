package session07.practices01;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }
    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }
    @Override
    public int compareTo(ComparableCircle anotherCircle) {
         return getRadius() < anotherCircle.getRadius() ? -1 : (getRadius() > anotherCircle.getRadius() ? 1 : 0);
    }
}
