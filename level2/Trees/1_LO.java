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