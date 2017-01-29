package BST_A2;
 
public class BST implements BST_Interface {
	public BST_Node root;
	  int size;
	  
	  public BST(){ size=0; root=null; }

	@Override
	public boolean insert(String s){
		if (root==null){
			root=new BST_Node(s);
			size++;
			return true;
		}else if(contains(s)){
			return false;
		}
		else{
			root.insertNode(root, s);
			size++;
			return true;
		}
	}


	
	public boolean remove(String s){
		//BST_Node n= root;
		if(empty()||contains(s)==false){
			return false;
			}
		else if(size==1){
				root=null;
				size--;
				return true;
			}
		else{
			root.removeNode(root, s);
			size--;
			return true;
		}
		//return false;
		}


	@Override
	public String findMin() {
		//BST_Node n=root;
		if (empty())
			return null;
		else{
		//root=root.findMin(root);
			BST_Node n=root.findMin(root);
			return n.getData();
			
		}
	}
//		BST_Node nL=root;
//		while (nL.left!=null){
//			nL=nL.findMin();
//		}
//		
//		// TODO Auto-generated method stub
//		return nL.getData();
//	}

	@Override
	public String findMax() {
		//BST_Node nR=root;
//		if(empty()){
//			return null;
//		}else
		//root=root.findMax(root);
			BST_Node nR=root.findMax(root);
		return nR.getData();
	}
//		// TODO Auto-generated method stub
//		while (nR.right!=null){
//			nR=nR.findMax();
//		}
//		return nR.getData();
//	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	@Override
	public boolean contains(String s) {
		BST_Node n=root;
		return n.containsNode(n,s);
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public int height() {
		BST_Node n=root;
		return n.getHeight(n);
		// TODO Auto-generated method stub
		//return 0;
	}

//	@Override
//	public BST_Node getRoot() {
//		// TODO Auto-generated method stub
//		return null;
//		
//	}
	@Override
	  //used for testing, please leave as is
	  public BST_Node getRoot(){ return root; }


}


//       SCRAP CODE
////BST_Node n = new BST_Node(s);
//BST_Node n=root;
//
//if (size==0){
//	return false;
//}
//else{
//	if(n.containsNode(n,s)){
//		return true;
//	}
//	else 
//		return false;
//	
//}
//// TODO Auto-generated method stub
//}
//if (size==0){
//root=n;
////return true;
////root.insertNode(s);
//}else{
//while (n.insertNode(s)==false){
//	if(n.containsNode(s)){
//		return false;
//	}else{
//		if(s.compareTo(n.data)<0){
//			n=n.findMin();
//		}else{
//			n=n.findMax();
//		}
//	}
//}

//.insertNode(s);

// TODO Auto-generated method stub
//size++;
//return false;

//public boolean insert(String s) {
////BST_Node n= new BST_Node(s);
//if (root==null){
//	root=new BST_Node(s);
//	size++;
//	return true;
//}//else{
////else if(root.containsNode(root, s)){
////	return false;
////}
//if(root.insertNode(s)){
//	root.insertNode(s);
//	size++;
//	return true;
//}
//else return false;
//	
////}
////return false;
//}


//if(n.removeNode(n, s)==null)
//return false;
//else{
//size--;
//return false;
//}
//}
//OLD REMOVE METHOD!!!!!
//@Override
//public boolean remove(String s) {
////BST_Node n = root;
////if(empty()){
////return false;
////}
//if (root.containsNode(root, s)){
//root.removeNode(s);
//size--;
//return true;
//}
//else return false;
//}
//if(n.removeNode(n, s)==null)
//return false;
//// TODO Auto-generated method stub
//else{
//size--;
//return true;
//}
//}
