package DAY_10.VsCode;

import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
        try{
            FileReader fileReader=new FileReader("abc.txt");
            System.out.println(fileReader);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
