class GFG
{   static int idx = 0 ;
public static Node constructTree(int post[],int n)
    {    idx = post.length-1;
         int lf= Integer.MIN_VALUE;
        int rf = Integer.MAX_VALUE;
        return helper(post,lf,rf);
    }
    
    public static Node helper(int post[] , int lf ,int rf ){
        if(idx<0 ||post[idx] > rf || post[idx]<lf ){
            return null;
        }
        Node node = new Node(post[idx--]);
        node.right = helper(post,node.data,rf);
        node.left = helper(post,lf,node.data);
        return node;
    }
    
}