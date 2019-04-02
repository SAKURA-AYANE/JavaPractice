// 快速计算b^n
//时间复杂度O(log n)
public class SmartPower {
	public static void main(String[] args) {
		System.out.println(power(2, 10));
	}
	public static int power(int b, int n) {
		int q = b;
		int m = n;		
		int p = 1;
		while (m > 0) {
			if(m %2 == 1) {
				p = p * q;
			}
			m = m / 2; // 整除，省略余数
			q = q * q;
		}
		return p;
	}
}
