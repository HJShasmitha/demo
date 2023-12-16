package Sorting;

public class BinarySearch {

    public static void main(String[] args){

        // int[] arr = {11,22,33,44,55,66,77,88,99,100};
        // int x = 66; 
        // int answer = binary(arr, x);
        // System.out.println(answer);

        int [] arr ={-12,-2,11,56,89,100,121,159};
        int target = -2;
        int answer = bs(arr, target);
        System.out.println(answer);

        // int [] arr ={-12,-2,11,56,89,100,121,159};
        // int target = 159;
        // int solution = Search(arr, target, 0, arr.length - 1);
        // System.out.println(solution);
 
    }

    // It's return that the value not the element .
         public static int binary(int arr[] , int x){
        int intial = 0;
        int last = arr.length -1;

        while(intial <= last){
            //  int center = (intial + last) / 2;
             int center = intial + (last - intial) /2;  // Use this in the largest no.of comparsion   
             int a = arr[center];

            if(a == x){
                return a;
            }
             if(a < x){
                intial = center + 1;
            }else{
                last = center - 1;
            }
        }
        return -1;
        
    }

    // It's return that the no.of Index for the following element value.

    public static int bs(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int middle = start + (end - start) /2;

            if(target < arr[middle]){
                end= middle - 1;
            }
            else if(target > arr[middle]){
                start = middle + 1;
            }
            else{
                return middle;
            }
        }
          return -1;

    }


    // Binary Search by using Recursion


    public static int Search(int [] arr, int target, int start, int stop){
        
        if(start > stop){
            return -1;

        }
        int middle = start + (stop - start) /2;

        if(arr[middle] == target){
            return middle;
        }
        if(target < arr[middle]){
          return Search(arr,target,start,middle-1)  ;
        }
        return Search(arr, target, middle + 1, stop);

    }
    
}

