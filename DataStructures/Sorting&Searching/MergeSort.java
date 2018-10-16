
/*
    A[]= { 5; 2; 4; 7; 1; 3; 2; 6 }
    first divide the array into smallest sub elements which is 1 in element in each array. then compare left and right elements and merge them.

                          {1 2 2 3 4 5 6 7}                       ->Final sorted sequence
                                |
                       ----------------------
                       |                     |
                   {2 4 5 7}              {1 2 3 6}               ->merging below 4 sub array into 2 subarray
                       |                     |
                 ------------           ------------
                 |           |          |           |
              {2   5}     {4   7}    {1   3}     {2   6}         ->4 sub arrays after merging below 8 sub array
                 |           |          |           |
            ---------    --------    --------   --------
            {5}   {2}    {4}   {7}   {1}  {3}   {2}   {6}       ->Final sub array with 1 elements in each array


        So, First we have to divide array into sub arrays and then keep on merging till we get one final merge.

 */

public class MergeSort {
    public static void main(String[] args){
        int[] Arr = { 5,2,4,7,1,3,2,6 };
        

    }

    static void sort(int[] Arr)
    {

    }

}
