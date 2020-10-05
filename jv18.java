package algori_03;
import java.util.Scanner;
public class jv18 {
	static int binSearch(int a[], int n, int key) {
		int p1 = 0;
		int pr = n-1;		
		while(p1 <= pr) {
			int pc = (p1+pr)/2;
			
			if(a[pc]==key) {
				return pc;
			}else if (a[pc] < key) {
				p1 = pc+1;
			}else {
				pr = pc-1;
			}
		}
		return -1;		
	}
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("요솟수를 입력하세요 : ");
		int num = sc.nextInt();
		int a[] =  new int[num];
		
		for(int i=0 ; i < num; i++) {
			System.out.println("값을 오름차순으로 입력하세요 : ");
			int val = sc.nextInt();
			a[i] = val;
		}
		for(int i = 0; i <a.length;i++) {
			System.out.println("a["+i+"] : "+a[i]);
		}
		
		System.out.println("key값을 입력하세요 : ");
	    int key =  sc.nextInt();
	    
	    int idx = binSearch(a, num, key);
	    
	    if(idx == -1) {
	    	System.out.println("검색실패");
	    }else {
	    	System.out.println("idx는 : "+idx+"입니다.");
	    }	
	}
}
