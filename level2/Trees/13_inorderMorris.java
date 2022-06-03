class Solution {
    public TreeNode getrightmost(TreeNode leftnode , TreeNode curr){
            
            while(leftnode.right != null && leftnode.right != curr){
                leftnode=leftnode.right;
            }
        return leftnode;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
           List<Integer> ans = new ArrayList<Integer>();
        TreeNode curr = root;
        while(curr !=null){
            TreeNode leftnode = curr.left;
        if(curr.left==null){
            ans.add(curr.val);
            curr=curr.right;
        }else{
            TreeNode temp = getrightmost(leftnode ,curr);
            if(temp.right==null){
                //thread create
                temp.right=curr;
                curr=curr.left;
            }else{
                temp.right=null;
                ans.add(curr.val);
                curr=curr.right;
            }
        }
    }
        return ans;
    }
}