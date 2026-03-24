import java.util.*;
public class MathOperations{
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a");
        a= sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        //string in switch case
        String op = sc.nextLine();
          switch(op){
            case "+":
               System.out.println("sum of a+b "+(a+b));
               break;
            case "-":
                 System.out.println("sub of a-b "+(a-b));
                 break;
            case "*":
                 System.out.println("mul of a*b "+(a*b));
                 break;
            case "/":
                 System.out.println("div of a/b "+(a/b));
                 break;
            case "%":
                 System.out.println("mod of a%b "+(a%b));
                 break;
            default :
             System.out.println("invalid operator");
        }
       //char in switch case
      
       char ch = sc.next().charAt(0);
          switch(ch){
            case '+':
               System.out.println("sum of a+b "+(a+b));
               break;
            case '-':
                 System.out.println("sub of a-b "+(a-b));
                 break;
            case '*':
                 System.out.println("mul of a*b "+(a*b));
                 break;
            case '/':
                 System.out.println("div of a/b "+(a/b));
                 break;
            case '%':
                 System.out.println("mod of a%b "+(a%b));
                 break;
            default :
             System.out.println("invalid operator");
        }
        
       //integer in switch case
        int n = sc.nextInt();
          switch(n){
            case 1:
               System.out.println("sum of a+b "+(a+b));
               break;
            case 2:
                 System.out.println("sub of a-b "+(a-b));
                 break;
            case 3:
                 System.out.println("mul of a*b "+(a*b));
                 break;
            case 4:
                 System.out.println("div of a/b "+(a/b));
                 break;
            case 5:
                 System.out.println("mod of a%b "+(a%b));
                 break;
            default :
             System.out.println("invalid operator");
        }
        }

    }
       
       
       
       
       
     

