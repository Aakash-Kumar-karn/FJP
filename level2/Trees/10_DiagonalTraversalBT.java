class Tree
{    static int maxDia =0;
     public void traversal(Node root, int dia , HashMap<Integer,ArrayList<Integer>> map){
         if(root==null){
             return;
         }
         if(dia>maxDia){
             maxDia=dia;
         }
         if(map.containsKey(dia)==false){
             map.put(dia, new ArrayList<>() );
              map.get(dia).add(root.data);
         }else{
              map.get(dia).add(root.data);
         }
            
              traversal(root.left,dia+1,map);
              traversal(root.right,dia,map);
     }
     public ArrayList<Integer> diagonal(Node root)
      {
          HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
          traversal(root,0,map);
          
          ArrayList<Integer> al = new ArrayList<>();
          for(int d = 0 ; d<=maxDia ; d++){
              ArrayList<Integer> allAL = map.get(d);
              if(allAL==null){
                  continue;
              }
              for(int p : allAL){
                 // al.add(p.node.data);
                 al.add(p);
              }
          }
          return al;
          
      }
}
