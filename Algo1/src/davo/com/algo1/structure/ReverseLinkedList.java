package davo.com.algo1.structure;

/**
 * Having a linked list reverse the contend of it.
 * @author davo
 * 
 * Algorithm.
 * 
 *
 */
public class ReverseLinkedList {
	
	public static void main(String args[]){
		Node node = generateTestLinst();
		printList(node);
		System.out.println("");
		reversePrint(node);
		
	}
	
	public static void printList(Node node){
		if(node != null){
			System.out.print(node.getValue() + " -> ");
		}
		if(node.getNextElement() != null){
			printList(node.getNextElement());
		}
	}
	
	public static void reversePrint(Node node){
		if(node != null){
			if(node.getNextElement() != null){
				reversePrint(node.getNextElement());
			}
			System.out.print(node.getValue() + " -> ");
		}
	}
	
	public static Node generateTestLinst(){
		Node n1 = new Node("A");
		Node n2 = new Node("B");
		Node n3 = new Node("C");
		Node n4 = new Node();
		
		n1.setNextElement(n2);
		n2.setNextElement(n3);
		n3.setNextElement(n4);
		
		return n1;
	}

}
