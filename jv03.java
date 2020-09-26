package algori_01;

import java.util.Scanner;

public class jv03 {

	public static void main(String[] args) {
		System.out.println("어디까지 합을 구할까요? : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		
		for(int i=0; i<=n; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 n까지의 합:"+sum);
	}

}
