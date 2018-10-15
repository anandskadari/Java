/*
Implements tree like structure with given breadth and depth.

     breadth is 3.
     Depth is 2.

                        root
                         |
     1-------------------2-----------------3
     |                   |                 |
1.1--1.2--1.3      2.1--2.2--2.3     3.1--3.2--3.3

In the above example, dont consider root. Breadth is 3 and depth is 2. And if user asks 9th node then return 2.3
 */


import java.util.Arrays;

public class customTree {

    public static void main(String[] args)
    {
        MyArray arr = new MyArray();
        String[] strArr = arr.createMyArray(3,3);
        System.out.println(Arrays.toString(strArr));
    }

}
class MyArray{
    private String[] strArr;

    public String[] createMyArray(int breadth, int depth){

        int numofElements = (int)GeometricExp(breadth,depth);
        strArr = new String[numofElements];
        fillArray(numofElements,breadth,depth);
        return strArr;
    }

    private double GeometricExp(double breadth, double depth){
        double num = (1-(Math.pow(breadth,depth+1)))/(1-breadth);
        return num-1;
    }

    private void fillArray(int numofElements, int breadth, int depth){
        int total = 0;
        for(int i=0;i<breadth;i++){                 //Initially add breadth num of elements directly.
            strArr[i] = String.valueOf(i+1);
            total++;
        }
        while(total<numofElements){
            int elementsToInsert = 1;
            int parent = (total/breadth) - 1;       //Getting the parent value index
            String name = strArr[parent];
            while(elementsToInsert<=breadth){       //insert next breadth num of elements into array
                strArr[total] = name+"."+String.valueOf(elementsToInsert);
                elementsToInsert++;
                total++;
            }
        }
    }
}