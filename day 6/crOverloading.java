public class crOverloading{
        public static void main(String[] args) {
       System.out.println("Constructor Overloading examples");
        crOverload cr2 =new crOverload();
       crOverload cr = new crOverload(5);
       crOverload cr1 = new crOverload("hope batch");

    }
    
    }
    class crOverload{
    crOverload(){
System.out.println("Default constructor with no parameter");
    }
    crOverload(int i){
        System.out.println("parameterized constructor "+ i);
    }
    crOverload(String i){
        System.out.println("parameter constructor overloading"+i);
    
    }
    }
