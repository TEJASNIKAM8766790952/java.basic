import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {

        // *odd Number */
        // for(int i=1; i<=50; i++){
        // if(i%2 != 0){
        // System.out.println(i);
        // }
        // }

        // *even number */
        // for(int i=1; i<=50; i++){
        // if(i%2 == 0){
        // System.out.println(i);
        // }
        // }

        // *reverse number in odd */
        // for(int i=100; i>=0; i--){
        // if(i%2 != 0){
        // System.out.println(i);
        // }
        // }

        // * table of 2 to 10 in for loop*
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter Number =");
        // int number=sc.nextInt();
        // int ans=0;
        // for(int i=1; i<=10; i++){
        // ans= i*number;
        // System.out.println(ans);
        // }

        // while loop natural number reverse
        // int i=10;
        // while (i>=0) {
        // System.out.println(i);
        // i--;
        // }

        // while loop even number
        // int i=1;
        // while (i<=10) {
        // if(i%2==0){
        // System.out.println(i);
        // }
        // i++;
        // }

        // doWhile natural
        // int i=0;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i<=10);

        // *Do while loop in reverse in even number*
        // int i = 20;
        // do {
        // if(i % 2 ==0){
        // System.out.println(i);
        // }
        // i--;
        // } while (i >= 0);

        // do while loop in break statement
        // int i=0;
        // do {
        // System.out.println(i);
        // if(i == 15){
        // System.out.println(i);
        // break;
        // }
        // i++;
        // } while (i<=50);

        // **continus statement in for loop**
        // for(int i=0; i<=50; i++){
        // if(i == 15){
        // System.out.println("this is match number ="+i);
        // continue;
        // }
        // System.out.println(i);
        // }

        // **break statement in for loop**
        // for (int i = 0; i <= 50; i++) {
        // if (i == 15) {
        // System.out.println("this is match number =" + i);
        // break;
        // }
        // System.out.println(i);
        // }

        // **Factorial Number in for loop**
        // int fact=1;
        // int num=5;
        // for(int i=1; i<=num; i++){
        // fact=fact*i;
        // }
        // System.out.println("fcatorial number="+fact);

        // // **total number of sum calculate using for loop**
        // int sum = 0;
        // for (int i = 0; i <= 15; i++) {
        // sum = sum + i;
        // }
        // System.out.println(sum);

        // **prime number or not check **/
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter number=");
        // int num=sc.nextInt();

        // if(num !=2 || num ==1){
        // System.out.println("this prime number");
        // }else{
        // System.out.println("this not prime number");
        // }

        // **fibonacci series using for loop **/
        // int num1 = 0, num2 = 1, count = 10 , num3;
        // System.out.println(num1+""+num2);
        // for (int i = 2; i <= count; i++) {
        // num3 = num1 + num2;
        // System.out.println(num3);
        // num1 = num2;
        // num2 = num3;
        // }

        // **Avg Calculate using for loop**
        // Scanner sc = new Scanner(System.in);
        // int num;
        // int sum = 0;
        // float avg = 0;
        // for (int i = 1; i <=7; i++) {
        // System.out.println("enter the 7 number =");
        // num = sc.nextInt();
        // sum = sum + num;
        // avg = sum / 7;
        // }
        // System.out.println("total number of marks"+sum);
        // System.out.println(avg+"%");

        // **user se input or even or odd number total sum**
        // int even = 0;
        // int odd = 0;
        // int count = 5;
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < count; i++) {
        // System.out.println("enter number=");
        // int num = sc.nextInt();
        // if (num % 2 == 0) {
        // even = even + num;
        // } else {
        // odd = odd + num;
        // }
        // }
        // System.out.println("even Sum" + even);
        // System.out.println("odd sum" + odd);

        // //**factorial**
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter number=");
        // int num=sc.nextInt();
        // int fact=1;
        // for(int i=1; i<=num; i++){
        // fact=fact*i;
        // }
        // System.out.println(fact);

        // **table print**
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enetr number");
        // int num = sc.nextInt();
        // int table = 0;
        // for (int i = 1; i <= 10; i++) {
        // table = i * num;
        // System.out.println(table);
        // }

        // //swap program temp variable
        // int temp=0;
        // int a=5;
        // int b=7;
        // System.out.println("orignal value="+a);
        // System.out.println("orignal value="+b);

        // temp=a;
        // a=b;
        // b=temp;
        // System.out.println("Swap value="+a);
        // System.out.println("Swap value="+b);

        // Swap Program only two variable
        // int a = 5;
        // int b = 7;
        // System.out.println("orignal value=" + a);
        // System.out.println("orignal value=" + b);
        // a = a + b;
        // b = a - b;
        // a = a - b;
        // System.out.println("Swap value=" + a);
        // System.out.println("Swap value=" + b);

        // count no. of digit and find the sum of digit
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter number=");
        // int num = sc.nextInt();

        // int digit = 0;
        // int sum=0;

        // while (num != 0) {

        // sum=sum+num%10;
        // num = num / 10;
        // digit++;
        // }
        // System.out.println(digit);
        // System.out.println(sum);

        
    
        //reverse number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number=");
        int num=sc.nextInt();
        int ans=0;
        int digit=0;
        while (num>0) {
            ans =ans*10+num%10;
            num=num/10;
            digit++;
            
        }
        System.out.println("reverse number=
        "+ans);
        System.out.println("total digit of number="+digit);
    }

}
