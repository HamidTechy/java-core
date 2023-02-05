public class transaction_system_program {
    public static void main(String[] args) {
        int accountNumber = 35648525;
        int pinCode = 4565;
        int balance = 50000;
        int transaction = 1;
        int withdraw = 15000;

        if(accountNumber==35648525&&pinCode==4565) {
            System.out.println("login successful");
            System.out.println("Balance : "+balance);
            if (withdraw <= balance && transaction<=3) {
                System.out.println("you did transaction of " + withdraw);
                System.out.println("remaining balance"+(balance = balance- withdraw));
                transaction++;}
            if (withdraw <= balance && transaction<=3) {
                System.out.println("you did transaction of " + withdraw);
                System.out.println("remaining balance"+(balance = balance- withdraw));
                transaction++;}
            if (withdraw <= balance && transaction<=3) {
                withdraw = 20000;
                System.out.println("you did transaction of " + withdraw);
                System.out.println("remaining balance"+(balance = balance- withdraw));
                transaction++;}
            if (withdraw <= balance && transaction<=3) {
                System.out.println("you did transaction of " + withdraw);
                System.out.println("remaining balance"+(balance = balance- withdraw));
                transaction++;}




        }
    }
}
