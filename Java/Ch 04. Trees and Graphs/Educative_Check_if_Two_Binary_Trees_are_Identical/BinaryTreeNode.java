package Educative_Check_if_Two_Binary_Trees_are_Identical;

import jdk.nashorn.api.tree.BinaryTree;

public class BinaryTreeNode {
    /* Class containing left and right child of current
   node and key value*/

        int key;
        BinaryTreeNode left, right;

        public BinaryTreeNode(int item)
        {
            key = item;
            left = right = null;
        }

}
