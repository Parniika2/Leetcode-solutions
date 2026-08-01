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

    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode middle=findmiddle(head);
        ListNode righthead=middle.next;
        middle.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(righthead);
        return merge(left,right);
        
    }
    public static ListNode findmiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
    public static ListNode merge(ListNode l1,ListNode l2){
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                curr.next=temp1;
                temp1=temp1.next;
                curr=curr.next;

            }
            else{
                curr.next=temp2;
                temp2=temp2.next;
                curr=curr.next;
            }
        }
        if(temp1!=null){
            curr.next=temp1;
        }
        if(temp2!=null){
            curr.next=temp2;
        }
        return dummy.next;
    }
}
    