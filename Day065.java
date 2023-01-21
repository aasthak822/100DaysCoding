/* Linked list

Remove loop in linked list

SOLUTION */


public class LinkedList {
		  
	    static Node head;
	  
	    static class Node {
	  
	        int data;
	        Node next;
	  
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	  
	    int detectAndRemoveLoop(Node node)
	    {
	        Node slow = node, fast = node;
	        while (slow != null && fast != null
	               && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	  
	            if (slow == fast) {
	                removeLoop(slow, node);
	                return 1;
	            }
	        }
	        return 0;
	    }
	  

	    void removeLoop(Node loop, Node head)
	    {
	        Node ptr1 = loop;
	        Node ptr2 = loop;
	  
	        int k = 1, i;
	        Node prevNode = ptr1;
	        while (ptr1.next != ptr2) {
	            prevNode = ptr1;
	            ptr1 = ptr1.next;
	            k++;
	        }
	        prevNode.next = null;
	    }
	  
	   
	    void printList(Node node)
	    {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	  

	    public static void main(String[] args)
	    {
	        LinkedList list = new LinkedList();
	        list.head = new Node(50);
	        list.head.next = new Node(20);
	        list.head.next.next = new Node(15);
	        list.head.next.next.next = new Node(4);
	        list.head.next.next.next.next = new Node(10);
	  
	        // Creating a loop for testing
	        head.next.next.next.next.next = head.next.next;
	        list.detectAndRemoveLoop(head);
	        System.out.println(
	            "Linked List after removing loop : ");
	        list.printList(head);
	    }
	}


