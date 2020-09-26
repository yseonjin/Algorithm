# Algorithm
For Practice Algorithm
<h>
 <br><br>
  알고리즘 입문 연습하기. 기초부터 차근차근 다지기위한 연습공간입니다.(with.Java)
  <br><br>
  ~~~java
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

  
  ~~~
  <br><br>
  
  
    ~~~java
  package algori_01;

public class jv02 {
	
	static int min4 (int a, int b, int c, int d) {
		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		if (d < min) {
			min = d;
		}
		return min;
	}
	public static void main(String[] args) {
		System.out.println("최솟값 : "+ min4(2,3,6,8));
		System.out.println("최솟값 : "+ min4(3,1,9,10));
	}
	
}

  ~~~
  <br><br>
  
    ~~~java
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

  ~~~
  <br><br>
  
    ~~~java
  package algori_01;

import java.util.Scanner;

public class jv04 {

	public static void main(String[] args) {
		System.out.println("어디까지 합을 구할까요? : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;int i= 1;
		
		while(i<=n) {
			sum += i;
			i++;
		}
		System.out.println("1부터 n까지의 합:"+sum);
	}

}

  ~~~
  <br><br>
  
    ~~~java
  package algori_01;

public class jv05 {

	public static void main(String[] args) {
		int gugu;
		for(int x =1; x<=9; x++) {
			for(int y =2; y<=9; y++) {
				gugu = y*x;
				System.out.printf("%2d * %2d = %2d ||", y,x,gugu);
			}
			System.out.println("");
		}

	}

}

  ~~~
  <br><br>
  
    ~~~java
  package algori_01;

public class jv06 {

	public static void main(String[] args) {
		int gugu; int x=1; int y=2;
		while(x<=9) {
			while(y<=9) {
				gugu = y*x;
				System.out.printf("%2d * %2d = %2d ||", y,x,gugu);	
				y++;
			}
			y=2;
			x++;
			System.out.println("");
		}

	}

}
  ~~~
  <br><br>
  
    ~~~java
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

  ~~~
  <br><br>
  
