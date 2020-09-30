package algori_02;

import java.util.Scanner;

public class jv14 {
	
	static void swap(int[]a,int idx1,int idx2) {
		int t = a[idx1]; a[idx1]=a[idx2];a[idx2]=t;
	}
	static void reverse(int a[]) {
		for(int i =0; i< a.length/2;i++) {
			System.out.println("\n["+i+"] 와 ["+(a.length-i-1)+"] 의 값을 교환합니다.");
			swap(a,i,a.length-i-1);
			for(int j=0; j<a.length;j++) {
				System.out.print(a[j]);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("욧소수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i <x.length;i++) {
			System.out.print("["+i+"] : ");
			x[i]=sc.nextInt();
		}		
		reverse(x);		
		System.out.println("\n역순정렬을 마쳤습니다.");	
	}
}
