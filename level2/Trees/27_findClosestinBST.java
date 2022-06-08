class Solution
{
    //Function to find the least absolute difference between any node
    //value of the BST and the given integer.
    
    static int minDiff(Node  root, int k) 
    { 
        int mD = Integer.MAX_VALUE;
        Node curr = root ;
        while(curr != null){
            int ans = Math.abs(k-curr.data);
            if(ans<mD){
                mD=ans;
            }
            
            if(curr.data<k){
                curr=curr.right;
               
            }else{
                 curr=curr.left;
            }
        }
        return mD;
    } 
}

