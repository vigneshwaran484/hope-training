public class Account{
    public static void main(String[] args){
       account ac = new account();
       ac.deposit(500);
        ac.getBalance();
       ac.withdrawal(1000);
       account ac1 = new account();
       ac1.getBalance();
      
    }
}
/*
class account{
    String acname;
    long acnumber;
    int deposits;
    int withdrawal;
    int balance;

    account(String acname,long acnumber, int deposits, int withdrawal){
    this. acname = acname;
    this.acnumber= acnumber;
    this.deposits = deposits;
    this.withdrawal= withdrawal;
   this.balance = deposits-withdrawal;
    }
    void display(){
        System.out.println("name"+acname+"\n acnumber"+acnumber+"\ndeposits"+deposits+"\nwithdrawal"+withdrawal+"\n balance"+balance);
    }
}
*/
class account{
   private double balance;
    void deposit(int amount){
balance += amount;
getBalance();
    }
    void withdrawal(int amount){
        if(amount <= balance){
            System.out.println("amount withdrawal is"+ amount);
            balance-=amount;
    }
    else{
        System.out.println("Balance insufficient");
    }
    }
    void getBalance(){
        System.out.println("Account balance is"+ balance);
    }
    }