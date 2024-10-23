class TreeNode {
    int data;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(int data){
        this.data = data;
    }
}

public class BinaryTree {
    private TreeNode root;

    public BinaryTree(){
        root = null;
    }

    public TreeNode insert(TreeNode root, int val){
        if(root == null){
            root = new TreeNode(val);
            return root;
        }

        if(val <= root.data){
            root.leftNode = insert(root.leftNode, val);
        }else
            root.rightNode = insert(root.rightNode, val);

        return root;
    }

    public void insert(int val){
        root = insert(root, val);
    }

    public TreeNode find(TreeNode root, int val){
        if(root == null)
            return null;
        else if(root.data == val){
            return root;
        }
            
        if(val < root.data)
            return find(root.leftNode, val);
        return find(root.rightNode, val);
    }

    public TreeNode find(int val){
        return find(root, val);
    }

    private void preOrderTraverse(TreeNode root){
        if(root == null)
            return;
        
        System.out.println(root.data);
        preOrderTraverse(root.leftNode);
        preOrderTraverse(root.rightNode);
    }

    public void preOrderTraverse(){
        preOrderTraverse(root);
    }

    private void inOrderTraverse(TreeNode root){
        if(root == null)
            return;
        
        inOrderTraverse(root.leftNode);
        System.out.println(root.data);
        inOrderTraverse(root.rightNode);
    }

    public void inOrderTraverse(){
        inOrderTraverse(root);
    }

    private void postOrderTraverse(TreeNode root){
        if(root == null)
            return;
        
        postOrderTraverse(root.leftNode);
        postOrderTraverse(root.rightNode);
        System.out.println(root.data);
    }

    public void postOrderTraverse(){
        postOrderTraverse(root);
    }

    private int depth(TreeNode root, int val, int depth){
        if(root == null) return -1;

        if(root.data == val) return depth;

        if(val < root.data)
            return 1 + depth(root.leftNode, val, depth);
        
        return 1+depth(root.rightNode, val, depth);
    }
    
    public int depth(int val){
        return depth(root, val, 0);
    }

    private int height(TreeNode root, int val, int height){
        
    }
}