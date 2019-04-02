package Tree;
public class BalancedNodeTree {
	 int data; //根节点数据
	 BalancedNodeTree left; //左子树
	  BalancedNodeTree right; //右子树
	public BalancedNodeTree() {
		super();
	}
	public BalancedNodeTree(int data) { //实例化二叉树
		super();
		this.data = data;
		left=null;
		right=null;
	}
	 public void insert(BalancedNodeTree root,int data){
		 if(data>root.data){ //如果插入的节点大于跟节点
			 if(root.right==null){			//如果右子树为空，就插入，如果不为空就再创建一个节点											 				
			 root.right=new BalancedNodeTree(data); //就把插入的节点放在右边
			 }else{
				 this.insert(root.right, data);
			 }
		 }else{  //如果插入的节点小于根节点
			 if(root.left==null){ //如果左子树为空，就插入，如果不为空就再创建一个节点			
				 root.left=new BalancedNodeTree(data); //就把插入的节点放在左边边
			 }else{
				 this.insert(root.left, data);
			 }
		 }
	 }
	 
}