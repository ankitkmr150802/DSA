/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        if(head == null) return null;
        //3 steps : copy node -> alternate connection-> assign random -> break connection

        //deepCopy and alternate connection
        Node t1 = head;
        while(t1 != null){
            Node copy = new Node(t1.val);
            copy.next = t1.next;
            t1.next = copy;
            t1 = copy.next;
        }

        //assign random
         t1 = head;
         while(t1 != null){
            if(t1.random != null){
                t1.next.random = t1.random.next;
            }
            t1 = t1.next.next;
         }
      
         //break connection
         t1 = head;
         Node newHead = head.next;
         Node t2 = newHead;

         while(t1 != null){
            t1.next = t2.next;
            t1 = t2.next;
            if(t1 == null) break;
            t2.next = t1.next;
            t2 = t2.next;
         }

         return newHead;
    }
}
