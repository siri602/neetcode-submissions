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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int k=count-n;
        if(k==0) return head.next;
        ListNode curr=head;
        for(int i=1;i<k;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}
