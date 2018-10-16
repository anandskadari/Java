
/*
    lets consider we have to sort elements in an array [5 2 4 6 1 3 ]

    So in insertion sort, we take each element and move to left till any smaller element is found.
    1st 5 cannot be moved to left. so we start the iteration always with 2nd element.

    Iterations:
    1.so move 2nd index element "2" to left -> after 1st iteration -> [2 5 4 6 1 3]
    2.now take 3rd element "4" and keep moving to left till it finds smaller element. -> [2 4 5 6 1 3]
    3.4th element is 6 and we cant move it to left because 5 is smaller than 6. -> [2 4 5 6 1 3]
    4.5th element is 1 and we keep moving  it to left till any smaller element is found or first position is reached. -> [1 2 4 5 6 3]
    5.6th element is 3 , so keep moving to left till smaller element element(which is 2 here) -> [1 2 3 4 5 6]

    now the elements is sorted.

    so one loop(outer) for number of elements and another loop for moving elements to left.

    Insertion sort can be imagined as sorting playing cards with all cards in hands.
 */

import java.util.Arrays;
import java.util.HashMap;

public class InsertionSort {
    public static void main(String[] args)
    {
        int[] arr = {31,41,59,26,41,58};
        sort(arr);
    }

    static void sort(int[] arr)
    {
        int len = arr.length;
        int i,j;
        for(i=1;i<len;i++)
        {
            j = i;
            while(j>0){
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                j--;
            }
        }

        System.out.println("Array is " + Arrays.toString(arr));
    }
}
