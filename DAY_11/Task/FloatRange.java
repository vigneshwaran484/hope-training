public class FloatRange {
    public static void main(String[] args) {
        Integer a=127;
        Integer obj=127;
        System.out.println(a==obj);//true
        Integer b=200;
        Integer obj1=200;
        System.out.println(b==obj1);//false
        Float k=127f;
        Float m=127f;
        System.out.println(k==m);//false 
    }
}
//For ==, Integer may be true due to wrapper caching (-128 to 127), but Float is false because Float objects are not cached.