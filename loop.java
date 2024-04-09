import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        // *If else codition who number is gether than user three input*
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter First Number=");
        // int a=sc.nextInt();
        // System.out.println("Enter Second Number=");
        // int b=sc.nextInt();
        // System.out.println("Enter Second Number=");
        // int c=sc.nextInt();
        // if(a>b && a>c){
        // System.out.println("gether then number A="+a);
        // }else if(b>a && b>c ){
        // System.out.println("gether then number B="+b);
        // }else{
        // System.out.println("gether then number C="+c);
        // }


        // *user two number in calculater if else if conditon*
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter First Number=");
        // int a=sc.nextInt();
        // System.out.println("Enter Second Number=");
        // int b=sc.nextInt();
        // System.out.println("Enter choice Number=");
        // int choice=sc.nextInt();

        // if (choice ==1) {
        // System.out.println(a+b);

        // }else if (choice ==2) {
        // System.out.println(a-b);

        // }else if (choice ==3) {
        // System.out.println(a*b);

        // }else if (choice ==4) {
        // System.out.println(a/b);

        // }else{
        // System.out.println("invalid choice number");
        // }

        // *switch condtion calulate*
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter First Number=");
        // int a = sc.nextInt();
        // System.out.println("Enter Second Number=");
        // int b = sc.nextInt();
        // System.out.println("Enter choice Number=");
        // int choice = sc.nextInt();
        // switch (choice) {
        // case 1:
        // System.out.println(a + b);
        // break;
        // case 2:
        // System.out.println(a - b);
        // break;
        // case 3:
        // System.out.println(a * b);
        // break;
        // case 4:
        // System.out.println(a / b);
        // break;
        // case 5:
        // System.out.println(a % b);
        // break;

        // default:
        // System.out.println("invalid choice number");
        // break;
        // }

        // *Marks Dispaly if else condition*/
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter First Number=");
        // int a = sc.nextInt();
        // if(a<=35 ){
        // System.out.println("fail");
        // } else if (a>=35 && a<=50){
        // System.out.println("grade C");
        // } else if (a>=50 && a<=70){
        // System.out.println("grade B");
        // } else if (a>=80 && a<=100){
        // System.out.println("grade A");
        // }

        // *Even Odd Program */
        // System.out.println("Enter First Number=");
        // int a = sc.nextInt();
        // if(a % 2 ==0){
        // System.out.println("This is even Number");
        // }else{
        // System.out.println("This is odd Number");
        // }

        // /*find square and rectangle*/
        System.out.println("Enter First Number=");
        double  length= sc.nextInt();
        System.out.println("Enter First Number=");
        double width= sc.nextInt();
        if (length == width) {
            System.out.println("it is square");
        } else {
            System.out.println("it's a rectangle");
        }
    }
}
