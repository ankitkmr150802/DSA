
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;

        //check if k nodes present or not?
        for(int i = 0; i < k; i++){
            if(curr == null) return head;
            curr = curr.next;
        }

        //recursive call for rest of the ll
        ListNode prev = reverseKGroup(curr, k);

        //reverse current group
        curr = head;
        ListNode fw = head;
        for(int i = 0; i < k; i++){
            fw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fw;
        }
        return prev;
        
    }
}
