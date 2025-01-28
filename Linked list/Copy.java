import java.util.Scanner;

class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class DemolinkedList{
	Node first;

     DemolinkedList() {
        first = null;
    }

	 public void InsertAtLast(int data){
		Node newNode = new Node(data);
		if(first == null){
			first = newNode;
		}
		else
		{
			Node save = first;
		while(save.link!=null){
			save = save.link;
		}
		save.link = newNode;
		System.out.println("node with value"+data+" inserted at last");
		}
	}

    public void Display(){
		if(first==null){
			System.out.println("linked list is empty!!... can't display node:");
		}
		else
		{
			Node current = first;
			System.out.print("Linked list nodes: ");
			while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.link;
	        }
	        System.out.println("null");
		}
	}

	// public void copy(){
	// 	DemolinkedList newList = new DemolinkedList();
	// 	Node current = first;
	// 	while(current!=null){
	// 		newList.InsertAtLast(current.data);
	// 		current=current.link;
	// 	}
	// 	return;
	// }
	 public DemolinkedList copy() {
        DemolinkedList newList = new DemolinkedList();
        Node current = first;
        while (current != null) {
            newList.InsertAtLast(current.data);
            current = current.link;
        }
        return newList;
    }
}
public class Copy{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DemolinkedList dl = new DemolinkedList();
		DemolinkedList copiedList = null; // To store the copied list
		boolean istrue = true;

		while(istrue){
			System.out.println("eneter your choice:");
			System.out.println("1. INSERT NODE AT LAST");
			System.out.println("2. Display NODE");
			System.out.println("3. COPY NODE");
			System.out.println("4. DISPLAY COPIED LIST");
            System.out.println("5. EXIT");

			int choice = sc.nextInt();
			int val;

			switch(choice){

			    case 1:
			    	System.out.println("enter value to add at first");
			    	val = sc.nextInt();
			    	dl.InsertAtLast(val);
			    	break;

			    case 2:
			        dl.Display();
			        break;

			    case 3:
			    	dl.copy();
			    	break;

			    case 4:
                    if (copiedList == null) {
                        System.out.println("No copied list available.");
                    } else {
                        System.out.println("Copied list nodes: ");
                        copiedList.Display();
                    }
                    break;

			    case 5:
			    	istrue = false;
			    	break;
			}
		}
	}
}