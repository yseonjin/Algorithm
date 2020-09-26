package algori_01;

public class jv06 {

	public static void main(String[] args) {
		int gugu; int x=1; int y=2;
		while(x<=9) {
			while(y<=9) {
				gugu = y*x;
				System.out.printf("%2d * %2d = %2d ||", y,x,gugu);	
				y++;
			}
			y=2;
			x++;
			System.out.println("");
		}

	}

}