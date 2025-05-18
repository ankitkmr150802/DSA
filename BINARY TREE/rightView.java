class Solution {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> rightView(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null) return arr;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(q.size() > 0){
            int len = q.size();
            for(int i = 0; i < len; i++){
                Node temp = q.remove();
                if(i == len-1){
                    arr.add(temp.data);
                }
            
                if(temp.left != null)  q.add(temp.left);
                if(temp.right != null)  q.add(temp.right);
            }
        }
        return arr;
    }
}
