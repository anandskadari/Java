/*

{12,16,87,94,100,56}

find maximum sum but the digits in numbers we choose for maximum sum should not ebe present in another number considered for sum.

for ex: 12,16 and 100 in this we can choose only one number because digit 1 is present in all three numbers and 100 is biggest we choose that.

 */


import java.util.ArrayList;
import java.util.HashMap;

public class Arrays2 {

    public static HashMap<Integer,Integer> map = new HashMap<>();
    public static int index = 0;

    public static void main(String[] args){
        int[] arr = {12,16,87,94,100,56};


    }

    public static int maxSum(int[] arr){
        int maxSum = 0;
        ArrayList<Integer> sumArr = new ArrayList<>();

        for(int i = 0; i<arr.length; i++)
        {
            if(isDigitPresent(arr[i],i))
            {
                if(arr[i] > arr[index])
                {
                    sumArr
                }
            }
            else
            {
                sumArr.add(i);
            }
        }

        return maxSum;
    }

    public static boolean isDigitPresent(int num,int ind)
    {
        ArrayList<Integer> digits = getDigits(num);
        boolean isDigitPresent = false;

        for(int i=0;i<digits.size();i++)
        {
            if(map.get(digits.get(i)) != null )
            {
                isDigitPresent = true;
                index = map.get(digits.get(i));
                break;
            }
        }

        if(!isDigitPresent)
        {
            for(int i=0;i<digits.size();i++)
            {
                map.put(digits.get(i),ind);
            }
        }

        return isDigitPresent;
    }

    public static ArrayList<Integer> getDigits(int num){
        ArrayList<Integer> digits = new ArrayList<>();

        while(num>0) {
            int unitPlace = num % 10;
            num = num / 10;
            digits.add(unitPlace);
        }

        return digits;
    }
}

