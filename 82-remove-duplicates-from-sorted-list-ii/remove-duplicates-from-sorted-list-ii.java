/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0,head);
        ListNode cur=head;
        ListNode prev=dummy;
        while(cur!=null){
            if(cur.next!=null && cur.val==cur.next.val){
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur=cur.next;
                prev.next=cur;
            }
            else{
                prev=cur;
                cur=cur.next;
            }
        }
        return dummy.next;
    }
}