public class Methods{

   static  int v = 10;
    public  void square(int n){
        System.out.println( v*n*n);

    }
    public static void main(String[] args){
       Methods m = new Methods();
       String s = "Hello";

        System.out.println(s);
        m.square(2);
        v=5;
        m.square(2);
      
      
    }
}