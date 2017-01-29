package myJavaLearning;

 class ListNode {
	 int val;
	 ListNode next;
	 
	 ListNode(int x) { 
		 val = x; 
	 }
	 
	 public int getVal() {
		return val;
	}
	 
	public void setVal(int val) {
		this.val = val;
	}
	
	public ListNode getNext() {
		return next;
	}
	
	public void setNext(ListNode next) {
		this.next = next;
	}
	 
	 }


 
public class LinkedListSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(3);
		
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(null);
		
		ListNode node4 = new ListNode(5);
		ListNode node5 = new ListNode(6);
		ListNode node6 = new ListNode(4);
		
		
		node4.setNext(node5);
		node5.setNext(node6);
		node6.setNext(null);
		
		
		
	}

}
