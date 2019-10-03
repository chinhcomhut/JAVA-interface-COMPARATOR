
import java.util.Arrays;
import java.util.Comparator;
//import java.lang.Comparable;

public class Main {
    public static void main(String[] args) {
//        Shape shape = new Shape("green",false);
//        System.out.println(shape);
//        Circle circle = new Circle(4.5,"kaka",true);
//        System.out.println(circle);
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);
        System.out.println("Pre-sorted: ");
        for (Circle circle:circles){
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);

        System.out.println("After-sorted: ");
        for (Circle circle:circles){
            System.out.println(circle);
        }
        /*ComparableCircle[] circles= new ComparableCircle[3];
        circles[0]= new ComparableCircle(3.6);
        circles[1]=new ComparableCircle();
        circles[2]=new ComparableCircle("blue",true,3.4);
        System.out.println("Pre-sorted:");
        for(ComparableCircle circle:circles) {
            System.out.println(circle);
        }
        System.out.println(circles[0].compareTo(circles[1]));
        System.out.println(circles[1].compareTo(circles[2]));
        System.out.println(circles[0].compareTo(circles[2]));

        Arrays.sort(circles);

        System.out.println("After-sorted: ");
        for(ComparableCircle circle:circles){
            System.out.println(circle);
        }*/
    }
}
