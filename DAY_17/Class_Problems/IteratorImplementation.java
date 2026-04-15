import java.util.List;
import java.util.*;
public class IteratorImplementation {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){ 
            if(it.next()%2==0){
                it.remove();
            }
            else{
                System.out.println(it.next());
            }
        }
        System.out.println(list);
    }
}