package myJavaLearning;

public class ListNode {

	private int data;
	private ListNode next;
	
	public ListNode(int data)
	{
		this.data = data;
		
	}

	
	public int getData()
	{
		return data;
	}
	
	public void setData(int data)
	{
		this.data = data;
		
	}
	
	public ListNode getNext()
	{
		return next;
	}
	
	public void setNext(ListNode next)
	{
		this.next = next;
		
	}
	
	public static void main(String args[])
	{
		ListNode l1 = new ListNode(10);
		
		ListNode l2 = new ListNode(20);
		
		ListNode l3 = new ListNode(30);
		
		ListNode l4 = new ListNode(40);
		
		ListNode l5 = new ListNode(50);
		
		ListNode l6 = new ListNode(25);
		
		l1.setNext(l2);
		l2.setNext(l3);
		l3.setNext(l4);
		l4.setNext(l5);
		l5.setNext(null);
		
		displayList(l1);
		
		System.out.println("Displaying LinkedList from end:");
		
		displayLinkedListFromEnd(l1);
		
		ListNode lend = NthNodeFromEnd(l1,2);
		ListNode mid = middleNode(l1);		
		
		// Adding another node 25
		insertInSortedList(l1,l6);
		System.out.println("Printing List after adding a new node:");
		displayList(l1);
		
		System.out.println("Printing List after reversal:");
		reverseListIteratively(l1);
		displayList(l5);
		
		
		
	}
	
	public static void displayList(ListNode head)
	{
		ListNode temp=head;
		System.out.print(temp.getData() + "->");
		
		while(temp.getNext()!= null)
		{
			System.out.print(temp.getNext().getData() + "->");
			temp = temp.getNext();
			
		}
		System.out.println();
	}
	
	
	public static ListNode NthNodeFromEnd(ListNode head, int pos)
	{
		ListNode ptr1=head,ptr2=head;
		int count=0;
		for (count=0;count<pos; count++)
		{
			ptr2 = ptr2.getNext();
		}
		
		while (ptr2.getNext()!= null)
		{
			ptr1 = ptr1.getNext();
			ptr2 = ptr2.getNext();
		}
		
		if (ptr2.getNext() == null)
		{
			System.out.println("Data in " +pos + " node from end is : " +ptr1.getNext().getData());
			return ptr1.getNext();
		}

		return null;
	}
	
	
	public static ListNode middleNode(ListNode head)
	{
		ListNode ptr1=head,ptr2=head;
		while (ptr1.getNext()!=null && ptr1.getNext().getNext()!=null)
		{
			ptr1=ptr1.getNext().getNext();
			ptr2=ptr2.getNext();
		}
		
		if (ptr1.getNext()==null)
		{
			System.out.println("Middle Node value is: " +ptr2.getData());
			return ptr2;
		}
		
		return null;
	}
	
	
	public static void reverseListIteratively (ListNode head)
	{
		if (head==null || head.getNext()==null)
		return;
		
		ListNode second = head.getNext(); 
		ListNode third = second.getNext(); //store third node before we change 
		
		second.next = head; //second now points to head
		head.next = null; //change head pointer to NULL
		
		// Only two nodes in List and they are already reversed
		if (third == null)
			return;
		
		ListNode currentNode = third;
		ListNode prevNode = second;
		
		while (currentNode!= null)
		{
			ListNode nextNode = currentNode.getNext();
			currentNode.setNext(prevNode);
			
			
			/*  repeat the process, but have to reset
		     the PreviousNode and CurrentNode
			 */
			
			
			prevNode = currentNode;
			currentNode = nextNode;
			
		}
		
		head = prevNode;
	}
	
	public static void insertInSortedList(ListNode head, ListNode newNode)
	{
		ListNode curNode = head;
		while(curNode!=null && curNode.getNext().getData()< newNode.getData())
			curNode = curNode.getNext();
		
		newNode.setNext(curNode.getNext());
		// curNode = newNode;
		curNode.setNext(newNode);
	}
	
	public static void displayLinkedListFromEnd(ListNode head)
	{
		if (head == null)
			return;
		else 
		{
			displayLinkedListFromEnd(head.getNext());
			System.out.println(head.getData());
		}
		
	}
	
	
}	
