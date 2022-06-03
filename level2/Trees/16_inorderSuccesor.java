class Solution
{   
    public static Node getrightmostnode( Node leftNode ,  Node curr){
      while( leftNode.right !=null && leftNode.right != curr){
          leftNode = leftNode.right;
      }
      return leftNode;
  }
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
         {
          boolean flag = false;
          Node curr = root;
          Node succ = null;
        while(curr !=null){
            Node leftnode = curr.left;
        if(curr.left==null){
            //print
            if(flag == true){
                succ=curr;
                break;
            }
            if(curr==x){
                flag = true;
            }
            curr=curr.right;
        }else{
            Node temp = getrightmostnode(leftnode ,curr);
            if(temp.right==null){
                //thread create
                temp.right=curr;
                curr=curr.left;
            }else{
                temp.right=null;
               //print
               //print
            if(flag == true){
                succ=curr;
                break;
            }
            if(curr==x){
                flag = true;
            }
                curr=curr.right;
            }
        }
    }
        return succ;
         }
}