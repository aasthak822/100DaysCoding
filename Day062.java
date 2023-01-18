/*Linked list 
Find and remove Nth node from End
SOLUTION */

public class FindNRemoveNth {

	public static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
			this.next=null;
			
		}
	}
		public static Node head;
		public static Node tail;
		public static Node size;
		
		public void addFirst(int data) {
			Node newNode=new Node(data);
			//size++;
			if(head==null) {
				head=tail=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;
			
		}
		public void addLast(int data) {
			Node newNode=new Node(data);
			//size++;
			if(head==null) {
				head=tail=newNode;
				return;
			}
			tail.next=newNode;
			tail=newNode;
		}
		
		
		public void deleteNthefromEnd(int n){
			//calculate size
			int sz=0;
			Node temp=head;
			while(temp!=null) {
				temp=temp.next;
				sz++;
			}
			
			if(n==sz) {
				head=head.next;
				return;
			}
			//sz-n
			int i=1;
			int iToFind=sz-n;
			Node prev=head;
			while(i<iToFind) {
				prev=prev.next;
				i++;
			}
			prev.next=prev.next.next;
			return;
		}
		

		public void print() {
			if(head==null) {
				System.out.println("LL IS EMPTY");
			   return;
			}
			Node temp=head;
			while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
			System.out.println("Null");
		}
		
	public static void main(String args[]) {
		
		FindNRemoveNth ll=new FindNRemoveNth();
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addFirst(1);
		
		ll.addLast(4);
		ll.addLast(5);
		ll.deleteNthefromEnd(3);
		ll.print();
	
	}

}
