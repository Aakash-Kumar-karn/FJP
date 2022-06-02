 class Solution{
            
    static class Pair{
        Node node ;
        int hozi= 0;
    }
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> bottomView(Node root)
    {
        ArrayList<Integer> retVal = new ArrayList<>();
        HashMap<Integer,Node> map = new HashMap<>();
         int lv = 0 , rv = 0 ;
        
        
        Queue<Pair> queue = new LinkedList<>();
        Pair p= new Pair();
        p.node = root;
        p.hozi = 0;
        
        queue.add(p);
       
        while(queue.size()>0){
            Pair temp = queue.remove();
             
             if(temp.hozi<lv){
                 lv=temp.hozi;
             }
              if(temp.hozi>rv){
                 rv=temp.hozi;
             }
            
                 map.put(temp.hozi,temp.node);
             
             if(temp.node.left != null){
                 Pair lp =  new Pair();
                 lp.node = temp.node.left;
                 lp.hozi = temp.hozi-1;
                 
                 queue.add(lp);
             }
              if(temp.node.right != null){
                 Pair rp =  new Pair();
                 rp.node = temp.node.right;
                 rp.hozi = temp.hozi+1;
                 queue.add(rp);
             }
        }
        for(int i = lv ; i<=rv  ; i++ ){
            retVal.add(map.get(i).data);
        }
        return retVal;
    }
}
    