 package BST_A2;

public class BST_Playground {
	/*
	 * you will test your own BST implementation in here
	 *
	 * we will replace this with our own when grading, and will
	 * do what you should do in here... create BST objects,
	 * put data into them, take data out, look for values stored
	 * in it, checking size and height, and looking at the BST_Nodes
	 * to see if they are all linked up correctly for a BST
	 * 
	*/
	  
	  public static void main(String[]args){
		  //System.out.print("lala");
		  //System.out.println("TESTING");
		  //case1();
		  //case2();
		  //case3();
		  //case4();
		  case5();
	  }
		  public static void case1(){
			  
		  BST B=new BST();
		  B.insert("king");
		  B.insert("queen");
		  B.insert("jack");
		  B.insert("lala");
		  B.insert("zulu");
		  B.insert("isaac");
		  B.insert("alan");
		  B.insert("blake");
		  B.remove("jack");
		  System.out.println(B.size);
		  System.out.println(B.contains("queen"));
		  System.out.println(B.contains("jack"));
		  System.out.println(B.contains("qiwbdwkbdhb"));
		  System.out.println(B.findMax());
		  System.out.println(B.findMin());
		  B.remove("king");
		  System.out.println(B.contains("king"));
		  //System.out.println(B);
		  //prin
		  System.out.println(B.height());
		  }
		  public static void case2(){
			  BST a=new BST();
			  
			  a.insert("0");
			  a.insert("C");
			  a.insert("A");
			  a.insert("B");
			  a.insert("E");
			  a.insert("D");
			  printLevelOrder(a);
			  a.remove("C");
			  //printLevelOrder(a);
			  System.out.println(a.contains("C"));
			  System.out.println(a.contains("0"));
			  System.out.println(a.contains("C"));
			  System.out.println(a.contains("A"));
			  System.out.println(a.contains("B"));
			  System.out.println(a.contains("E"));
			  System.out.println(a.contains("D"));
			  printLevelOrder(a);
			  System.out.println(a.getRoot().right);
		  }
		  public static void case3(){
			  BST c = new BST();
			  c.insert("0");
			  c.insert("C");
			  c.insert("A");
			  //c.insert("B");
			  c.insert("E");
			  c.insert("D");
			  printLevelOrder(c);
			  //c.remove("D");
			 c.remove("C");
			  //c.remove("A");
			  //c.remove("B");
			 // printLevelOrder(c);
			  //c.remove("E");
			 // c.remove("D");
			  printLevelOrder(c);
		  }
		  public static void case4(){
			  BST z=new BST();
			  z.insert("B");
			  z.insert("A");
			  z.insert("D");
			  z.insert("C");
			  z.insert("E");
			  z.insert("D");
			  printLevelOrder(z);
			  System.out.println(z.getRoot().right);
			  z.remove("E");
			  printLevelOrder(z);
		  }
		  
		  public static void case5(){
			  BST q =new BST();
			  q.insert("B");
			 // q.insert("A");
			  //q.insert("D");
			  q.insert("D");
			  q.insert("C");
			  q.insert("E");
			  printLevelOrder(q);
			  
			  q.remove("D");
			  printLevelOrder(q);
			  //System.out.println(q.insert("A"));
			  //System.out.println(q.size);
			  //System.out.println(q.remove("B"));
			  //printLevelOrder(q);
			  
		  }
			  
			  
		  
		  

	   // you should test your BST implementation in here
	   // it is up to you to test it rthoroughly and make sure
	   // the methods behave as requested above in the interface
	  
	   // do not simple depend on the oracle test we will give
	   // use the oracle tests as a way of checking AFTER you have done
	   // your own testing

	   // one thing you might find useful for debugging is a print tree method
	   // feel free to use the printLevelOrder method to verify your trees manually
	   // or write one you like better
	   // you may wish to print not only the node value, and indicators of what
	   // nodes are the left and right subtree roots,
	   // but also which node is the parent of the current node
	 
	//  }

	  static void printLevelOrder(BST tree){ 
	  //will print your current tree in Level-Order...
	  //https://en.wikipedia.org/wiki/Tree_traversal
	    int h=tree.getRoot().getHeight(tree.getRoot());
	    for(int i=0;i<=h;i++){
	      printGivenLevel(tree.getRoot(), i);
	    }
	    
	  }
	  static void printGivenLevel(BST_Node root,int level){
	    if(root==null)return;
	    if(level==0)System.out.print(root.data+" ");
	    else if(level>0){
	      printGivenLevel(root.left,level-1);
	      printGivenLevel(root.right,level-1);
	    }
	  }

}
