

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
Ex 1: [1,2,3,4,5,6,7] . n=7 and d=2. here GCD is 1. So it is just jump one by one.


    [ 3 2 1 4 5 6 7  ] -> [ 3 2 5 4 7 6 1] -> [ 3 4 5 6 7 2 1 ]
 */


import java.util.Arrays;

public class Arrays1{
    public static void main(String[] args)
    {
        int[] a = new int[]{1,2,3,4,5,6,7};

        //System.out.println(String.format("%02d%s", 1, "GES"));

        String str = "Database:Local, Product:ATM_G6_FIFA, Layer:ATM_G6_FIFA, Recipe Name:ATM_G6_FIFA, Class:,";

        String str2 = "NFO Loading recipe data from ATM_G6_FIFA on database local. Recipe info: Database:Local, Product:ATM_G6_FIFA, Layer:ATM_G6_FIFA, Recipe Name:ATM_G6_FIFA, Class:, Version:,";

        String[] arr = str2.split(":");
        String[] arr2 = Arrays.toString(arr).split(",");
        System.out.println(arr2[2]);  //Database
        System.out.println(arr2[4]);  //Product
        System.out.println(arr2[6]);  //Layer
        System.out.println(arr2[8]);  //RecipeName
        System.out.println(arr2[10]); //Class

    }
}