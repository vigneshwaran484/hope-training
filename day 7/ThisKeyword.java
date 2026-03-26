public class ThisKeyword{
    public static void main(String[] args) {
        Student s1 = new Student("uma","24cs284");
        s1.display();
        System.out.println(s1.hashCode());

        
        Student s2 = new Student("uma","24cs384","CSE");
        s2.display();
        System.out.println(s2.hashCode());

         Student s3 = new Student("uma","24cs484");
         s3.display();

        System.out.println(s3.hashCode());

        
    }
    }
class Student{
    String name ;
    String rollno;
    String dept;
    Student(String name, String rollno){
        this.name = name;
        this.rollno = rollno;
    }
     Student(String name, String rollno,String dept){
        this.name = name;
        this.rollno = rollno;
        this.dept = dept;
    }
    void display(){
        System.out.println("name "+ this.name+"\nRollno "+ this.rollno+"\ndept "+this.dept);
    }
}