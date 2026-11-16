/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {

        if(root == null){ //base case 
            return null; 
        }

        //bytt venstre og høyre barn 

        TreeNode temp = root.left; 
        root.left = root.right; 
        root.right = temp; 


        //inverter venstre subtre 

        invertTree(root.left); 


        //inverter høyre subtre 
        invertTree(root.right); 

        return root; 
        
    }
}
