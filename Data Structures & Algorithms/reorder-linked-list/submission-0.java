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
    public void reorderList(ListNode head) {
        ListNode l1=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode l2=slow.next;
        slow.next=null;

        ListNode prev=null;
        ListNode temp=l2;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        l2=prev;

        while(l1!=null && l2!=null){
            ListNode l1next=l1.next;
            ListNode l2next=l2.next;
            l1.next=l2;
            l2.next=l1next;
            l1=l1next;
            l2=l2next;
        }
    }
}
