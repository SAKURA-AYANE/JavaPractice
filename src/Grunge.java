public class Grunge {
	public static void main(String[] args) {
		System.out.println("С��Ӧ��ÿ���ռ�" + String.valueOf(MaxU(2, 1)) + "������");
	}
	
	public static int MaxU(int cd, int gabage) {
		int bestG = 0;
		for(int g = 0; g < 20; g++) {
			int c = g * gabage / cd;
			int min = 0;
			if((2*c) < (20 - g)) {
				min = 2 * c;
			} else {
				min = 20 - g;
			}

			if(min > bestG) {
				bestG = g;
			}
		} 
		return bestG;
	}
}
