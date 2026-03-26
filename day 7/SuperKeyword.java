public class SuperKeyword{
    public static void main(String[] args){
superExample2 s2 = new superExample2();
s2.reject();
    }
}
class superExample1{
    superExample1(){
        System.out.println("called in super example1");
    }
    void display(){
        System.out.println("welcome to my home");
    }
}
class superExample2 extends superExample1{
    superExample2(){
        System.out.println("called in super example2");
    }
    void reject(){
        System.out.println("i havent called you");
        super.display();
    }
}
