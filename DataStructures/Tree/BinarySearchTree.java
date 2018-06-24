
public class BinarySearchTree {
    private BinaryTreeNode root;

    BinarySearchTree(int data){
        root = new BinaryTreeNode(data);
    }

    public void insert(int data) {
        root = insert(root,data);

        System.out.println(root.data);
    }

    public BinaryTreeNode insert(BinaryTreeNode node, int data)
    {
        if(node == null)
        {
            node = new BinaryTreeNode(data);
        }
        else
        {
            if(data > node.data)
            {

            }
        }

        return node;
    }
}
