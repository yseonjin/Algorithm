package algori_03;
import java.util.Scanner;
import java.util.Arrays;
public class jv19 {
	
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
	    
	    int idx = Arrays.binarySearch(a,key);   //Java 표준 라이브러리 이용하
	    
	    if(idx < 0 ) {
	    	System.out.println("검색실패");
	    }else {
	    	System.out.println("idx는 : "+idx+"입니다.");
	    }	
	}
}
