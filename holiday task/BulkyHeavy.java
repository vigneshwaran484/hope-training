// leetcode 2525
import java.util.Scanner;

public class BulkyHeavy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int length = sc.nextInt();
         int width = sc.nextInt();
         int height = sc.nextInt();
         int mass = sc.nextInt();
      boolean bulk = (length >= 10000||width >=10000||height >= 100000||(long)length*width*height >=1000000000) ;
      boolean heavy = mass>=100;
      if(bulk && heavy) {
        System.out.println("both");
      } 
      else if(bulk){
        System.out.println("bulky");
      }
      else if(heavy){
        System.out.println("heavy");
      }
      else{
        System.out.println("neither");
      }
    }
}