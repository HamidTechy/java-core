import java.util.Scanner;

public class functions {
    public static void sum(int add1 ,int add2){
        System.out.println(add1 + add2);
    }
    public static void subtract(int sub1 ,int sub2){
        System.out.println(sub2 - sub2);
    }
    public static void multi(int multi1 ,int multi2){
        System.out.println(multi1 * multi2);
    }
    public static void divi(int div1 ,int div2){
        System.out.println(div1 / div2);
    }
    public static void main(String[] args){
//        accesss modifiers
//        public private protecter
        System.out.println("Welcom to my calculater");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        int user = myObj.nextInt();
        switch(user){
            case 1:
                Scanner myObj1 = new Scanner(System.in);
                System.out.println("Please enter your value");
                int a = myObj1.nextInt();
                Scanner myObj2 = new Scanner(System.in);
                System.out.println("Please enter your value");
                int b = myObj2.nextInt();
                sum(a, b);
                break;
            case 2:
                Scanner myObj3 = new Scanner(System.in);
                System.out.println("Please enter your value");
                int y = myObj3.nextInt();
                Scanner myObj4 = new Scanner(System.in);
                System.out.println("Please enter your value");
                int z = myObj4.nextInt();
                subtract(y, z);
                break;
            case 3:
                Scanner myObj5 = new Scanner(System.in);
                System.out.println("Please enter your value");
                int w = myObj5.nextInt();
                Scanner myObj6 = new Scanner(System.in);
                System.out.println("Please enter your value");
                int x = myObj6.nextInt();
                multi(w, x);
                break;
            case 4:
                Scanner myObj7 = new Scanner(System.in);
                System.out.println("Please enter your value");
                int u = myObj7.nextInt();
                Scanner myObj8 = new Scanner(System.in);
                System.out.println("Please enter your value");
                int v = myObj8.nextInt();
                divi(u, v);
                break;
            default:
                System.out.println("Please enter valid number");

        }

    }

}
