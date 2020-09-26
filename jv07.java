package algori_01;

import java.util.Scanner;

public class jv07 {

	public static void main(String[] args) {
		System.out.println("직각 이등변 삼각형의 변의 길이를 자연수로 입력해주세요 :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <=n;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
