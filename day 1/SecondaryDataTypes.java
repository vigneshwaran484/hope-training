import java.util.*;
public class SecondaryDataTypes {
    public static void main(String[] args){
        String name="Suday";
        System.out.println("My name is "+name);
        boolean isTrue=true;
        System.out.println("The value of boolean is "+isTrue);
        int[] nums={1,2,3,4,5};
        System.out.println("The value of array is "+Arrays.toString(nums));
        String s1="hello";
        System.out.println(s1);
        String s2="hello";
        System.out.println(s1==s2);
        String s3=new String();
        String s4=new String();
        s3="hello";
        s4="hello";
        System.out.println(s3==s4);
        String s5=new String("hello");
        String s6="hello";
        System.out.println(s5==s6);
    }
}