package session07.practices01;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
        super();
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        // TODO Auto-generated method stub

        return getRadius() < o.getRadius() ? -1 : (getRadius() > o.getRadius() ? 1 : 0);
    }

}
