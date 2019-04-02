import java.util.Scanner;

public class Nocodio {

	public static void main(String[] args) {
		
		// scan in start and end range
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end = in.nextInt();
		
		// get the first number of start and end range
		// if it is not odd, get the closest odd
		int headS = Integer.parseInt(String.valueOf(start).substring(0, 1));
		if (headS % 2 == 0)
			headS++;
		int headE = Integer.parseInt(String.valueOf(end).substring(0, 1));
		if (headE % 2 == 0)
			headE--;
		
		// get the length of start and end range
		int lengthS = String.valueOf(start).length();
		int lengthE = String.valueOf(end).length();

		//get the first and last number to print
		int first = 0;
		int last = 0;
		for (int i = 0; i < lengthS; i++) {
			first = (int) (first + headS * (Math.pow(10, i)));
		}
		for (int i = 0; i < lengthE-1; i++) {
			last += 9 * (Math.pow(10, i));
		}
		last += headE*(Math.pow(10, lengthE-1));
		
		int count = 0; // count nocodio
		loop1: for (int i = first; i <= last; i=i+2) { // read every odd between first and last
			String s = String.valueOf(i);
			char c[] = s.toCharArray(); // get the list of every digits in the number
			for(int j = 0; j<s.length()-1;j++) {
				if(c[j+1]<c[j] || c[j]%2==0) // continue if the next digit is smaller or it is not odd
					continue loop1;
			}
			if(i>=start && i<=end) { // if in the range, print
				count++;
				// test output
				// System.out.print(i+" ");
			}
			if(i>end)
				break; // break if out of range
		}
		System.out.println(count);

	}

}
