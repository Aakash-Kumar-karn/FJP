class Solution {
    int leftkasize ;
    int rightkasize ;
    public int size(TreeNode node , int x){
        if(node==null){
            return 0;
        }
       
        int lf = size(node.left , x);
        int rf = size(node.right, x);
        
         if(node.val == x){
            leftkasize=lf;
            rightkasize=rf;
        }
        
        return lf+rf+1;
    }
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        size(root,x);
        int otherside = n - (leftkasize+rightkasize+1);
        int maxofthree = Math.max(otherside,Math.max(leftkasize,rightkasize));
        int rest = n- maxofthree;
        if(maxofthree>rest){
            return true;
        }else{
            return false;
        }
    }
}