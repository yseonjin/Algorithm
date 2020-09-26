package algori_01;

public class jv05 {

	public static void main(String[] args) {
		int gugu;
		for(int x =1; x<=9; x++) {
			for(int y =2; y<=9; y++) {
				gugu = y*x;
				System.out.printf("%2d * %2d = %2d ||", y,x,gugu);
			}
			System.out.println("");
		}

	}

}
