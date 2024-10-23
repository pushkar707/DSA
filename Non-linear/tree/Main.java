public class Main {
    public static void main(String args[]){
        BinaryTree tree1 = new BinaryTree();
        int[] values1 = {7, 10, 8, 11, 6, 5, 2};    
        for(int val : values1){
            tree1.insert(val);
        }
        
        BinaryTree tree2 = new BinaryTree();
        int[] values2 = {7, 10, 8, 11, 6, 5, 4};
        for(int val : values2){
            tree2.insert(val);
        }

        // System.out.println(tree.depth(5));
        // System.out.println(tree.height(1));
        System.out.println(tree1.isEqual(tree2));
        // TreeNode node = tree.find(2);
        // tree.preOrderTraverse();
        // tree.inOrderTraverse();
        // tree.postOrderTraverse();
    }
}
