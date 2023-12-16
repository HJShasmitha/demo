  package Sorting;

import java.util.Arrays;

public class MergedOfArrays {
    public static void main(String[] args)
    {
        int[] arr1 = {2, 5, 7};
int[] arr2 = {1, 3, 4, 6};

int[] mergedArray = mergeArrays(arr1, arr2);

for (int i = 0; i < mergedArray.length; i++) {
  System.out.print(mergedArray[i] + " ");
}

    }
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
      
        while (i < arr1.length && j < arr2.length) {
          if (arr1[i] < arr2[j]) {
            mergedArray[k] = arr1[i];
            i++;
          } else {
            mergedArray[k] = arr2[j];
            j++;
          }
          k++;
        }
      
        while (i < arr1.length) {
          mergedArray[k] = arr1[i];
          i++;
          k++;
        }
      
        while (j < arr2.length) {
          mergedArray[k] = arr2[j];
          j++;
          k++;
        }
      
        return mergedArray;
      }
      

      
  }

