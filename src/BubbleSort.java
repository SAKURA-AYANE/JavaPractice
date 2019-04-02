
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
	    int flag = n ;//flag 来记录最后交换的位置，也就是排序的尾边界

	    while (flag > 0){//排序未结束标志
	        k = flag; //k 来记录遍历的尾边界
	        flag = 0; //没发生交换则flag=0，跳出while

	        for(j=1; j<k; j++){
	            if(a[j-1] > a[j]){//前面的数字大于后面的数字就交换
	                //交换a[j-1]和a[j]
	                int temp;
	                temp = a[j-1];
	                a[j-1] = a[j];
	                a[j]=temp;

	                //表示交换过数据;
	                flag = j;//记录最新的尾边界.
	            }
	        }
	    }
	}
}
