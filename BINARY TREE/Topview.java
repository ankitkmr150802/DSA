class Solution {
    static ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        if(root ==null) return arr;
        Queue<Node> q = new LinkedList<>();
        HashMap<Node, Integer> map = new HashMap<>();
        TreeMap<Integer,Integer> tree = new TreeMap<>();
        q.add(root);
        map.put(root,0);
        
        while(q.size() > 0){
            Node temp = q.remove();
            int key = map.get(temp);
            
            //add to treemap if not present
            if(!tree.containsKey(key)){
                tree.put(key, temp.data);
            }
            
            if(temp.left != null){
                q.add(temp.left);
                map.put(temp.left, key-1);
            }
            if(temp.right != null){
                q.add(temp.right);
                map.put(temp.right, key+1);
            }
        }
        
        
        for(int num: tree.values()){
            arr.add(num);
        }
        return arr;
    }
}
