package algori_01;

import java.util.Scanner;

public class jv01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
	    System.out.print("a의 값을 입력하시오 : ");
	    int a = sc.nextInt();
	    System.out.print("b의 값을 입력하시오 : ");
	    int b = sc.nextInt();
	    System.out.print("c의 값을 입력하시오 : ");
	    int c = sc.nextInt();
	    
	    int max = a;
	    
	    if ( b > max) {
	    	max = b;
	    }
	    if(c > max) {
	    	max = c;
	    }
	    
	    System.out.println("최댓값은 "+max+" 입니다.");
		}

}
