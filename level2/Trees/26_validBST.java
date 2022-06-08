class Solution {
    class Pair{
        boolean isBST = true;
        long min =  Long.MAX_VALUE;
        long max =  Long.MIN_VALUE;
    }
    public boolean isValidBST(TreeNode root) {
        Pair ans = helper(root);
        return ans.isBST;
    }
    public Pair helper(TreeNode root){
        if(root==null){
            Pair p = new Pair();
            return p;
        }
        Pair lp = helper(root.left);
        Pair rp = helper(root.right);
        
        Pair mp = new Pair();
        mp.min = Math.min(root.val,Math.min(lp.min,rp.min));
        mp.max = Math.max(root.val,Math.max(lp.max,rp.max));
        mp.isBST = lp.isBST && rp.isBST && root.val > lp.max && root.val<rp.min;
        return mp;
    }
}

// class Solution {
//     long prev = Long.MIN_VALUE;
//     public boolean isValidBST(TreeNode root) {
//         if(root==null){
//             return true;
//         }
//         boolean la = isValidBST(root.left);
//         if(la==false){
//             return false;
//         }
//         if(prev>=root.val){
//             return false;
//         }
//         prev=root.val;
        
//         boolean ra = isValidBST(root.right);
//         if(ra==false){
//             return false;
//         }
        
//         return true;
//     }
// }