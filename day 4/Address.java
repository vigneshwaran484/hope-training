public class Address{
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        System.out.println(arr);
        System.out.println(arr.hashCode());
        int arr1[] = arr;
        System.out.println(arr1.toString());
        arr[0]=10;
        arr1[2] = 11;
        System.out.println(arr1[0]+" "+arr1[2]);
        String arr2[] = {"Hello"};
        System.out.println(arr2);
        System.out.println(arr2[0].hashCode());
        Integer arr3[] = {2,3,4};
        System.out.println(arr3[1].hashCode()==3);
        Integer a = 2;
        System.out.println(a.hashCode());
System.out.println(a.hashCode()==arr3[0].hashCode());
    }}
