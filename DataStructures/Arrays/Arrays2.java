/*

{12,16,87,94,100,56}

find maximum sum but the digits in numbers we choose for maximum sum should not ebe present in another number considered for sum.

for ex: 12,16 and 100 in this we can choose only one number because digit 1 is present in all three numbers and 100 is biggest we choose that.

 */


import java.util.*;

import static java.lang.Math.max;

public class Arrays2 {

    public static void main(String[] args){
        int[] arr = {12,16,87,100};

       int[] memo = new int[1<<10];

        for (int i = 0; i < 1 << 10; i++) memo[i] = -1;

        int res = 0;
        for (int i = 0; i < 1 << 10; i++) {
            res = max(res, dp(i, memo, arr));
        }
        System.out.println("Res = " + res);
    }


    public static int mask(int n) {
        int mask = 0;
        for (int i = 1; n/i>0; i*= 10) {
            int digit = n/i % 10;
            mask |= 1 << digit;
        }
        return mask;
    }

    public static int dp(int set, int memo[], int[] a) {
        if (set == 0) {
            return memo[set] = 0;
        }
        if (memo[set] != -1)
            return memo[set];

        int res = 0;
        for (int i=0;i<a.length;i++) {
            int bitmask = mask(a[i]);
            if ((set | bitmask) == set)
                res = max(dp(set ^ mask(a[i]), memo, a) + a[i], res);
        }
        return memo[set] = res;
    }
}

