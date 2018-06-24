//This is complete binary tree//..so inerstion order will be inorder.

public class BinaryTree {

    private BinaryTreeNode root=null;

    public BinaryTree(int data){
        root = new BinaryTreeNode(data);
    }

    public void insert(int data){
        if(root == null){
            root = new BinaryTreeNode(data);
        }


    }
}
