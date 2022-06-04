class Solution {
    
    public TreeNode helper(int[] preorder,int psi ,int pei ,int [] inorder,int isi ,int iei){
       
        if(isi>iei){
            return null;
        }
        int idx = isi;
        while(preorder[psi] != inorder[idx]){
            idx++;
        }
        int count = idx-isi;
        TreeNode node = new TreeNode(preorder[psi]);
        node.left=helper(preorder,psi+1,psi+count , inorder,isi,idx-1);
        node.right=helper(preorder,psi+count+1,pei , inorder,idx+1,iei);
        return node;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder,0,n-1,inorder,0,n-1);
    }
}