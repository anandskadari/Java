
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


        So, First we have to divide array into sub arrays and then keep on merging(with sorting) till we get one final merge.

 */

import java.util.Arrays;

public class MergeSort {
    int[] result;
    MergeSort(int[]Arr,int len)
    {
        result = new int[len];
        result = mergeSort(Arr);
        System.out.println(Arrays.toString(result));

    }
    public static void main(String[] args){
        int[] Arr = { 5,2,4,7,1,3,6 };
        //System.out.println(Arrays.toString(Arrays.copyOfRange(Arr,1,2)));
        new MergeSort(Arr,Arr.length);

    }

    public int[] mergeSort(int[] Arr)
    {
        int len = Arr.length;
        if(len>1) {
            int p=0;
            int q=(len/2);

            int[] left;
            int[] right;
            int[] res;

            left = mergeSort( Arrays.copyOfRange(Arr,p,q));
            right = mergeSort(Arrays.copyOfRange(Arr,q,len));
            res = Merge(left,right);
            return res;
        }

        return Arr;
    }

    public int[] Merge(int[] p, int[] q) {

        int len = p.length+q.length;
        int[] result = new int[len];
        int index = 0;
        int i=0,j=0;
        while(index<len)
        {
            if(i>=p.length)
            {
                for(int m=0;m<(q.length - j);m++)
                {
                    result[index]=q[j];
                    j++;
                    index++;
                }
            }
            else if(j>=q.length)
            {
                for(int m=0;m<(p.length - i);m++)
                {
                    result[index]=p[i];
                    i++;
                    index++;
                }
            }
            else if(p[i]<q[j])
            {
                result[index]=p[i];
                i++;
                index++;
            }
            else
            {
                result[index]=q[j];
                j=j+1;
                index++;
            }
        }
        return result;
    }
}
