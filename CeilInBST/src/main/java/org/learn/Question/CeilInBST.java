
package org.learn.Question;
import org.learn.PrepareTree.Node;

public class CeilInBST {
	
	public static Node ceilInBST(Node root, int data) {
		if (root == null) 
			return root;
		if (root.data == data) 
			return root;
		if (root.data >  data) {
			Node left = ceilInBST(root.left, data); 
			if (left == null) 
				return root;
			else 
				return left; 
		}
		return ceilInBST(root.right, data);		
	}
	
	public static void inorder(Node root) {		
		if(root == null)
			return;
		
		inorder(root.left);
		System.out.printf("%d ",root.data);
		inorder(root.right);		
	}	
}
