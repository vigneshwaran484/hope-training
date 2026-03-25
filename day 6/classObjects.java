public class classObjects{
    public static void main(String[] args) {
        System.out.println("I am inside class objects");
    Apartment apt = new Apartment();
    apt.Display();

    }
    }
    // only the file name class should be public
 class Apartment{
    public void Display(){
        System.out.println("I am inside class apartment");
    }

 }