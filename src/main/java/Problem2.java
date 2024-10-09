import org.w3c.dom.stylesheets.LinkStyle;

public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list
        
        // create node to insert
        ListNode node = new ListNode(val);

        // if inserting at head
        if (position == 1) {
            node.next = head;
            return node;
        }

        // insert in body of list (not head, tail)
        ListNode current = head; 
        int count = 1; 
        while (current.next != null) {
            if (count == position - 1) {
                node.next = current.next;
                current.next = node;
                return head;
            }
            count++;
            current = current.next;
        }
        
        // insert at end of list is count above index
        node.next = null;
        current.next = node;
        

        return head;
    }
}
