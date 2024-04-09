import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        // star pattern print
        // *
        // **
        // ***
        // ****
        // *****
        // for(int i=1; i<5; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // star pattern
        // ******
        // *****
        // ****
        // ***
        // **
        // for (int i = 1; i < 5; i++) {
        // for (int j = 5; j >= i; j--) {
        // System.out.print("*");

        // }
        // System.out.println();
        // }

        // star pattern
        // *
        // * *
        // * * *
        // * * * *
        // * * *
        // * *
        // *
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");

        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= 3; i++) {
        // for (int j = 3; j>=i; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // star pattern
        //      *
        //     **
        //    ***
        //   ****
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 3; j >= i; j--) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //star pattern
            //  ****
            //   ***
            //    **
            //     *
        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=4; k>=i; k--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //star pattern
    //      *
    //     **
    //    ***
    //   ****
    //    ***
    //     **
    //      *
        // for(int i=1; i<=4; i++){
        //     for(int j=3; j>=i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=3; k>=i; k--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //star pattern
       // ***********
       // *         *
       // *         *
       // *         *
       // ***********
       Scanner sc=new Scanner(System.in);
       System.out.println("enter Colunm Number=");
       int a=sc.nextInt();
       System.out.println("enter Row Number=");
       int b=sc.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                if(i==1|| i==a|| j==1 || j==b){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
