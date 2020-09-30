package algori_02;

import java.util.Random;
import java.util.Scanner;

public class jv15 {
	 static int sumOf(int[] a) {
		 int sum =0;
		 for(int i=0; i<a.length;i++) {
			 sum += a[i];
		 }
		return sum;
	 }

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("배열의 길이를 입력하세요 : ");
		int num = sc.nextInt();
		int x[] = new int[num];
		
		Random rand =  new Random();
		
		System.out.print("배열 x : ");
		for(int i = 0; i<x.length;i++) {
			x[i] = rand.nextInt(9)+1;
			System.out.print("\t"+x[i]);
		}
		System.out.println("\n배열 x의 총합은 : "+sumOf(x));

	}

}
