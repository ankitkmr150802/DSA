class Solution {
    // Function to return a list containing the bottom view of the given tree.
    public ArrayList<Integer> bottomView(Node root) {
        // Code here
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null) return arr;
        
        Queue<Node> q = new LinkedList<>();
        //map of (node, vertical level)
        HashMap<Node, Integer> map = new HashMap<>();
        
        //map for keeping last node in every level in sorted
        //level, node.data
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        
        q.add(root);
        map.put(root, 0);
        
        while(q.size() > 0){
            Node temp = q.remove();
            int key = map.get(temp);
            
            tree.put(key, temp.data);
            
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
