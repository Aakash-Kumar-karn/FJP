 static class LOPair{
        Node node ;
        int lv ;
        LOPair(){

        }
        LOPair(Node node,int lv ){
            
            this.node =node;
            this.lv = lv ;
        }
    }
  public static void levelOrderLW(Node node) {
     Queue<LOPair> qu = new LinkedList<>();
     LOPair p = new LOPair();
     p.lv = 1;
     p.node = node;
     qu.add(p);
    //qu.add(new LOPair(node,1));
     int cl =1;
     while(qu.size()>0){
        LOPair rem = qu.remove();
        if(rem.lv>cl){
            System.out.println();
            cl=rem.lv;
        }
        System.out.print(rem.node.data+" ");
        if(rem.node.left != null){
            LOPair leftpair = new LOPair(rem.node.left,rem.lv+1);
            qu.add(leftpair);
        }
        if(rem.node.right != null){
            LOPair rightPair = new LOPair();
            rightPair.node=rem.node.right;
            rightPair.lv=rem.lv+1;
            qu.add(rightPair);
        }
     }
}
  