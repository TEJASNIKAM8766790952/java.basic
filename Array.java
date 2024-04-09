import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        //**basic concept array**
        // int Arr[]={10,20,30,40,60,70};
        // System.out.println(Arr[3]);
        // System.out.println("Array size"+Arr.length);
        // System.out.println(Arr[5]);

        // for(int i=0; i<=5; i++){
        // System.out.println(Arr[i]);

        // }

        // **input in user in serching Array List**
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter number=");
        // int num=sc.nextInt();

        // for(int i=0; i<Arr.length; i++){
        // if (Arr[i]==num) {
        // System.out.println("match the number="+i+"=index display"+num);
        // break;
        // }else{
        // System.out.println("Element not found");
        // }
        // }

        // **user input find element in or not**
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter number=");
        // int num=sc.nextInt();
        // boolean found=false;
        // for(int i=0; i<Arr.length; i++){
        // if (Arr[i]==num) {
        // found=true;
        // break;
        // }
        // }

        // if(found){
        // System.out.println("Element found");
        // }else{
        // System.out.println("element not found");
        // }

        //**even number in array list**
        // int Arr[]={1,2,3,4,5,6,7};
        // for(int i=0; i<Arr.length;i++){
        // if(Arr[i] % 2 ==0){
        // System.out.println(Arr[i]);
        // }
        // }

        // **duplicate array**
        // int arr[]={1,2,3,4,5,6,7,1,3,9,8,7,4};
        // for(int i=0; i<arr.length; i++){
        // for(int j=i+1; j<arr.length; j++){
        // if(arr[i]==arr[j]){
        // System.out.println("Duplicate array element"+arr[j]);
        // break;
        // }
        // }
        // }

        // **max value in array list **
        int arr[]={1,2,3,4,5,6,7,1,55,3,9,8,7,4};
        int max=0;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];

            }
           

        }
        System.out.println(max);


        // **rotate array list 1 time**

    }

}
