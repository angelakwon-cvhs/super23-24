package pkg;
import java.util.Scanner;
import java.util.Random;


public class BinarySearchTree {
	Node root;
	int size;

	//https://cs61bl.org/su23/labs/lab11/#binary-search-trees

	/* 
		Postcondition: The root will be null
	*/
	public BinarySearchTree() {
		this.root = null; // node already has the right and left
		this.size = 0;
	}

	/* 
		Create the contains method. Implement it recursively and iteratively.
	*/ 
	public boolean contains(int value){
		if (root.value == value) {
			return true;
		} else {
			contains(root.left);
			contains(root.right);
		}
		return false;
	}

	/*
		Insert a new Node correctly into the tree ensuring that the left nodes are smaller 
		than the current node and right nodes are larger. 
		Duplicates should always be on the right side of the tree. 
	*/
	public void insert(int value){ // To-Do: Need to increase the size variable
		if (root.value == value) {
			root.right = new Node(value);
			return;  // duplicate key
		} 
		elif (value < root.value) {
			// can't lose reference
			insert(root.left); // if we did it iteratively, we would need to have another pointer..
			// stack...
			root.left = new Node(root.value);

		} else {
			insert(root.right);
			root.right = new Node(root.value);
		}
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
		Print all data values of the tree in Breadth First Search Order from a specified starting node.
	*/
	public void PrintBreadthFirst(Node curr){  // Why did Jacob have another level of abstraction?
		if (curr.left == null && curr.right == null) {
			System.out.println(curr.value)
			return;
		}
		// need a way to stop going down the tree
		elif (curr.left != null) {
			PrintBreadthFirst(curr.left);
		}
		elif (curr.right != null) {
			PrintBreadthFirst(curr.right);
		}
		else {
			System.out.println(curr.value);
		}

	}


	/*
		Print all data values of the tree in Depth First Search Order from a specified starting node.
	*/
	public void PrintDepthFirst(Node curr){
		if (curr == null) {
			return;
		}
		else {
			System.out.println(curr.value);
		}
		System.out.println(PrintBreadthFirst(curr.left));
		System.out.println(PrintBreadthFirst(curr.right));
	}
}
