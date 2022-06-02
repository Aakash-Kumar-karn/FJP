public static void levelOrder(Node node) {
     
        Queue<Node> qu = new LinkedList<>(); 
        qu.add(node);
        
        while(qu.size() >0){
            int size = qu.size();
            while(size-->0){
             Node rem = qu.remove();
             System.out.print(rem.data+ " ");
             
             if(rem.left != null){
                 qu.add(rem.left);
             }
             if(rem.right != null){
                 qu.add(rem.right);
             }
             
            }
            System.out.println();
        }
     }

     // with null appraoch lO linewise

      public static void levelOrder(Node node) {
    Queue<Node> ans = new LinkedList<>();
    ans.add(node);
    ans.add(null);
    
    while(ans.size() != 0){
        int size =  ans.size();
        while(size-->0){
            Node rem = ans.remove();
             if(rem!=null){
            System.out.print(rem.data+" ");
                  
            if(rem.left!=null){
                ans.add(rem.left);
            }
             if(rem.right!=null){
                ans.add(rem.right);
            }
           
             }else{
                if( ans.size() >0 ){
                     System.out.println();
                    ans.add(rem);
                }
             }
            
        }
        
    }
  }