
public class BubbleSort {
	public static void main(String[] args) {
	    int[] arr = {1,1,2,0,9,3,12,7,8,3,4,65,22};

	    bubbleSort(arr, arr.length);

	    for(int i:arr){
	        System.out.print(i+",");
	    }
	}
	public static void bubbleSort(int [] a, int n){
	    int j , k;
	    int flag = n ;//flag ����¼��󽻻���λ�ã�Ҳ���������β�߽�

	    while (flag > 0){//����δ������־
	        k = flag; //k ����¼������β�߽�
	        flag = 0; //û����������flag=0������while

	        for(j=1; j<k; j++){
	            if(a[j-1] > a[j]){//ǰ������ִ��ں�������־ͽ���
	                //����a[j-1]��a[j]
	                int temp;
	                temp = a[j-1];
	                a[j-1] = a[j];
	                a[j]=temp;

	                //��ʾ����������;
	                flag = j;//��¼���µ�β�߽�.
	            }
	        }
	    }
	}
}
