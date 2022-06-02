/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     class Pair implements Comparable<Pair>{
    //class Pair{
        TreeNode node;
        int w ;
        int d ;
        Pair(){
            
        }
        Pair( TreeNode node ,int w , int d){
            this.node = node;
            this.w = w;
            this.d = d;
        }
        public int compareTo(Pair other){
            if(this.d==other.d){
                return this.node.val-other.node.val;
                
            }else{
                return this.d- other.d;
            }
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode node) {
        Queue<Pair> qu = new LinkedList<>();
        // HashMap<Integer,PriorityQueue<Pair>> map = new HashMap<>();
           HashMap<Integer,ArrayList<Pair>> map = new HashMap<>();
        qu.add(new Pair(node,0,1));
        int lmh = 0;
        int rmh = 0;
        while(qu.size()>0){
            Pair rem = qu.remove();
            
            if(rem.w<lmh){
                lmh=rem.w;
            }
            if(rem.w>rmh){
                rmh=rem.w;
            }
            if(map.containsKey(rem.w)==false){
                map.put(rem.w,new ArrayList<>());
                map.get(rem.w).add(rem);
            }else{
                map.get(rem.w).add(rem);
            }
               
            if(rem.node.left != null){
                Pair lf = new Pair(rem.node.left,rem.w-1,rem.d+1);
                qu.add(lf);
            }
            if(rem.node.right != null){
                Pair rf = new Pair(rem.node.right,rem.w+1,rem.d+1);
                qu.add(rf);
            }
        }
        List<List<Integer>> ret = new ArrayList<>();
        int idx=0;
        for(int i = lmh ; i<=rmh ; i++){
            ArrayList<Integer> L = new ArrayList<>();
            ArrayList<Pair> pq = map.get(i);
//             Collections.sort(pq);
            
//             while(pq.size()>0){
//                 Pair temp = pq.remove();
//                 L.add(temp.node.val);
//             }
            Collections.sort(pq);

            for(Pair temp: pq){
                L.add(temp.node.val);
            }
            ret.add(L);
            idx++;
        }
        return ret;
    }
 }
