import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        BinarySearchTree bs = new BinarySearchTree(8);
        bs.insert(5);
        bs.insert(9);
        bs.insert(2);
        bs.insert(7);
        bs.insert(6);

        System.out.println("---Pre Order---");
        bs.preOrder();
        System.out.println("---Post Order---");
        bs.postOrder();
        System.out.println(("---Level Order---"));
        bs.levelOrder();

    }
}
