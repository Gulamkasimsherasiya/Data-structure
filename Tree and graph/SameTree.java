class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class SameTree {
    
    public static boolean isSameTree(TreeNode p, TreeNode q) {
       
        if (p == null && q == null) {
            return true;
        }
        
        if (p == null || q == null) {
            return false;
        }
        
        if (p.val != q.val) {
            return false;
        }
       
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        
        TreeNode tree1 = new TreeNode(3);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(4);
        tree1.left.right = new TreeNode(1);


        TreeNode tree2 = new TreeNode(3);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(4);
       

        System.out.println(isSameTree(tree1, tree2)); 

        // TreeNode tree3 = new TreeNode(1);
        // tree3.left = new TreeNode(2);

        // TreeNode tree4 = new TreeNode(1);
        // tree4.right = new TreeNode(2);

        // System.out.println(isSameTree(tree3, tree4));
    }
}
