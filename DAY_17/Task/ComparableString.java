package Sugasri_HOPE_Batch_1.DAY_17.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Student implements Comparable<Student> {
    String name;
    public Student(String name){
        this.name = name;
    }
    public int compareTo(Student other){
        return this.name.compareTo(other.name);
    }
    public String toString() {
        return name;
    }
}
public class ComparableString {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Sugasri"));
        students.add(new Student("Arun"));
        students.add(new Student("Vijay"));
        students.add(new Student("Balan"));
        // 1. Ascending Order (Uses the compareTo method automatically)
        Collections.sort(students);
        System.out.println("Ascending:  " + students);
        // 2. Descending Order (Reverses the natural ordering)
        Collections.sort(students, Collections.reverseOrder());
        System.out.println("Descending: " + students);
    }
}
