package easy.binarytree;

import util.TreeNode;

/**
 *
 * Date:2018/5/23
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 */
public class S_112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }

        if(root.left==null&&root.right==null){
            return root.val == sum;
        }

        if(root.left==null){
            return hasPathSum(root.right,sum-root.val);
        }

        if(root.right==null){
            return hasPathSum(root.left,sum-root.val);
        }

        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
