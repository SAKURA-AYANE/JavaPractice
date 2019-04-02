public class ReOrder {
	public static void main(String[] args) {
		int [] testArray = {1,2,3,4,5,6,7};
		reOrderArray(testArray);
		for(int t:testArray) {
			System.out.println(t);
		}
	}
    public static void reOrderArray(int [] array) {
        int n = array.length;
        int [] temp1=new int [n];
        int [] temp2=new int [n];
        int count=0;
        int count2=0;
        for (int a:array){
            if (a%2==1){
                temp1[count]=a;
                count++;
            }
            else{
                temp2[count2]=a;
                count2++;
            }
        }
		for(int i =0;i<count;i++) {
			array[i]=temp1[i];
		}
		for(int i = 0; i<count2;i++) {
			array[i+count]=temp2[i];
		}      
    }
}