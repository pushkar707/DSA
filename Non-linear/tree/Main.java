public class Main {
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
    
        tree.insert(7);
        tree.insert(10);
        tree.insert(8);
        tree.insert(11);
        tree.insert(4);
        tree.insert(6);
        tree.insert(1);
        tree.insert(5);

        System.out.println(tree.depth(1));
        // TreeNode node = tree.find(2);
        // tree.preOrderTraverse();
        // tree.inOrderTraverse();
        // tree.postOrderTraverse();
    }
}
