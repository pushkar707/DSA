public class Main {
    public static void main(String args[]){
        BinaryTree tree1 = new BinaryTree();
        int[] values1 = {7, 3, 8, 1, 4, 7, 10, 9, 1, 2};    
        for(int val : values1){
            tree1.insert(val);
        }

        // System.out.println(tree1.height(2));
        // tree1.preOrderTraverse();
        // tree1.inOrderTraverse();
        tree1.postOrderTraverse();
        // System.out.println(tree1.levelOrderTraversal());;
    }
}
