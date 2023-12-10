package session07.practices01;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        // TODO Auto-generated method stub

      return o1.getRadius() < o2.getRadius() ? -1 : (o1.getRadius() > o2.getRadius() ? 1 : 0);
    }
}
