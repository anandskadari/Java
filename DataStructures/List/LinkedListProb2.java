
/*
Given list is like L1-L2-L3-L4-L5-L6-L7-L8-L9-L10

make it L1-L10-L2-L9-L3-L8-L4-L7-L5-L6

for this go to mid position of list and then reverse the 2nd of list and for output list pick element from first half and one from 2nd half.

 */

public class LinkedListProb2 {

    public static void main(String[] args){
        MLinkedList<Integer> head = new MLinkedList<>();

        MLinkedList<Integer> list = head;
        for(int i=1;i<=10;i++)
        {
            list.add(i);
            list=list.next();
        }
        //Removing extra null value node added.
        list = null;

        MLinkedList<Integer> reverseList = reverseLinkedList(head);
        System.out.println(reverseList);

    }

    //It will reverse the linked list and returns the head.
    public static MLinkedList<Integer> reverseLinkedList(MLinkedList<Integer> list)
    {
        System.out.println("In List = " + list.get());
        if(list.next == null)
        {
            System.out.println("List.next is null for " + list.get());
            return list.next;
        }
        else {
            list = reverseLinkedList(list.next);
            return list.next;
        }
    }
}
