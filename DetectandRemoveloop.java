import java.util.*;

// Loop Detecting and Removing in LinkedList

import java.util.concurrent.TimeUnit;
public class DetectandRemoveloop {
	
		private static final String TimeUnit = null;
		static Node Head = null;
		static Node curr = null;
		static class Node{
			Node next;
			int data;
			
			Node(int d){
				data = d;
				next = null;
			}
		}
		
		void InsertNode(int data){
			Node temp = new Node(data);
			if(Head==null){
				Head = temp;
				curr = temp;
			}
			else{
				curr.next = temp;
				curr = curr.next;
			}
			
		}
		
		void printList(){
			Node temp = Head;;
			while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
			}		
		}
		
		void creatLoop(){
			curr.next = Head.next.next;
		//stem.out.println(curr.data +" "+Head.data + " "+ curr.next.data);
		}
		
		void detectAndRemoveLoop(){
			Node slow = Head;
			Node fast = Head;
			
			while(fast != null && fast.next!=null){
				slow = slow.next;
				fast = fast.next.next;
				if(slow == fast){
					removeLoop(slow);
					break;
				}
			
			}
			
			
			
		}
		
		void removeLoop(Node slow){
			
		//	System.out.println(slow.data + "sfg");
			
			Node temp1 = slow;
			Node temp2 = slow;
			
			int l = 1;
			
			while(temp1.next!=temp2){
				temp1 = temp1.next;
				l++;
			}
			//System.out.println(l + "dhaval");
			temp1 = Head;
			temp2 = Head;
			
			while(l-->0){
				temp2 = temp2.next;
			}
			
			
			if(temp1.next!=temp2.next){
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
			
			temp2.next = null;
		//	System.out.println(temp2.data+"dsfs");
			
			
		}
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		DetectandRemoveloop list = new DetectandRemoveloop();
		
	    list.InsertNode(1);
	    list.InsertNode(2);
	    list.InsertNode(3);
	    list.InsertNode(4);
	    list.InsertNode(5);
	    list.InsertNode(6);
	    
	 //   list.printList();
	  
	//    TimeUnit.SECONDS.sleep(10);
	    list.creatLoop();
	 //   list.printList();
	    list.detectAndRemoveLoop();
	    
	    list.printList();
		
		
	}
}
