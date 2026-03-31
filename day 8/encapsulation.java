public class encapsulation{
    public static void main(String[] args){
Encapsulation en = new Encapsulation();
en.display();
    }
}
class Encapsulation{
   
    int a;
    Encapsulation(){
        a =10;
    }
    void display(){
        System.out.println("Implementation of encapsulation "+ a);
    }
}