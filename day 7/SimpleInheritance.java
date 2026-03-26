public class SimpleInheritance{
    public static void main(String[] args){
        System.out.println("I am inside main");
        Parent p = new child();
        p.display();
        
       
        /* child c = new child();
        c.display();
        c.display1();
        */
      
    }
}
class Parent{
    int x= 10;
    void display(){
System.out.println("I am inside parent");
    }
}
class child extends Parent{
    void display1(){
        System.out.println("i am inside child class  "+ x);
    }
}