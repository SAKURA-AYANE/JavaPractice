/* ���Լ��GCD�� ��С������LCM
 * ֤�����ģ�
 * 	p��q�����Լ������q��p%q���������Լ��
 * 	��С����������p��q�ĳ˻��������Լ������Ϊ�˻������������Լ��
 * ʱ�临�Ӷ�O(log n)
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
