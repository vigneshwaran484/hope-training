import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int rollno;
    public Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public int compareTo(Student s){
        return this.rollno-s.rollno;
    }
}
public class ComparableImplementation {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Sugasri",1));
        students.add(new Student("Alice",2));
        students.add(new Student("Bob",3));
        Collections.sort(students);
        //ascending order
        for(Student student : students){
            System.out.println(student.name+" "+student.rollno);
        }
        //descending order
        Collections.sort(students,Collections.reverseOrder());
        for(Student student : students){
            System.out.println(student.name+" "+student.rollno);
        }
    }
}
