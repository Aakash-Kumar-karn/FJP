class Solution {
    public List<Integer> rightSideView(TreeNode node) {
    List<Integer>  al =  new ArrayList<Integer>();
    if(node==null){
        return al;
    }
      Queue<TreeNode> qu = new LinkedList<>();
      qu.add(node);
      
      while(qu.size()>0){
          int size = qu.size();
          
         // while(size-->0){
         for(int i=0 ; i< size ; i++){
                TreeNode rem = qu.remove();
                
                if(i==size-1)
                al.add(rem.val);
                
                if(rem.left != null){
                    qu.add(rem.left);
                }
                if(rem.right != null){
                    qu.add(rem.right);
                }
          }
      }
      return al;
    }
}