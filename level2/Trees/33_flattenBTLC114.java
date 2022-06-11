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
    class Pair{
        TreeNode head;
        TreeNode tail;
        Pair(){
            
        }
       Pair(TreeNode head , TreeNode tail){
            this.head=head;
            this.tail=tail;
        }
    }
    public void flatten(TreeNode root) {
        if(root != null){
            helper(root);
        }
    }
    public Pair helper(TreeNode root){
        if(root.left != null && root.right != null){
            Pair lp = helper(root.left);
            Pair rp = helper(root.right);
            
            Pair mp = new Pair();
            mp.head=root;
            mp.head.left = null;
            mp.head.right = lp.head;
            lp.tail.right = rp.head;
            mp.tail = rp.tail;
            return mp;
        }else if(root.left != null){
            Pair lp = helper(root.left);
            
            Pair mp = new Pair();
            mp.head=root;
            mp.head.left = null;
            mp.head.right = lp.head;
           
            mp.tail = lp.tail;
             return mp;
        }else if(root.right != null){
             Pair rp = helper(root.right);
            
            Pair mp = new Pair();
            mp.head=root;
            mp.head.left = null;
            mp.head.right = rp.head;
            mp.tail = rp.tail;
             return mp;
        }else{
             Pair mp = new Pair(root,root);
              return mp;
        }
    }
}

/********************************** */

class Solution {
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        if(root==null){
            return ;
        }
        flatten(root.right);
        flatten(root.left);
        root.right=prev;
        root.left=null;
        prev=root;
    }
}