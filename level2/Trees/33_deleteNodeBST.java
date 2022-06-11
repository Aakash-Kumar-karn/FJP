class Solution {
     public int max(TreeNode root){
      
        TreeNode curr = root;
        while(curr.right!=null){
            curr=curr.right;
        }
        return curr.val;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(key<root.val){
            root.left = deleteNode(root.left,key);
        }else if(key>root.val){
            root.right = deleteNode(root.right,key);
        }else{
            if(root.left == null && root.right == null){
                return null;
            }else if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
           int maxEle = max(root.left);
           root.val=maxEle;
           root.left=deleteNode( root.left, maxEle) ;
                //return root;
            }
        }
        return root;
    }
}