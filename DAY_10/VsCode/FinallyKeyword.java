package DAY_10.VsCode;

public class FinallyKeyword {
    public static void main(String[] args) {
        try {
            int[] arr={1, 2, 3, 4, 5};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("This block will always execute.");
        }
    }
}
