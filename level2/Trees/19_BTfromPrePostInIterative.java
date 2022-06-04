 public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static void iterativePrePostInTraversal(Node node) {
   Pair p = new Pair(node,0);
   
   String pre="";
   String post="";
   String in = "";
   Stack<Pair> st = new Stack<>();
   st.push(p);
   while(st.size()>0){
      Pair top = st.peek();
      if(top.state==0){
        pre += top.node.data+ " ";
        if(top.node.left != null){
            Pair lp = new Pair(top.node.left ,0);
            st.push(lp);
        }
      }else if(top.state==1){
           in += top.node.data+ " ";
        if(top.node.right != null){
            Pair rp = new Pair(top.node.right ,0);
            st.push(rp);
        }
      }else{
          
         post += top.node.data+ " ";
         st.pop();
      }
      top.state++;
   }
   System.out.println(pre);
    System.out.println(in);
     System.out.println(post);
  }