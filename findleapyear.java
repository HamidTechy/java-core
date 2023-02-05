import java.util.Scanner;

public class findleapyear {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your year to check is this Leap year or not ");
        int year = obj.nextInt();
        if((year%4==0)&&(year%100!=0) &&(year%400==0)){
            System.out.println("this is leap year");
        }
        else{
            System.out.println("this year is not leap year");
        }
    }

}
