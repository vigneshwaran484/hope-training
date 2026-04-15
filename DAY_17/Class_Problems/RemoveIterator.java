 

import java.util.ArrayList;
import java.util.List;

public class RemoveIterator {
     public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int i:list){
            if(i%2==0){
                list.remove(i);
            }
            else{
                System.out.println(i);
            }
        }
        System.out.println(list);
     }
}
