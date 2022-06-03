class Solution {
      public static TreeNode getrightmostnode( TreeNode leftNode ,  TreeNode curr){
      while( leftNode.right !=null && leftNode.right != curr){
          leftNode = leftNode.right;
      }
      return leftNode;
  }
    
public void recoverTree(TreeNode node) {
    
   TreeNode prev = null;     
   TreeNode curr = node;
    TreeNode n1 = null;    
     TreeNode n2 = null;    
   while(curr!=null){
       TreeNode leftNode= curr.left;
       if(curr.left==null){
          //print
           if(prev!=null){
               
               if(curr.val<prev.val){
                   if(n1==null){
                   n1=prev;
                   //n2=curr;
               
               }  //else{
                    n2=curr;
              // } 
                   
               }
           }
           prev=curr;
           curr=curr.right;
       }else{
           
           TreeNode temp = getrightmostnode(leftNode ,curr);
     
           if(temp.right == null){
               temp.right=curr;//thread create
               curr=curr.left;
           }else{
               temp.right=null;
               //print
                //print
           if(prev!=null){
               
               if(curr.val<prev.val){
                   if(n1==null){
                   n1=prev;
                   n2=curr;
               
               }else{
                    n2=curr;
               } 
                   
               }
           }
               prev=curr;
               curr=curr.right;
           }
       }
   }
        
       int temp=n1.val;
       n1.val=n2.val;
       n2.val=temp;
   }
   
}