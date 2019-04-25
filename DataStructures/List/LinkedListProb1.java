import java.util.Iterator;
import java.util.LinkedList;


//Find the Kth element from last using recursion. Otherwise without recursion we can use slow and fast pointer.

public class LinkedListProb1 {

    static int count = 0;
    static int data = 0;
    //static class

    public static void main(String[] args)
    {
        MLinkedList<Integer> head = new MLinkedList<>();
        MLinkedList<Integer> list = head;

        //Populating List
        for(int i=1;i<=10;i++)
        {
            list.add(i);
            list=list.next();
        }

        list = null;

        int k =5;
        traverseUsingRecursion(head,k);
        System.out.println("data = " + data);
    }

    public static void traverseUsingRecursion(MLinkedList<Integer> list,int k)
    {
        if(list.next != null)
        {
            traverseUsingRecursion(list.next,k);
        }
        if(count == k)
        {
            count++;
            data = list.data;
        }
        else
        {
            count++;
        }
    }

}

