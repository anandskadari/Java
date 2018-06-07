
import java.lang.*;

/*
Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
*/
/*
First Approach: create a new array of size (d) , copy 1st "d" elements to new array and then move
remamining elements in original arr to the left by d times. like a[0] = a[0+d],
and copy the elements in new array to original arr at end.
TC : O(n) ->has to access complete array
SC : O(d) ->new array space.

Second Approach: Without creating new array , roatate array by d times.
TC : O(n*d)
SC : O(1)

Third Approach:
Ex 1: [1,2,3,4,5,6,7] . n=7 and d=2.
    [ 3 2 1 4 5 6 7  ] -> [ 3 2 5 4 7 6 1] -> [ 3 4 5 6 7 2 1 ]
 */


public class Array1{
    public static void main(String[] args)
    {
        int[] a = new int[7];
    }
}