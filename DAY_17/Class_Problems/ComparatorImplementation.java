 
import java.util.*;
class Student{
    int rollno;
    int age;
    double mark;
    Student(int rollno,int age,double mark){
        this.rollno=rollno;
        this.age=age;
        this.mark=mark;
    }
    public String toString(){
        return "Rollno: "+rollno+" Age: "+age+" Mark: "+mark;
    }
}
// class AgeComparator implements Comparator<Student>{
//     public int compare(Student s1,Student s2){
//         return s1.age-s2.age;
//     }
// }

class AgeComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return Integer.compare(s1.age,s2.age);
    }
}
class MarksComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return Double.compare(s2.mark,s1.mark);
    }
}
class RollNoComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return Integer.compare(s1.rollno,s2.rollno);
    }
}
 
public class ComparatorImplementation {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, 20, 85.5F));
        students.add(new Student(1, 22, 60.0F));
        students.add(new Student(2, 21, 98.0F));
        Collections.sort(students, new AgeComparator());
        Collections.sort(students, new MarksComparator());
        Collections.sort(students, new RollNoComparator());
        for (Student s : students) {
            System.out.println(s);
        }

    }
}
