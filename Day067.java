/* Linked list 
Rearrange a linked List in Zig Zag fashion

SOLUTION */

public class ABC {
	    static class Node {
	        int data;
	        Node next;
	    }
	    static Node head = null;
	    static int temp = 0;
	 
	    
	    static void zigZagList(Node head)
	    {
	        boolean flag = true;
	 
	       
	        Node current = head;
	        while (current != null && current.next != null) {
	            if (flag == true) 
	            {
	                
	                if (current.data > current.next.data) {
	                    temp = current.data;
	                    current.data = current.next.data;
	                    current.next.data = temp;
	                }
	            }
	            else 
	                if (current.data < current.next.data) {
	                    temp = current.data;
	                    current.data = current.next.data;
	                    current.next.data = temp;
	                }
	            }
	 
	            current = current.next;
	 
	            flag = !(flag);
	        }
	    
	 
	   	    static void push(int new_data)
	    {
	        // allocate Node 
	        Node new_Node = new Node();
	 
	       
	        new_Node.next = (head);
	 
	        /* move the head to point to the new Node */
	        (head) = new_Node;
	    }
	 
	    /* Function to print linked list */
	    static void printList(Node Node)
	    {
	        while (Node != null) {
	            System.out.print(Node.data + "->");
	            Node = Node.next;
	        }
	        System.out.println("NULL");
	    }
	 
	    /* Driver code*/
	    public static void main(String[] args)
	    {
	       
	    	
	        push(1);
	        push(2);
	        push(6);
	        push(8);
	        push(7);
	        push(3);
	        push(4);
	 
	        System.out.println("Given linked list ");
	        printList(head);
	 
	        zigZagList(head);
	 
	        System.out.println("Zig Zag Linked list ");
	        printList(head);
	    }
	
}
