class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head; 
        ListNode fast = head; 
        
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next; 
            fast = fast.next.next;
        }
        
        ListNode tempHead = null;
        
        if(fast == null){
          tempHead =  reverseLinkedList(slow);
        }
        else{
            tempHead = reverseLinkedList(slow.next);
        }
    
        while(tempHead!=null)
        {
            if(tempHead.val != head.val) return false; 
            tempHead = tempHead.next;
            head = head.next;
        }
        
        return true;
    }
    
    public ListNode reverseLinkedList(ListNode head) {
        ListNode current = head;
        ListNode pre = null; 

        while(current!=null)
        {
            ListNode post = current.next; 
            current.next = pre; 
            pre = current; 
            current = post;
        }

        return pre;
    }
}
