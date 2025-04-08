package pkg;
import java.util.Scanner;
import java.util.Random;


public class BinarySearchTree {
	Node root;

	/* 
		Postcondition: The root will be null
	*/
	public BinarySearchTree() {

	}

	/* 
		Create the getRecursive method that recursively traverses the tree finding the value. 
		Using curr as the current node that to look at.
	*/ 
	public int get(int value){
		return getRecursive(root,value);
	}
	public int getRecursive(Node curr, int value){

	}

	/*
		Insert a new Node correctly into the tree ensuring that the left nodes are smaller 
		than the current node and right nodes are larger. Duplicates should always be on the right side of the tree. 
	*/
	public void insert(int value){
		insertRecursive(root,value);
	}
	public void insertRecursive(Node curr, int value){

	}

	/*
		Print all data values of the tree in ascending order
	*/
	public void printTree(){
		printTreeRecursive(root);
	}
	public void printTreeRecursive(Node curr){

	}
	
	/*
		Print all data values of the tree in Breadth First Search Order
	*/
	public void BFSprintTree(){
		BFSprintTreeRecursive(root);
	}
	public void BFSprintTreeRecursive(Node curr){

	}

	/*
		Print all data values of the tree in Depth First Search Order
	*/
	public void DFSprintTree(){
		DFSprintTreeRecursive(root);
	}
	public void DFSprintTreeRecursive(Node curr){

	}
}
