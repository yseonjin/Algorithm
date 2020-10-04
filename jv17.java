package algori_03;
import java.util.Random;
import java.util.Scanner;
public class jv17 {
	 
	static int seqIdx(int a[], int n, int key){
		
		int i = 0;
		a[n] = key;
		while(true) {
			if(a[i]==key) {
				break;
			}
			i++;
		}
		return i == n? -1:i;		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요솟수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num+1];
		
		Random rand = new Random();
		
		for(int i = 0; i < num;i++) {
			x[i] = rand.nextInt(9);
			System.out.println("x["+i+"] :"+x[i]);
		}	
		System.out.println("검색할 값 : ");
		int key = sc.nextInt();
		
		int idx = seqIdx(x,num,key);
		
		if(idx == -1) {
			System.out.println("검색실패");
		}else {
			System.out.println("key값은 "+(idx+1) +"번째 칸에 위치합니다.");
		}
	}
}
