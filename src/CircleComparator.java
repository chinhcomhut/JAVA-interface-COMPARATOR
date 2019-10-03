import java.util.Comparator;
//import java.lang.Comparable;

//public class ComparableCircle extends Circle implements Comparable<Circle>{
 public class CircleComparator implements Comparator<Circle>{
    @Override
    public int compare(Circle c1, Circle c2) {
        if(c1.getRadius()>c2.getRadius()) return 1;
        else if(c1.getRadius()<c2.getRadius())return -1;
        else
        return 0;
    }

/*
    @Override
    public int compareTo(Circle o) {
        ComparableCircle comparableCircle = (ComparableCircle) o;
        if(getRadius()> comparableCircle.getRadius()) {
            return 1;
        }
        else if(getRadius()< comparableCircle.getRadius()){
            return -1;
        }
        else

        return 0;*/
    }

