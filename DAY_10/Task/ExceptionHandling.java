package DAY_10.Task;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result=10/0;  
            System.out.println("Result: " + result);
        }catch(ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }catch(Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        }  
    }
}
//Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception.
//It can be fixed by removing the catch block for ArithmeticException or by placing it after the catch block for Exception.