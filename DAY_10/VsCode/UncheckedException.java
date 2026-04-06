package DAY_10.VsCode;

public class UncheckedException {
    public static void main(String[] args) {
         try{
            int[] arr=new int[10];
            arr[15]=10;
            System.out.println(arr[15]);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}
