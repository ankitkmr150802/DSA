class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null) return arr;
        
        Queue<TreeNode> q = new LinkedList<>();
        //map of (node, vertical level)
        HashMap<TreeNode, Integer> map = new HashMap<>();
        
        q.add(root);
        map.put(root, 0);
        
        while(q.size() > 0){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode temp = q.remove();
                int key = map.get(temp);
                if(i == size-1){
                    arr.add(temp.val);
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
