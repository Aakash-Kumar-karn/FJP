class Solution
{    void leftwall(Node node , ArrayList<Integer> list){
    if(node==null){
        return ;
    }
    if(node.left != null || node.right != null){
        list.add(node.data);
    }
    if(node.left != null){
        leftwall(node.left,list);
    }else if(node.right !=null){
        leftwall(node.right,list);
    }
    
}   
  
   void leaveswall(Node node , ArrayList<Integer> list){
    if(node==null){
        return ;
    }
    leaveswall(node.left,list);
    if(node.left == null && node.right == null){
            list.add(node.data);
        }
    leaveswall(node.right ,list);
}
   
     void rightwall(Node node , ArrayList<Integer> list){
     if(node==null){
        return ;
    }
    
    if(node.right != null){
        rightwall(node.right,list);
    }else if(node.left !=null){
        rightwall(node.left,list);
    }
    if(node.left != null || node.right != null){
        list.add(node.data);
    }
}
	ArrayList <Integer> boundary(Node node)
	{
	    	ArrayList<Integer> list = new	ArrayList<Integer>();
	    	
	    	list.add(node.data);
	    	leftwall(node.left,list);
	    	
	    	leaveswall(node.left,list);
	        leaveswall(node.right,list);
	        
	    	rightwall(node.right,list);
	    	return list;
	}
}