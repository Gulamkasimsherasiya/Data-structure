import java.util.Scanner;
public class Fullbinarytreeprepost{

    static class Node{
    	int data;
    	int left;
    	int right;
    }

    public Node(int data){
    	this.data=data;
    }

    static int preIndex;
    static Node constructtreeuntil(int pre[],int post[],int l,int h,int size){
    	if(preIndex>=size||l>h){
    		return  null;
    	}
    	Node root=new Node(pre[preIndex]);
    	preIndex++;

    	if(l==h||preIndex>=size){
    		return root;
    	}
    	int i;
    	for(i=l;i<=h;i++){
    		if(post[i]==pre[preIndex]){
    			break;
    		}
    		if(i<=h){
    			root.left=constructtreeuntil(pre,post,l,i,size);
    			root.right=constructtreeuntil(pre,post,i+1,h-1,size);
    		}
    		return root;
    	}
        static Node constructtreeuntil(int pre[],int post[],int size){
        	preIndex=0;
        	return constructtreeuntil(pre,post,0,size-1,size);
        }
        static Node printInOrder(Node root){
        	if(root==null){
        		return;
        	}
        	printInorder(root.left);
        	System.out.println(root.data+" ");
        	printInorder(roo.right);
        } 
    }

	public static void main(String[] args) {
		Fullbinarytreeprepost tree = new Fullbinarytreeprepost();

		int pre[] = {1,2,4,5,3,6,9};
		int post[] = {4,5,2,6,9,3,1};

		Node root = tree.constructtreeuntil(pre, post);
        
        System.out.println("inorder traversal of tree:");
		tree.printInOrder(root);
	}
}