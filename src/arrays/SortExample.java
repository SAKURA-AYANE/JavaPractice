package arrays;

import java.util.Arrays;

public class SortExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  Fruit[] theFruits = new Fruit[5];
	  theFruits[0] = new Fruit("orange", 10);
	  theFruits[1] = new Fruit("banana", 10);
	  theFruits[2] = new Fruit("satsuma", 7);
	  theFruits[3] = new Fruit("melon", 15);
	  theFruits[4] = new Fruit("pear", 6);
	  
	  System.out.println("Original array:");
	  
	  //System.out.println(theFruits); Try this - it just outputs junk
	  
	  for(Fruit f:theFruits) System.out.print(f + "; ");
	  
	  System.out.println("Array sorted by name:");
	  Arrays.sort(theFruits,new Fruit.nameComparator());
	  
	  for(Fruit f:theFruits) System.out.print(f + "; ");
	  
	  System.out.println("Array sorted by cost:");
	  Arrays.sort(theFruits,new Fruit.costComparator());
	  
	  for(Fruit f:theFruits) System.out.print(f + "; ");
	  

	}

}
