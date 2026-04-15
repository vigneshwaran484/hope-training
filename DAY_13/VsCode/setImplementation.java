package Sugasri_HOPE_Batch_1.DAY_13.VsCode;

import java.util.*;
import java.util.Set;

public class setImplementation {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        Integer a=1;
        set.add(a);
        System.out.println(set.hashCode());
        set .add(0);
        System.out.println(set);
        System.out.println(set.contains(1));

    }
}
