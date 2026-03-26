//multilevel inheritance
public class Inheritance{
    public static void main(String[] args) {
        pupa sound = new pupa();
        sound.display();
        sound.display1();
        sound.display2();
        System.out.println(sound.hashCode());
    }}
class fly
{
    void display(){
        System.out.println("fly is a bird");
    }
}
class Butterfly extends fly{
    void display1(){
        System.out.println("butterfly is a fly");
    }
}
class pupa extends Butterfly{
    void display2(){
        System.out.println("pupa from fly");
    }
}