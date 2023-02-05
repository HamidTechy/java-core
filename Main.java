import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Dashboard");
        System.out.println("inter 3 different number to check which number is greatest");
        Scanner obj = new Scanner(System.in);
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int num3 = obj.nextInt();

        if(num1>num2 && num1>num2){
            System.out.println("Your greater number is "+ num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Your greater number is "+ num2);
        }
        else if(num3>num1 && num3>num2){
            System.out.println("Your greater number is "+ num3);
        }

    }
}