import java.util.*;

class LinkedList{
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int d){
			data = d;
			prev = null;
			next = null;
		}
	}
	
	LinkedList(){
		head = null;
	}
	
	void insert(int key){
		Node new_node = new Node(key);
		if(head == null){
			head = new_node;
			return;
		}
		new_node.next = head;
		head.prev = new_node;
		head = new_node;
		return;
	}
	
	Node reverse(Node head){
		Node n = head;
		Node temp = null;
		while(n.next != null){
			temp = n;
			n = n.next;
		}
		while(temp.prev != null){
			System.out.print(temp.data+"<- ");
			temp = temp.prev;
		}
		return head;
	}
}
class Q2Demo{
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of LinkedList:");
		int n = sc.nextInt();
		System.out.println("Enter element to insert in linkedList:");
		for(int i=0;i<n;i++){
			ll.insert(sc.nextInt());
		}
		ll.reverse(ll.head);
		
	}
}