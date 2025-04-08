package pkg;
import java.util.Scanner;
import java.util.Random;


public class Node {
	public int data;
	public List<Node> neighbors;

	public Node(int data) {
		this.data = data;
		neighbors = new List<Node>();
	}
	
}
