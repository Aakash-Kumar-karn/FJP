class Solution{
    public Tree cloneTree(Tree tree){
      createdulplicate(tree);
      setrandom(tree);
      Tree ans = removedup(tree);
      return ans;
     }
    public void createdulplicate(Tree node){
        if(node==null){
            return;
        }
        createdulplicate(node.left);
        createdulplicate(node.right);
        
        Tree dulplicate = new Tree(node.data);
        dulplicate.left = node.left;
        dulplicate.right = null;
        node.left= dulplicate;
    } 
    public void setrandom(Tree org){
        if(org == null){
            return ;
        }
        setrandom(org.left.left);
        setrandom(org.right);
        if(org.random != null )
        org.left.random = org.random.left; // org.left = a'
    }
    public Tree removedup(Tree node){
        if(node==null){
            return null;
        }
        Tree leftDup = removedup(node.left.left);
        Tree rightDup = removedup(node.right);
        
        Tree dup = node.left ;
        node.left= node.left.left;
        dup.left = leftDup;
        dup.right = rightDup;
        return dup;
    }
}