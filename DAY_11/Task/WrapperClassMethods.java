
public class WrapperClassMethods {
    public static void main(String[] args) {
        Integer intObj=Integer.valueOf(10);
        Double doubleObj=Double.valueOf(20.5);
        Character charObj=Character.valueOf('A');
        System.out.println("Integer value: "+intObj.intValue());
        System.out.println("Double value: "+doubleObj.doubleValue());
        System.out.println("Character value: "+charObj.charValue());
        String strNum="30";
        int parsedInt=Integer.parseInt(strNum);
        System.out.println("Parsed integer: "+parsedInt);
        String strDouble="40.5";
        double parsedDouble=Double.parseDouble(strDouble);
        System.out.println("Parsed double: "+parsedDouble);
        String strChar="B";
        char parsedChar=strChar.charAt(0);
        System.out.println("Parsed character: " + parsedChar);
        Integer intObj1=Integer.valueOf(10);
        Integer intObj2=Integer.valueOf(10);
        System.out.println("Comparing Integer objects using equals(): " + intObj1.equals(intObj2));
        System.out.println("Comparing Integer objects using ==:" + (intObj1 == intObj2));
        System.out.println("Comparing Integer objects using compareTo(): " + intObj1.compareTo(intObj2));
        char ch='A';
        System.out.println("Is '" + ch + "' a letter? "+Character.isLetter(ch));
        System.out.println("Is '" + ch + "' a digit? "+Character.isDigit(ch));
        System.out.println("String representation of Integer object: " + intObj.toString());
    }
}