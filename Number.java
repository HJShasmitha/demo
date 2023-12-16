package Basis;
import java.util.Scanner;

public class Number {

    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        // Enter the values of two numbers swapping of the two numbers. without the third variables

        // int a = 12;
        // int b = 56;
        // a = a + b;
        // b = a - b;
        // a = a - b;

        // System.out.println("after swapping" + a + " " + b);
        
//  adding of the even numbers and multiplying it
       // int arr[] = {1,2,3,4,5,6,7,8,9,10};
		// for(int i = 0; i < arr.length; i+=2){
        //     int multiple;
        //     multiple = i * 2;
        //     System.out.println(multiple + " ");
        // }

        // Mutpling of odd numbers

    //   for(int i = 1; i < arr.length; i+=2){
    //     int multiple;
    //     multiple = i *  1;
    //     System.out.println(multiple + " ");
    //   }
    
     
     

        // Prime numbers
    //   Scanner scanner = new Scanner(System.in);
    //   System.out.println("Enter the element ");
    //   int a = scanner.nextInt();
    //   boolean isPrime = true;

    //   if(a > 1){
    //     for(int i = 2; i * i < a; i++){
    //         if(a%2==0){
    //             isPrime = false;
    //         }
    //     }
    //         if(isPrime){
    //             System.out.println("Prime number");
    //         }
    //         else {
    //             System.out.println("Not a Prime Number");
    //         }
    //     }
      
    //     else{
    //         System.out.println("It is Negative");
    //     }
        
      // Modulo and divide

    //   int a = 133568;
    //   int temp = 0;
    //   while(a!=0){
    //     temp = a % 10;

    //     int num = 0;
    //     num = num * 10 + temp;   
    //      a= a / 10;

    //      System.out.println(a);
    //   }
    //   
   
    // Leap Year loops

    // System.out.println("Enter the year");
    // int year = scanner.nextInt();

    // if(year %4 ==0){
    //     System.out.println("It's a leap year");
    // }
    // else{
    //     System.out.println("Not a Leap year");
    // }

    // Factorial

    // System.out.println("Enter the element :");
    // int a = scanner.nextInt();

    // int result = 1;
    // for(int i = 1; i <= a; i++){
    //     result = result * i;
    // }
    // System.out.println(result);



    // Armstrong Numbers

//    int n; 
//    int sum;
//    int i; 
//    int s;

//    System.out.println("Enter the number:");
//    n = scanner.nextInt();
//    sum = 0;
//    i = n;
//    while(n > 0){
//     s = n % 10;
//     n = n / 10;
//     sum = sum +(s * s * s );
//    }
//    if(sum == i){
//     System.out.println("Armstrong Number");
//    }
//    else{
//     System.out.println("Not a Armstrong number");
//    }

// Ternary opearator

    // Finding it is even or else odd number

    // int num = 55;
    // String result;

    //  result = num%2==0 ? "True" : "False";

    //  System.out.println(result);

    // Fibonnacci series

    /*
     * int n1 = 0;
     * int n2 = 1;
     * int n3;
     * int count = 10;
     * 
     * for(int i= 2; i < count; i++){
     * n3 = n1 + n2;
     * System.out.println(n3);
     * n1 = n2;
     * n2 = n3;}
     * 
     */


    // Multiplication of the table

   
    System.out.println("Enter the table");
     int a = scanner.nextInt();
    System.out.println("Enter the number");
    int b = scanner.nextInt();

    for(int i = 1; i <= b; i++){
        System.out.println(a + " * " + b + " = "+ b*i);
    }


   



     

     
}


     







    }
    

