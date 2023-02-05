import java.util.Scanner;

import java.util.Scanner;

public class findnumberofdaysinmonth {
    public static void main(String[] args){
        System.out.println("Enter the month from 1 to 12 that you want to know the days in that month");
        Scanner obj = new Scanner(System.in);
        int month = obj.nextInt();
        if(month>=1&&month<=12){
            if(month==1){
                System.out.println("This month has 31 days");
            }
            else if(month==3){
                System.out.println("This month has 31 days");
            }
            else if(month==5){
                System.out.println("This month has 31 days");
            }
            else if(month==7){
                System.out.println("This month has 31 days");
            }
            else if(month==8){
                System.out.println("This month has 31 days");
            }
            else if(month==10){
                System.out.println("This month has 31 days");
            }
            else if(month==12){
                System.out.println("This month has 31 days");
            }
            else if(month == 4){
                System.out.println("this month has 30 days");
            }
            else if(month == 6){
                System.out.println("this month has 30 days");
            }
            else if(month == 9){
                System.out.println("this month has 30 days");
            }
            else if(month == 11){
                System.out.println("this month has 30 days");
            }
            else if(month == 2){
                System.out.println("this month has 28 days");
                System.out.println("Wants to know leap year Enter your year to check Leap year");
                int leapyear = obj.nextInt();
                if((leapyear%4==0)&&(leapyear%100!=0) &&(leapyear%400==0)){
                    System.out.println("this is leap year");
                }
                else{
                    System.out.println("this year is not leap year");
                }
            }

        }

        else{
            System.out.println("please Enter valid month");
        }

    }
}
