
public class BinarySearchTree {
    private BinaryTreeNode root;

    BinarySearchTree(int data){
        root = new BinaryTreeNode(data);
    }

    public void insert(int data) {
        insertRecurr(root,data);
    }

    public void insertRecurr(BinaryTreeNode node, int data)
    {
        if(node == null)
        {
            node = new BinaryTreeNode(data);
        }
        else
        {
            if(data > node.data)
                insertRecurr(node.right,data);
            else
                insertRecurr(node.left,data);
        }
    }
}
