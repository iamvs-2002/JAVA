class Node{
	int data;
	Node next;
}
class LinkedList{
	static Node head;
	void insertAtStart(int data){
		Node n = new Node();
		n.data = data;
		n.next = head;
		head = n;
	}
	void insertAtEnd(int data){
		Node n = new Node();
		n.data = data;
		n.next = null;
		if(head==null)
			head=n;
		else{
			Node node = head;
			while(node.next!=null){
				node = node.next;
			}
			node.next = n;
		}
	}
	void insertAtIndex(int index, int data){
		if(index==1){
			insertAtStart(data);
			return;
		}
		Node n = new Node();
		n.data = data;
		n.next = null;
		Node node = head;
		for(int i=1;i<index-1;i++){//index starts with 1
			node = node.next;
		}
		n.next = node.next;
		node.next = n;
	}
	void size(){
		Node node = head;
		int size = 0;
		while(node.next!=null){
			node = node.next;
			size++;
		}
		System.out.println("\nSize of the list: "+size);
	}
	void print(){
		Node node = head;
		System.out.println("\nPrinting the list:");
		while(node.next!=null){
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.print(node.data+" ");
	}
	void deleteAt(int index){
		Node node = head;
		for(int i=1;i<index-1;i++)
			node = node.next;
		node.next = node.next.next;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtStart(3);
		list.insertAtStart(5);
		list.insertAtStart(7);
		list.print();
		list.size();
		list.insertAtIndex(3,10);
		list.print();
		list.size();
		list.insertAtIndex(1,5);
		list.print();
		list.size();
		list.deleteAt(3);
		list.print();
		list.size();
	}
}

/*
Output:

Printing the list:
7 5 3
Size of the list: 2

Printing the list:
7 5 10 3
Size of the list: 3

Printing the list:
5 7 5 10 3
Size of the list: 4

Printing the list:
5 7 10 3
Size of the list: 3

*/
