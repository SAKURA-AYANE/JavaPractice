/* 最大公约数GCD和 最小公倍数LCM
 * 证明核心：
 * 	p和q的最大公约数等于q和p%q余数的最大公约数
 * 	最小公倍数等于p和q的乘积除以最大公约数，因为乘积包含两个最大公约数
 * 时间复杂度O(log n)
 */
public class GCDAndLCM {
	public static void main(String[] args) {
		System.out.println(gcd(77, 21));
		System.out.println(lcm(14, 21));
	}
	
	public static int gcd(int p, int q) {
		if(q == 0) {
			return p;
		}
		else {
			return gcd(q, p % q);
		}
	}
	public static int lcm(int p, int q) {
		int gcd = gcd(p, q);
		return p*q/gcd;
	}
}
