public class polymorphism{
    public static void main(String[] args) {
      /* Animal a = new Cat();
     Animal    b = new Dog();
       b.sound();
       a.sound();
       */
        Animal a ;// down casting
        a = new Cat();
        a.sound();
        System.out.println(a.hashCode());
        a = new Dog();
        a.sound();
        System.out.println(a.hashCode());
    }
}
class Animal{
    void sound(){
        System.out.println("Animals always have a  different sound");
    }
}
class Dog extends  Animal{
  void sound(){
    super.sound();
    System.out.println("Dog will bark");
  }
}
class Cat extends  Animal{
 void sound(){
   super. sound();
    System.out.println("cat will make a sound meow");
 }
}