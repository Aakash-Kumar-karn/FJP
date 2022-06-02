class Solution {
    
    public int findBottomLeftValue(TreeNode node) {
        
    ArrayList<Integer>  al =  new ArrayList<Integer>();
    if(node==null){
        return 0;
    }
      Queue<TreeNode> qu = new LinkedList<>();
      qu.add(node);
      
      while(qu.size()>0){
          int size = qu.size();
          
         // while(size-->0){
         for(int i=0 ; i< size ; i++){
                TreeNode rem = qu.remove();
                
                if(i==0)
                al.add(rem.val);
                
                if(rem.left != null){
                    qu.add(rem.left);
                }
                if(rem.right != null){
                    qu.add(rem.right);
                }
          }
      }
        
      return al.get(al.size()-1);
    }
}