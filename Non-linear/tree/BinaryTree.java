import java.util.*;

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

    private int depth(TreeNode root, int val){
        if(root == null) return -1;

        if(root.data == val) return 0;

        if(val < root.data)
            return 1 + depth(root.leftNode, val);
        
        return 1+depth(root.rightNode, val);
    }
    
    public int depth(int val){
        return depth(root, val);
    }

    private int heightOfTree(TreeNode root){
        if(root == null) return 0;

        if(root.leftNode == null && root.rightNode == null) return 0;

        return 1 + Math.max(heightOfTree(root.leftNode), heightOfTree(root.rightNode)); 
    }

    private int heightOfNode(TreeNode root, int val){
        if(root == null) return -1;

        if(root.data == val) return heightOfTree(root);

        if(val <= root.data){
            return heightOfNode(root.leftNode, val);
        }
        return heightOfNode(root.rightNode, val);
    }

    public int height(int val){
        return heightOfNode(root, val);
    }

    private int getMinimum (TreeNode root){
        if(root == null) return -1;

        if(root.leftNode == null) return root.data;

        return getMinimum(root.leftNode);
    }

    public int getMinimum(){
        return getMinimum(root);
    }

    private boolean isEqual(TreeNode r1, TreeNode r2){
        if(r1 == null && r2 == null) return true;
        if(r1 == null) return false;
        if(r2 == null) return false;

        if(r1.data != r2.data) return false;
        return isEqual(r1.leftNode, r2.leftNode) && isEqual(r1.rightNode , r2.rightNode);
    }

    public boolean isEqual(BinaryTree tree){
        return isEqual(root, tree.root);
    }

    private void nodeAtkDistance(TreeNode root, int k){
        if(root == null || k < 0) return;

        if(k == 0){
            System.out.println(root.data);
            return;
        }

        nodeAtkDistance(root.leftNode, k-1);
        nodeAtkDistance(root.rightNode, k-1);
    }

    public void nodeAtkDistance(int k){
        nodeAtkDistance(root, k);
    }

    public String levelOrderTraversal(){
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        int lastNum = root.data;
        int row = -1;

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if(node.data <= lastNum){
                List<Integer> currList = new ArrayList<>();
                currList.add(node.data);
                list.add(currList);
                row++;
            }else
                list.get(row).add(node.data);
            
            lastNum = node.data;

            if(node.leftNode != null){
                q.offer(node.leftNode);
            }

            if(node.rightNode != null){
                q.offer(node.rightNode);
            }
        }
        return list.toString();   

        // You can also use size of queue at a time to poll all the nodes in queue at a time, and offer back the sub-nodes of all those nodes
    }
}
