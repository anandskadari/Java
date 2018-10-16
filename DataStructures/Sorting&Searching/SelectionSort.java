/*
   Selection Sort is sorting n numbers stored in array A by first finding the smallest element
of A and exchanging it with the element in A[1]. Then find the second smallest
element of A, and exchange it with A[2]. Continue in this manner for the first n-1
elements of A.

    Iterations:
    1. [5 2 4 6 1 3 ] -> [1 2 4 6 5 3]
    2. [1 2 4 6 5 3] -> [1 2 4 6 5 3]
    3. [1 2 4 6 5 3] -> [1 2 3 4 6 5]
    4. [1 2 3 4 6 5] -> [1 2 3 4 6 5]
    5. [1 2 3 4 6 5] -> [1 2 3 4 5 6]
 */

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args){
        int[] arr = {31,41,59,26,41,58};
        sort(arr);
    }

    static void sort(int[] arr)
    {
        int len = arr.length;
        int small = 0;
        for(int i=0;i<len-1;i++)
        {
            small = i;
            for(int j=i+1;j<len;j++)
            {
                if(arr[j]<arr[small])
                {
                    small = j;
                }
            }
            if(small != i)
            {
                int temp = arr[i];
                arr[i] = arr[small];
                arr[small] = temp;
            }
        }

        System.out.println("Array is " + Arrays.toString(arr));
    }
}
