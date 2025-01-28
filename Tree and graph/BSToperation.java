import java.util.Scanner;
public class BSToperation{
	class Node{
		int key;
		Node left;
		Node right;

		public Node(int data){
			key=data;
			left=null;
			right=null;
		}
	}
	node root;

	 BSToperation() {
        root = null;
    }

    //insert record
	void insert(int data) {
        root = insertRec(root, data);
    }
    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

	//search record
    void serch(int data){
    	return searchRec(root,key);
    }
    boolean searchRec(Node root,int data){
    	if(root==null){
    		return false;
    	}
    	else if(data==root.key){
    		return true;
    	}
    	else if(data>root.key){
    		return searchRec(root.left,data);
    	}
    	else
    	{
    		return searchRec(root.left,data);
    	}
    }

    //delete record
    void delete(int data){
    	return deleteRec(root,key);
    }
    private Node deleteRec(Node root,int key){
    	if(root==null){
    		return root;
    	}
    	if(key<root.data){
    		root.left=deleteRec(root.left,key);
    	}
    	else if(key>root.data){
    		root.right=deleteRec(root.right,key);
    	}
    	else
    	{
    		if(root.left==null){
    			return root.right;
    		}
    		else if(root.right==null){
    			return root.left;
    		}

    		root.data = minValue(root.right);

            root.right = deleteRec(root.right, root.data);
    	}
    	return root;
    }
    int minValue(Node root){
    	int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        BSToperation bst = new BSToperation();
        boolean istrue = true;
        int choice, value;

        while(istrue){
        	System.out.println("ENTER YOUR CHOICE:");
            System.out.println("1. Insert a node");
            System.out.println("2. Delete a node");
            System.out.println("3. Search for a node");
            System.out.println("4. Exit");

            switch (choice){

                case 1:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    bst.insert(value);
                    break;

                case 2:
                    System.out.print("Enter value to delete: ");
                    value = sc.nextInt();
                    bst.delete(value);
                    break;

                case 3:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();
                    if (bst.search(value)) {
                        System.out.println("Value found in the tree.");
                    } else {
                        System.out.println("Value not found in the tree.");
                    }
                    break;
                
                case 4:
                    istrue = false;
                    break;
            }
        }
    }
}