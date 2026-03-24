public class PrimitiveData {
    public static void main(String[] args){
        byte a=-128;
        byte b=127;
        System.out.println("The range of byte is "+a+","+b);
        short s1=-32768;
        short s2=32767;
        System.out.println("The Range of integer is "+s1+","+s2);
        int i1=2147483647;
        int l2=-2147483648;
        System.out.println("The Range of integer is "+i1+","+l2);
        double d=200000.25999;
        System.out.print("Double: "+d);
        long l=250L;
        System.out.println("Long: "+l);
        float f=20.5f;
        System.out.println("Float: "+f);
    }
}