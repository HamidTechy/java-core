public class patterns {
    public static void main(String[] args){

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
                if(j==i){
                    System.out.print("\n");
                }

            }
        }




        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
                if(j==i){
                    System.out.print("\n");
                }

            }
        }



        for(char col=1; col<=5; col++){
            for(int row=col; row<=5; row++){
                System.out.print(row);
                if(row==col){
                    System.out.print("\n");
                }

            }
        }
    }
}
