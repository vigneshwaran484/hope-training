package DAY_10.VsCode;

public class ThrowException {
    public static void main(String[] args) {
         try{
            int age=15;
        if(age<=18){
            throw new ArithmeticException("Age should be greater than 18");
        } else{
            System.out.println("You are eligible to vote.");
         }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
