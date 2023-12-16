package Basis;

import java.util.Scanner;
public class Resurion {
    public static void main(String [] args){

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int num = scanner.nextInt();
        // System.out.println("Square root of " + num + " = " + squareroot(num));
       System.out.println(fibo(5));

        

    }
    


   // Square root

   public static double squareroot(int num){

    double a; 
    double sqrtroot = num / 2;
    do{
        a = sqrtroot;
        sqrtroot = (a + (num / a))/2;
    }
    while((a - sqrtroot)!=0);
        return sqrtroot; 
   }

   // Fibonacci Series

   public static int fibo (int n){
    if(n < 2){
        return n;
    }

    return fibo(n - 1) + fibo(n - 2) ;

   }

  
   }

   

