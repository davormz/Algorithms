package davo.com.algo1.structure;

/**
 * 
 * @author davo
 *
 */
public class LinkedListHelper {
	
	public static void printList(Node head){
		if(head != null){
			System.out.print(head.getValue() + " -> ");
		}
		if(head.getNextElement() != null){
			printList(head.getNextElement());
		}
	}
	
	public static void reversePrint(Node head){
		if(head != null){
			if(head.getNextElement() != null){
				reversePrint(head.getNextElement());
			}
			System.out.print(head.getValue() + " -> ");
		}
	}
	
	public static Node pushElement(Node head, Node newHead){
		newHead.setNextElement(head);
		return newHead;
	}
	
	public static void deleteElement(Node head, String value){
		//TODO
	}
	
	public static Node findElement(Node head, String value){
		
		if( !value.equals(head.getValue()) && head.getNextElement() != null)
			findElement(head.getNextElement(), value);
		if(head.getNextElement() == null){
			return null;
		}
		return head;
		
	}

}
