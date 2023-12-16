package Sorting;


import java.util.Scanner;

public class As_Des_Sorting {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the elements:");

        int n = scanner.nextInt();
        int [] arr = new int[n];
        
    //    System.out.println("Enter the elements:");

        System.out.println("Enter the numbers:");

        for(int i = 0 ; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }

    //    String str= "b";
    //    String string=  "s";
        System.out.println("Bubble sort(b) or Selction sort(s)");

        String choose = scanner.next();
        
        if(choose.equals("b")){
            bubble(arr);
        }
        else if(choose.equals("s"))
        {
            selection(arr);
        }
        else
        {
            System.out.println("Invalid Choice.");
        }

       System.out.println("The sorted numbers are:");

        for(int i = 0; i<n;i++){
            System.out.println(arr[i]);
        }
       
    }

  
    static void bubble(int[] arr)
    {
        for(int i = 0 ; i< arr.length -1; i++)
        {
            for(int j = 0 ; j <arr.length -i-1;j++){
                if(arr[j] >arr [j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void selection(int[]arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int minIndex = i;
             for(int j = 1 + 1 ;j<arr.length;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
             }

             int temp = arr[i];
             arr[i] = arr[minIndex];
             arr[minIndex] = temp;
        }
    }


   
  
    
}
