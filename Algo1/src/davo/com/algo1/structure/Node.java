package davo.com.algo1.structure;

/**
 * Linked list node representation.
 * @author davo
 *
 */
public class Node {
	
	private String value;
	private Node nextElement;
	
	public Node(String value){
		this.value= value;
	}
	
	public Node(){}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Node getNextElement() {
		return nextElement;
	}
	public void setNextElement(Node nextElement) {
		this.nextElement = nextElement;
	}
	
}
