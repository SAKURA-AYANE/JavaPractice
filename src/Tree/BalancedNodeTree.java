package Tree;
public class BalancedNodeTree {
	 int data; //���ڵ�����
	 BalancedNodeTree left; //������
	  BalancedNodeTree right; //������
	public BalancedNodeTree() {
		super();
	}
	public BalancedNodeTree(int data) { //ʵ����������
		super();
		this.data = data;
		left=null;
		right=null;
	}
	 public void insert(BalancedNodeTree root,int data){
		 if(data>root.data){ //�������Ľڵ���ڸ��ڵ�
			 if(root.right==null){			//���������Ϊ�գ��Ͳ��룬�����Ϊ�վ��ٴ���һ���ڵ�											 				
			 root.right=new BalancedNodeTree(data); //�ͰѲ���Ľڵ�����ұ�
			 }else{
				 this.insert(root.right, data);
			 }
		 }else{  //�������Ľڵ�С�ڸ��ڵ�
			 if(root.left==null){ //���������Ϊ�գ��Ͳ��룬�����Ϊ�վ��ٴ���һ���ڵ�			
				 root.left=new BalancedNodeTree(data); //�ͰѲ���Ľڵ������߱�
			 }else{
				 this.insert(root.left, data);
			 }
		 }
	 }
	 
}