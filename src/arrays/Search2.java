package arrays;

public class Search2 {
	
	public static final int NONE =-1;
	
	
	public static <E extends Comparable<E>> int linearSearch (
			E target,
			E[] a, int left, int right) {
		// Find which (if any) element of a[left…right] 
		// equals target.
		for (int p = left; p <= right; p++) {
			if (target.equals(a[p]))
				return p;
			}
		return NONE;
	}
	
	
	public static <E extends Comparable<E>> int binarySearch (
			E target,
			E[] a, int left, int right) {
		int l = left, r = right;
		while (l <= r) {
			int m = (l + r)/2;
			int comp = target.compareTo(a[m]);
			if (comp == 0)     return m;
			else if (comp < 0) r = m - 1;
			else               l = m + 1;
			}
		return NONE;
		}

		

	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] a = {-1,2,3,5,7,12};
		Integer[] b = {0,4,6,8,9,10,11,13};
		String neg =" not";
		
		System.out.println("Demonstrating Linear search:");
		int p =linearSearch(2,a,0,a.length-1);
		String s="";
		if(p==NONE) s+=neg;
        System.out.println("Array a does" + s + " contain value 2");
        p =linearSearch(2,b,0,b.length-1);
		s="";
		if(p==NONE) s+=neg;
        System.out.println("Array b does" + s + " contain value 2");
        
        System.out.println("Demonstrating binary search:");
        p =binarySearch(2,a,0,a.length-1);
		s="";
		if(p==NONE) s+=neg;
        System.out.println("Array a does" + s + " contain value 2");
        p =binarySearch(2,b,0,b.length-1);
		s="";
		if(p==NONE) s+=neg;
        System.out.println("Array b does" + s + " contain value 2");

	}

}
