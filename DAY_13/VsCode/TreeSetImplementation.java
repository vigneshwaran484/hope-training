 
import java.util.TreeSet;

public class TreeSetImplementation {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>();
        ts.add("Banana");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Apple"); 
        ts.tailSet("Guava"); 
        System.out.println("Sorted TreeSet: " +ts);
        System.out.println("First element: " +ts.first());
        System.out.println("Last element: " +ts.last());
    }
}
