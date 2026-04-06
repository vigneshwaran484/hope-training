package DAY_10.Task;

class Account{
    void setPassword(String password)throws WeakPasswordException{
        if (password.length()<8){
            throw new WeakPasswordException("Password must be at least 8 characters");
        } else {
            System.out.println("Password accepted");
        }
    }
}

class WeakPasswordException extends Exception{
    public WeakPasswordException(String message){
        super(message);
    }
}
public class ThrowExample {
     public static void main(String[] args){
        Account a=new Account();
        try {
            a.setPassword("abc12");
        }catch (WeakPasswordException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
