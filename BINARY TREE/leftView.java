class Solution {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null) return arr;
        
        Queue<Node> q = new LinkedList<>();
        //map of (node, vertical level)
        HashMap<Node, Integer> map = new HashMap<>();
        
        q.add(root);
        map.put(root, 0);
        
        while(q.size() > 0){
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node temp = q.remove();
                int key = map.get(temp);
                if(i == 0){
                    arr.add(temp.data);
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
        }

        return arr;
    }
}
