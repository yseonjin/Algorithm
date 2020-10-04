package algori_03;
import java.util.Random;
import java.util.Scanner;
public class jv16 {
	 
	static int seqSearch(int a[], int n, int key){
		
		for(int i=0;i<n;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요솟수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		Random rand = new Random();
		
		for(int i = 0; i < x.length;i++) {
			x[i] = rand.nextInt(9);
			System.out.println("x["+i+"] :"+x[i]);
		}	
		System.out.println("검색할 값 : ");
		int key = sc.nextInt();
		
		int idx = seqSearch(x,num,key);
		
		if(idx == -1) {
			System.out.println("검색실패");
		}else {
			System.out.println("key값은 "+(idx+1) +"번째 칸에 위치합니다.");
		}
	}
}
