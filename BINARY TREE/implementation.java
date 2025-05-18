import java.util.LinkedList;
import java.util.Queue;

public class implementation{
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int val){
        this.data = val;
        this.left = null;
        this.right = null;
        }
    }

    public static void display(Node r){
        if(r == null){
            return;
        }

        System.out.print(r.data+"->");
        if(r.left != null){
        System.out.print(r.left.data +" ");
        }

        if(r.right != null){
        System.out.print(r.right.data +" ");
        }
        System.out.println();
        display(r.left);
        display(r.right);
        
    }
    public static void preOrder(Node r){
        if(r == null){
            return;
        }
        System.out.print(r.data+" ");
        if(r.left != null){
            preOrder(r.left);
        }
        if(r.right != null){
        preOrder(r.right);
        }

    }

    public static void inOrder(Node r){
        if(r == null){
            return;
        }
        inOrder(r.left);
        System.out.print(r.data+" ");
        inOrder(r.right);
    }

    public static void postOrder(Node r){
        if(r == null) return;
        postOrder(r.left);
        postOrder(r.right);
        System.out.print(r.data+" ");
    }

    public static int size(Node r){
        if(r == null) return 0;

        int x = size(r.left);
        int y = size(r.right);
        return x+y+1;

    }

    public static int sumNodes(Node r){
        if(r == null) return 0;
        return sumNodes(r.left )+ r.data + sumNodes(r.right);

    }

    public static int maxNode(Node r){
        if(r == null) return Integer.MIN_VALUE;  //handle -ve case
        int max1 = Math.max(maxNode(r.left),maxNode(r.right));
        return Math.max(max1, r.data);
    }

    public static int height(Node r){
        
        if(r == null || r.left == null && r.right == null) return 0;
        return 1+ Math.max(height(r.left), height(r.right));
    }

    public static void bfs(Node r){
        Queue<Node> q = new LinkedList<>();
        if(r!= null) q.add(r);
        while(q.size() > 0){
            Node temp = q.peek();
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
            System.out.print(temp.data+" ");
            q.remove();

        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        Node g = new Node(18);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        f.right = g;

        preOrder(root);
        System.out.println();

        inOrder(root);
        System.out.println();

        postOrder(root);
        System.out.println();
        System.out.println(size(root));

        System.out.println(sumNodes(root));
        System.out.println(maxNode(root));
        System.out.println(height(root));
        bfs(root);
        
        
    }
}
