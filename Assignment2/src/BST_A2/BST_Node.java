package BST_A2;

public class BST_Node {
	String data;
	BST_Node left;
	BST_Node right;
	  
	BST_Node(String data){ this.data=data; }

	// --- used for testing  ----------------------------------------------
	//
	// leave these 3 methods in, as is

	public String getData(){ return data; }
	public BST_Node getLeft(){ return left; }
	public BST_Node getRight(){ return right; }

	// --- end used for testing -------------------------------------------

	  
	// --- fill in these methods ------------------------------------------
	//
	// at the moment, they are stubs returning false 
	// or some appropriate "fake" value
	//
	// you make them work properly
	// add the meat of correct implementation logic to them

	// you MAY change the signatures if you wish...
	// make the take more or different parameters
	// have them return different types
	//
	// you may use recursive or iterative implementations

	

	public boolean containsNode(BST_Node n, String s){
		if(n==null){
			return false;
		}
		int compare=s.compareTo(n.data);
		if(compare<0){//<
			return containsNode(n.left, s);
		}
		else if(compare>0){
			return containsNode(n.right, s);
		}
		else 
			return true;
	}
	public void insertNode(BST_Node n, String s){
		int compare=s.compareTo(n.data);
		
		if(compare<0){
			if(n.left!=null){
				insertNode(n.left,s);
			}else{
				n.left=new BST_Node(s);
			}
		}else if(compare>0){
			if(n.right!=null){
				insertNode(n.right,s);
			}
			else{
				n.right=new BST_Node(s);
			}
		}
		else{
			
		}
	}


	
	public BST_Node removeNode(BST_Node n, String s){
		if(n==null)
			return n;
		int compare=s.compareTo(n.data);
		if(compare<0){
			n.left=removeNode(n.left,s);
		}else if(compare>0){
			n.right=removeNode(n.right, s);
		}
		else if(n.left!=null&&n.right!=null){
			n.data=findMin(n.right).getData();
			n.right=removeNode(n.right,n.right.findMin(n.right).getData());
			//n.right=null;
		}
		else{//System.out.println("Found node to remove");

			//BST_Node blah;
			if(n.left!=null){
				n=n.left;
				//n.left=null;
				//blah=n.findMax(n);
				//blah=null;
			}
			else{
				n=n.right;
				//blah=n.right.findMin(n);
				//blah=null;
				
			}
		}
		return n;
	}

		
	public BST_Node findMin(BST_Node n){
		if(n==null)
			return null;
		else if(n.left==null)
			return n;
		else
			return findMin(n.left);
	}

	public BST_Node findMax(BST_Node n){
		if(n==null)
			return null;
		else if(n.right== null)
			return n;
		else 
			return findMax(n.right);
	}

	public int getHeight(BST_Node n){//BST_Node n){
		//BST_Node n;
		int h;
		if(n==null){
			return -1;
		} else
			h=Math.max(getHeight(n.left),getHeight(n.right));
		//System.out.println(h+1);
			return h+1;
					
		
	}


	// --- end fill in these methods --------------------------------------


	// --------------------------------------------------------------------
	// you may add any other methods you want to get the job done
	// --------------------------------------------------------------------
	  
	public String toString(){
		return "Data: "+this.data+", Left: "+((this.left!=null)?left.data:"null")
	            +",Right: "+((this.right!=null)?right.data:"null");
	  }

}


//     SCRAP CODE
//
//
//BOOLEAN INSERT
//public boolean insertNode(String s){
//int compare=s.compareTo(data);
//
//if(compare<0){
//	if(left!=null){
//		left.insertNode(s);
//		return true;
//	}else {
//		left=new BST_Node(s);
//		return true;
//	}
//}else if(compare>0){
//	if(right!=null){
//		right.insertNode(s);
//		return true;
//	}
//	else {
//		right=new BST_Node(s);
//		return true;
//	}
//	
//}
//else {
//	return false;
//	
//}
//}
//}
//
//if(n==null){
//n=null;
//}
//int compare=s.compareTo(n.data);
//if(compare<0)
//insertNode(n.left,s);
//else if(compare>0)
//insertNode(n.right,s);
//else{
//
//}
//return n;
//
//}

//return false;

//if(this.data==s){
	//return false;
//}
//if(left.data.charAt(0)<s.charAt(0)){
//	if (left!=null){
//		left=left.left;
//	}
//	else{
//		this.left=new BST_Node(s);
//	}
//	return true;
//}if(right.data.charAt(0)>s.charAt(0)){
//	if (right!=null){
//		right=right.right;
//	}
//	else{
//		this.right=new BST_Node(s);
//	}
//	return true;
//}
//return false;
//
//}
//public boolean insertNode(BST_Node n, String s){ 

//if (s.charAt(0)<n.data.charAt(0)){
//	if (n.left!=null){
//		insertNode(n.left, s);
//	}else{
//		n.left= new BST_Node(s);
//	}
//	return true;
//}else if (s.charAt(0)>n.data.charAt(0)){
//	if (n.right!=null){
//		insertNode(n.left, s);
//	}
//	else{
//		n.right= new BST_Node(s);
//	}
//	return true;
//}
//return false;
//return false; 
//}
/*	public boolean insertNode(String s){
BST_Node n= new BST_Node(s);

if(containsNode(s)){
	return false;
}
else{
	if(s.compareTo(data)<0){
		if(left==null){
			left=n;
			return true;
		}else{
			return false;
//		//left=n;
//		if(s.compareTo(left.data)<0)
//			left.left=n;
//		else if(s.compareTo(left.data)>0)
//			left.right=n;
		}
		//return true;
	}else if (s.compareTo(data)>0){
		if(right==null){
			right=n;
			return true;
		}
		else{
			return false;
//		if(s.compareTo(right.data)<0)
//			right.left=n;
//		else if (s.compareTo(right.data)>0)
//			right.right=n;
		}
		//return true;
	}
}
return false;
}*/
//public boolean containsNode(BST_Node n, String s){
//int compare=s.compareTo(n.data);
//boolean is=false;
//if(n!=null){
//	if(compare<0){
//		n=n.left;
//		is=true;
//	}else if(compare>0){
//		n=n.right;
//		is=true;
//	}
//	else if(compare==0)
//		is= false;
//	//return true;
//}
//return is;
//if(n==null){
//	return false;
//	//isIn=false;
//}
//else{
//	if(compare<0){
//		n=n.left;
//		
//	}
//}
//
//
//}

// OLD REMOVE METHOD!!!!!
//public boolean removeNode(String s){ 
//	//if(containsNode)
//	//int compare=s.compareTo(n.data);
////	if()
////		return false;
//	int compare=s.compareTo(data);
//	if(compare<0){
//		if(left!=null){
//			left.removeNode(s);
//		}else{
//			left=null;//left.findMax(left);
//			return true;
//		}
//	}else if(compare>0){
//		if(right!=null)
//			right.removeNode(s);
//		else{
//			right=null;//right.findMin(right);
//			return true;
//		}
//	}
//	else{
//		if(left!=null){
//			data=left.findMax(left).getData();
//			left.removeNode(s);
//			return true;
//		}
//		if(left==null){//else if
//			data=right.findMin(right).getData();
//			right.removeNode(s);
//			return true;
//		}
		
	//}//return false;
//	 return false;
//}
//	else if(left!=null&&right!=null){
//		if(n.left.data.compareTo(n.right.data)<0){
//			n.data=findMin(n.left).getData();
//			n.left=removeNode(n.left,s);
//		}else if (n.left.data.compareTo(n.right.data)>0){
//			n.data=findMax(n.right).getData();
//			n.right=removeNode(n.right,s);
//		}
//	}
//	else{
//		if(n.left!=null)
//			n=n.findMin(n.left);
//		else
//			n=n.findMax(n.right);
//		//n=(n.left!=null)? n.left:n.right;
//	}
//	return n;


//       OLD HEIGHT
//int lHi=left.getHeight();
//int rHi=right.getHeight();
//if(lHi>rHi){
//	rHi--;
//	return lHi++;
//}
//else {
//	lHi--;
//	return rHi++;
//}
//	
//
//if(right!=null&&left!=null)
//	return 1;
//if (right!=null || left!=null)
//	return 1;
//else
//	return 0; 
//}
//BST_Node n=left;//new BST_Node(null);
//if (n.left!=null){
//	left=n.left;
//	
//	return left;
//}
//else
//	return this;
//}
