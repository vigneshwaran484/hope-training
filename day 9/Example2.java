public class Example2{
    public static void main(String[] args){
UPI a = new UPI();
a.method(300);
cash b = new cash();
b.method(200);
card c = new card();
c.method(400);
    }
}
interface Payment{
    void method( int amount);
}
class UPI implements Payment{
    public void method( int amount){
System.out.println("By UPI transaction"+amount);
    }
}
class cash implements Payment{
    public void method(int amount){
        System.out.println("By cash "+amount);
    }
}
class card implements Payment{
    public void method (int amount){
        System.out.println("By card"+amount);
    }
}
