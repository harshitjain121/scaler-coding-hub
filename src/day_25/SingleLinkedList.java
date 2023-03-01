package day_25;

public class SingleLinkedList {

	Node head; // head of list

	// Linked list Node - This inner class is made static so that main() can access it
	static class Node {

		int data;
		Node next;

		// Constructor
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	// insert at a given position
	public static Node insertAtPosition(Node head , int data , int pos){
		Node temp = new Node(data);

		if(head == null){
			return temp;
		}

		if (pos == 1)
			return insertFront(head, data);

		else{
			Node cur = head;
			int count = 1;
			while(count < pos-1 && cur.next != null){
				cur = cur.next;
				count++;
			}
			temp.next = cur.next;
			cur.next = temp;
		}
		return head;
	}

	//insert at the end
	public static Node insertEnd(Node head, int data){

		//create a new node
		Node newNode = new Node(data);
		// if list is empty - i.e head is null
		if(head == null){
			head = newNode;
		}
		else{
			//if list is not empty - traverse the list
			Node curtNode = head;
			while(curtNode.next != null){
				curtNode = curtNode.next;
			}
			curtNode.next = newNode;
		}
		return head;
	}

	//insert at the front
	public static Node insertFront(Node head, int data){

		//create the node
		Node newNode = new Node(data);
		// if list is empty
		if(head == null){
			head = newNode;
		}
		else{
			// if not empty - add in front
			newNode.next = head;
			head = newNode;
		}
		return head;
	}

	// Method to print the LL.
	public static void printList(Node head)
	{
		Node currNode = head;
	
		System.out.print("Linked List: ");
	
		// Traverse through the LL
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " -> ");
	
			// Go to next node
			currNode = currNode.next;
		}
		System.out.println("Null");
	}

	//----------------------- DELETE -----------------

	public static Node deleteAtFront(Node head){
		// check if head is null ?
		// check if head.next is null ?
		Node temp = head;
		head = head.next;
		temp.next = null;
		return head;
	}

	public  static Node deleteAtPosition(Node head, int position){
		if(head == null){
			return head;
		}
		else{
			int count = 1;
			while(count < position)
		}
		return head;
	}
	// Driver code
	public static void main(String[] args)
	{
		/* Start with the empty list. */
		Node head = null;

		// ******INSERTION******
		head = insertFront(head, 3);
//		printList(head);
		head = insertFront(head, 2);
//		printList(head);
		head = insertFront(head, 1);
//		printList(head);
		head = insertEnd(head, 4);
		printList(head);
//		head = insertAtPosition(head, 5 , 1);
//		printList(head);
		head = deleteAtFront(head);
		printList(head);
	}
}

