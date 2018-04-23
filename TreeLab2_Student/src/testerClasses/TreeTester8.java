package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;

public class TreeTester8 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		LinkedBinaryTree<Integer> t = Utils.buildExampleTreeAsLinkedBinaryTree(), 
				clT = Utils.buildExampleTreeAsLinkedBinaryTree(); 

		Utils.displayTree("Original t", t); 
		clT = t.clone();
		Utils.displayTree("Clone of t", clT); 
		
	}

}