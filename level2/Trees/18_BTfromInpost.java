class Solution {
     public TreeNode helper(int [] inorder,int isi ,int iei ,int[] postorder,int psi ,int pei ){
     if(isi>iei){
         return null;
     }
         int idx = isi;
         while(postorder[pei] != inorder[idx]){
             idx++;
         }
         int count = idx-isi;
         TreeNode node = new TreeNode(postorder[pei]);
         node.left = helper(inorder,isi,idx-1,postorder,psi,psi+count-1);
         node.right= helper(inorder,idx+1,iei,postorder,psi+count,pei-1);
         return node;
     }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
          int n = postorder.length;
        return helper(inorder,0,n-1,postorder,0,n-1);
    }
}
