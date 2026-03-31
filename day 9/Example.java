public class Example{
    public static void main(String[] args) {
       C a = new C();
       a.JobType1(30000);
       a.JobType2(300,4); 
    }}
interface salary{
    void JobType1(int amount);
}
interface salary2{
    void JobType2(int amount,int hr);
}
class C implements salary,salary2{
    public void JobType1(int amount){
        System.out.println("the salary is"+amount);
    

    }
    public void JobType2(int amount,int hr){
        System.out.println("the salary for part time is"+(amount*hr));
    }
}