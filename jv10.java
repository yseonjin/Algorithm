package algori_02;
import java.util.Scanner;
//1. 키가 가장 큰 사람의 키를 구하는 프로그램을 만들어보기 (MAX)
public class jv10 {
		static int maxOf(int[]a) {
			int max = a[0];
			for(int i =0; i<a.length;i++) {
				if (a[i]> max){
					max = a[i];
				}
			}
			return max;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하시오 : ");
		
		int num = sc.nextInt();
		int height[] = new int[num];
		
	    for(int j = 0 ;j<height.length;j++) {
	    	Scanner hg = new Scanner(System.in);
	    	System.out.print(j+1+"번째 학생의 키를 입력하시오 : ");
	    	int stHeight = hg.nextInt();
	    	height[j] = stHeight;
	    }
		for(int x =0 ; x<height.length;x++) {
			System.out.println(x+1+"번째 학생의 키는 : "+height[x]+"입니다.");
		}
		System.out.println("가장 큰 키는 "+maxOf(height)+"입니다.");
	}
}
