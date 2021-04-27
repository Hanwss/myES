package com.han.test;


import javax.swing.tree.TreeNode;

/**
 * @ClassName BinaryTree
 * @Description BTree(二叉树相关算法)
 * @Author hws
 * @Date 2021/4/7 9:58
 * @Version 1.0
 **/
public class BinaryTree  {
   /* //1.反转二叉树
    //思路：递归交换左右节点，在递归交换左节点，右节点

    public TreeNode invertTree(TreeNode root) {
        //递归函数的终止条件，节点为空时返回
        if(root==null) {
            return null;
        }
        //下面三句是将当前节点的左右子树交换
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        //递归交换当前节点的 左子树
        invertTree(root.left);
        //递归交换当前节点的 右子树
        invertTree(root.right);
        //函数返回时就表示当前这个节点，以及它的左右子树
        //都已经交换完了
        return root;
    }*/


}
