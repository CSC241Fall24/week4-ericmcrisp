// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2

        if (l1 == null) { return l2; }
        
        if (l2 == null) { return l1; }

        // move to end of l1
        ListNode current = l1;
        while(current.next != null) { current = current.next; }

        // now append l2 to l1
        ListNode mergingNode = l2;
        while (mergingNode != null) {
            current.next = new ListNode(mergingNode.val);
            current = current.next;
            mergingNode = mergingNode.next;
        }

        return l1;
    }
}