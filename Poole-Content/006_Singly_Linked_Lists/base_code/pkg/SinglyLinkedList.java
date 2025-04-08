package pkg;
import java.util.Scanner;
import java.util.Random;


public class SinglyLinkedList {
	Node head;


	/* 
		Postcondition: The head will be null 
	*/
	public SinglyLinkedList() {
		head = null;

	}

	/* 
		Receives an integer position, searches through the SinglyLinkedList for the position and returns the data at that positon
	   	If the position doesn't exist, it returns -1
	*/ 
	public int get(int pos){

		Node current = head;
		int counter = 0;
		while(current.getNext()!=Null)
		{
			if(counter == pos)
			{
				return current.getData();

			}
			counter++;
			current = current.getNext();
		}
		// getNext();
		// getData();

		// edge cases
		// try {
		// 	for (int i = 0; i < pos; i++) {
		// 		head = head.getNext();
		// 	}
		// 	return head.getData();
		// }
		// catch (Error e ) {
		// 	return -1;
		// }
		// catch (Exception e) {
		// 	return -1;
		// }
		
	}

	/*
		Insert a new Node at the given position with the data given
	*/

	public void insert(int pos, int data){
		Node nextNode;
	    for (int i = 0; i < pos; i++) {
			head = head.getNext();
		}
		nextNode = head.getNext();
		Node newNode = new Node(data);
		
		head.setNext(newNode);
		newNode.setNext(nextNode);

	}

	// public void insert(int pos, int data){
	// 	Node insert = new Node(data);

	// 	if(head != null){
	// 		for(int i = 0; i < pos; i++){
	// 			head.getNext();
	// 		}
	// 		head.setNext(insert);
	// 	}
	// }
	//Period 2
	// public void insert(int pos, int data){
	// 	if(pos == 0){
	// 		Node n = new Node(data);
	// 		n.setNext(head);
	// 		head = n;
	// 	}
	// 	Node current = head;
	// 	int counter = 0;
	// 	Node n = new Node(data);
	// 	while(current.getNext() != null){
	// 		if((counter+1) == pos){
	// 			n.setNext(current.getNext());
	// 			current.setNext(n);
	// 			break;
	// 		}
	// 		current = current.getNext();
	// 		counter++;
	// 	}
	// }

	/*
		Remove the node at the given position
		If no position exists, don't change the list
		CycleNode is the node before the one you want to remove, AfterNode is the node that you want to remove
		which turns into the node after the one you remove. The last line sets the node after CycleNode remove the AfterNode.
	*/
	public void remove(int pos){
		if (head == null){
			return;
		}
		Node CycleNode = head;
		Node AfterNode;
		for(int i =0;i<pos-1;i++){
			if(CycleNode == null){
				return;	
			}
			CycleNode = CycleNode.getNext();
			
		}
		if(CycleNode.getNext()==null){
			return;
		}
		AfterNode = CycleNode.getNext();
		CycleNode.setNext(AfterNode.getNext());
	}

	/*
		Swap two Nodes with the two positions given
	*/
	public void swap(int pos1, int pos2){

	}

public void printList() {
        Node temp = head.getNext();
        for (int c = 0; c < Integer.MAX_VALUE; c++) {
            if (c == 0) {
                System.out.println(head.getData());


            } else {
                temp = temp.getNext();


                if (temp == null) {
                    return;


                }
                System.out.println(temp.getData());


            }


        }
    }


}
