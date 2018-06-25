public class Main {
    public static void main(String[] args){

        BinarySearchTree bs = new BinarySearchTree(6);
        bs.insert(5);
        bs.insert(8);
        bs.insert(2);
        bs.insert(7);

        bs.preOrder();
        System.out.println("-----");
        bs.postOrder();
    }
}
