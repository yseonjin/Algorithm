package algori_02;
import java.util.Random;
import java.util.Scanner;
//난수를 사용해 배열의 요솟값 설정하기
public class jv12 {
		static int minOf(int[]a) {
			int min = a[0];
			for(int i =0; i<a.length;i++) {
				if (a[i] < min){
					min = a[i];
				}
			}
			return min;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하시오 : ");
		int num = sc.nextInt();
		int height[] = new int[num];
		
		Random rand = new Random();
		
	    for(int j = 0 ;j<height.length;j++) {
	    	
	    	int stHeight = rand.nextInt(90);
	    	height[j] = stHeight+100;
	    }
		for(int x =0 ; x<height.length;x++) {
			System.out.println(x+1+"번째 학생의 키는 : "+height[x]+"입니다.");
		}
		System.out.println("가장 작은 키는 "+minOf(height)+"입니다.");
	}
}
