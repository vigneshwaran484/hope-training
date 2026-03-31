public class Interface{
    public static void main(String[] args){
C c= new C();
c.Show();
c.display();
    }
}
interface A{
    void Show();
   
}
interface B{
    void display();
}
class C implements  A,B{
 public void Show(){
    System.out.println("welcome to show");
}
public void display(){
    System.out.println("Display the details");
}
}