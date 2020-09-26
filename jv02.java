package algori_01;

public class jv02 {
	
	static int min4 (int a, int b, int c, int d) {
		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		if (d < min) {
			min = d;
		}
		return min;
	}
	public static void main(String[] args) {
		System.out.println("최솟값 : "+ min4(2,3,6,8));
		System.out.println("최솟값 : "+ min4(3,1,9,10));
	}
	
}
