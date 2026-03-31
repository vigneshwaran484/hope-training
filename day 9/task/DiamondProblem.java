public class DiamondProblem{
public static void main(String[] args) {
    member m = new member();
    m.role();
    m.study();
    m.teach();
}}
interface A{
    void role();
}
interface student extends A{
    void study();
}
interface teacher extends A{
    void teach();
}
class member implements student,teacher{
    public void role(){
        System.out.println("display the role of both student and teacher");
    }
    public void teach(){
        System.out.println("the role of teacher is teaching");
    }
    public void study(){
        System.out.println("the role of student is studying");
    }
}