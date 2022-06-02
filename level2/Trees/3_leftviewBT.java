//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node node)
    {   ArrayList<Integer>  al =  new ArrayList<Integer>();
    if(node==null){
        return al;
    }
      Queue<Node> qu = new LinkedList<>();
      qu.add(node);
      
      while(qu.size()>0){
          int size = qu.size();
          
         // while(size-->0){
         for(int i=0 ; i< size ; i++){
                Node rem = qu.remove();
                
                if(i==0)
                al.add(rem.data);
                
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
