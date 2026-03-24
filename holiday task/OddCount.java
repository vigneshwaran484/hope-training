//Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
import java.util.*;
public class OddCount{
   public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int low = sc.nextInt();
    int high = sc.nextInt();
    int count = (high-low)/2;
    if(high%2==1||low%2==1){
        count++;
    }
    int c = (high+1)/2-(low)/2;
    System.out.println(count);
    System.out.println(c);
   } 
}