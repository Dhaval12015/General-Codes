import java.util.*;
public class MergeSortUsingLinkedList {
	Node head = null;
	class Node{
		int d;
		Node next;
		Node(int d){
			this.d = d;
			next = null;
		}
	}
	void push(int d){
		Node temp = new Node(d);
		temp.next = head;
		head = temp;
	}
	Node mearge(Node head){
		if(head==null || head.next==null) return head;
		Node mid = getMiddle(head);
		Node temp = mid.next;
		mid.next = null;
		Node left = mearge(head);
		Node right = mearge(temp);
		Node lhead = meargeSort(left,right);
		return lhead;
	}
	Node meargeSort(Node l,Node r){
		if(l==null) return r;
		if(r==null) return l;
		Node result = null;
		if(l.d<r.d){
			result = l;
			result.next = meargeSort(result.next,r);
		}
		else{
			result = r;
			result.next = meargeSort(l,result.next);
		}
		return result;
	}
	static Node getMiddle(Node head){
		Node fast = head;
		Node slow = head;
		while(fast.next!=null){
			fast = fast.next;
			if(fast.next!=null){
				slow = slow.next;
				fast = fast.next;
			}
		}
		return slow;
	}
	void print(Node head){
	while(head!=null){
		System.out.println(head.d);
		head = head.next;
	}
	}
	public static void main(String args[]){
		MergeSortUsingLinkedList l = new MergeSortUsingLinkedList();
		l.push(4);
	//	l.push(2);
	//	l.push(3);
	//	l.push(1);
		l.print(l.head);
		l.mearge(l.head);
		l.print(l.head);
	}
}
