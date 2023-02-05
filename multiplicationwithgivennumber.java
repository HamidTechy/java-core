import java.util.Scanner;

public class multiplicationwithgivennumber {
    public static void main(String[] args){
        System.out.println("Enter the number of which you want multiplication table ");
        Scanner obj = new Scanner(System.in);
        int table = obj.nextInt();

        for(int i= 1; i<=10; i++){
            System.out.println(table +" X "+ i+ " = "+ (table*i));
        }
    }
}
