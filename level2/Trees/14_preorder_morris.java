class Solution {
     public static TreeNode GETrmn(TreeNode leftnode , TreeNode curr){
      while(leftnode.right !=null && leftnode.right != curr){
          leftnode=leftnode.right;
      }
      return leftnode;
  }
    public List<Integer> preorderTraversal(TreeNode node) {
    List<Integer> ans = new ArrayList<Integer>();
   TreeNode curr = node;
    while(curr!=null){
       TreeNode leftNode= curr.left;
       if(curr.left==null){
           ans.add(curr.val);
           curr=curr.right;
       }else{
           
           TreeNode temp = GETrmn(leftNode ,curr);
     
           if(temp.right == null){
               temp.right=curr;//thread create
               ans.add(curr.val);
               curr=curr.left;
           }else{
               temp.right=null;
               curr=curr.right;
           }
       }
       
   }
   return ans;
    }
}
 