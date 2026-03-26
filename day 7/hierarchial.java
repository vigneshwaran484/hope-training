// hierarchial inheritance
public class hierarchial{
    public static void main(String[] args) {
        Son s = new Son();
        s.display();
        s.display1();
        Daughter  d = new Daughter();
        d.display();
        d.display2();
    }}
class GrandFather{
    void display(){
        System.out.println("I am grandfather and i have a son and daughter");

    }
}
class Son extends GrandFather{
    void display1(){
        System.out.println("Since you are going to job i let my buisness to your sister");
    }
}
class Daughter extends GrandFather{
    void display2(){
        System.out.println("since i have my own buisness i dont have proper time to manage yours handover the buisness to brother as the job is temporary");
    }
}