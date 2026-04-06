package DAY_10.Task;
//All access modifiers with three classes extended

class privateClass{
    private void display(){
        System.out.println("This is a private method.");
    }
}
class defaultClass extends privateClass{
    void display(){
        System.out.println("This is a default method.");
    }
}
class protectedClass extends defaultClass{
    protected void display(){
        System.out.println("This is a protected method.");
    }
}
public class AccessModifiers extends protectedClass{
    public static void main(String[] args) {
        privateClass privateObj=new privateClass();
        // privateObj.display(); // Error: Cannot access private method
        defaultClass defaultObj=new defaultClass();
        defaultObj.display();  
        protectedClass protectedObj=new protectedClass();
        protectedObj.display();  
        AccessModifiers accessObj=new AccessModifiers();
        accessObj.display();  
    }
}
