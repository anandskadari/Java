import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BinarySearchTree {
    private BinaryTreeNode root;

    BinarySearchTree(int data){
        root = new BinaryTreeNode(data);
    }

    public void insert(int data) {
        insertRecurr(root,data);
    }

    private BinaryTreeNode insertRecurr(BinaryTreeNode node, int data)
    {
        if(node == null)
        {
            node = new BinaryTreeNode(data);
            System.out.println("creating new node = " + data);
        }
        else
        {
            if(data > node.data) {
                System.out.println("inserting at right");
                node.right = insertRecurr(node.right, data);
            }
            else {
                System.out.println("inserting at left");
                node.left = insertRecurr(node.left, data);
            }
        }

        return node;
    }

    public void preOrder(){
        preOrderRecc(root);
    }

    private void preOrderRecc(BinaryTreeNode node)
    {
        if(node == null)
            return;

        System.out.println(node.data);
        preOrderRecc(node.left);
        preOrderRecc(node.right);
    }

    public void postOrder(){
        postorder(root);
    }

    private void postorder(BinaryTreeNode node)
    {
        if(node == null)
            return;

        postorder(node.left);
        System.out.println(node.data);
        postorder(node.right);
    }

    public void levelOrder()
    {
        levelOrder(root);
    }

    private void levelOrder(BinaryTreeNode node)
    {
        if(node == null)
            return;

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(node);
        BinaryTreeNode temp = null;
        while(!queue.isEmpty()) {
            temp = queue.poll();
            if(temp.left != null)
                queue.add(temp.left);

            if(temp.right != null)
                queue.add(temp.right);

            System.out.println(temp.data);
        }
    }
}
