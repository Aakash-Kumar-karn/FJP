//reverse  
  public static void levelOrder(Node node) {
    Queue<Node> ans = new LinkedList<>();
    ans.add(node);
    ans.add(null);
    Stack<String> st = new Stack<>();
    String str = "" ; 
    
    
    while(ans.size() > 0){
       
            Node rem = ans.remove();
             if(rem!=null){
            str +=rem.data+" ";
                 
            if(rem.left!=null){
                ans.add(rem.left);
            }
             if(rem.right!=null){
                ans.add(rem.right);
            }
           
             }else{
                  st.push(str+ "/n");
                    str="";
                if( ans.size() >0 ){
                    ans.add(rem);
                }
             
            
        }
        
    }
  }

  //reverse fot gfg code without use of string 
  // trick call right first then left
  class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
         ArrayList<Integer>  al =  new ArrayList<Integer>();
         Stack<Integer> st =  new Stack<Integer>();
         Queue<Node> qu = new LinkedList<>();
         qu.add(node);
         
         while(qu.size() > 0 ){
             Node rem = qu.remove();
             st.push(rem.data);
             if(rem.right != null){
                 qu.add(rem.right);
             }
              if(rem.left != null){
                 qu.add(rem.left);
             }
            
         }
      
         while(st.size()>0){
             int val = st.pop();
             al.add(val);
         }
         return al;
    }
}  

