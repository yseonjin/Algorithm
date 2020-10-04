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
  
~~~java
package algori_02;

public class jv08 {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		
		a[1] = 30;
		a[2] = 51;
		a[4] = a[1]*2;
		
		for (int i =0; i <a.length;i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}

	}

}

~~~
<br><br>

~~~java
package algori_02;

public class jv09 {

	public static void main(String[] args) {
 
		int[] a = {1,2,3,4,5,6};
		int[] b = a.clone();
		
		b[3] = 0;
		
		System.out.print("a= ");
		for(int i =0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		
		System.out.print("\nb= ");
		for(int i =0;i<b.length;i++) {
			System.out.print(" "+b[i]);
		}
	}

}

~~~
<br><br>

~~~java
package algori_02;
import java.util.Scanner;
//1. 키가 가장 큰 사람의 키를 구하는 프로그램을 만들어보기 (MAX)
public class jv10 {
		static int maxOf(int[]a) {
			int max = a[0];
			for(int i =0; i<a.length;i++) {
				if (a[i]> max){
					max = a[i];
				}
			}
			return max;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하시오 : ");
		
		int num = sc.nextInt();
		int height[] = new int[num];
		
	    for(int j = 0 ;j<height.length;j++) {
	    	Scanner hg = new Scanner(System.in);
	    	System.out.print(j+1+"번째 학생의 키를 입력하시오 : ");
	    	int stHeight = hg.nextInt();
	    	height[j] = stHeight;
	    }
		for(int x =0 ; x<height.length;x++) {
			System.out.println(x+1+"번째 학생의 키는 : "+height[x]+"입니다.");
		}
		System.out.println("가장 큰 키는 "+maxOf(height)+"입니다.");
	}
}

~~~
<br><br>

~~~java
 package algori_02;
import java.util.Scanner;
//2. 키가 가장 작은 사람의 키를 구하는 프로그램을 만들어보기 (MIN)
public class jv11 {
		static int minOf(int[]a) {
			int min = a[0];
			for(int i =0; i<a.length;i++) {
				if (a[i] < min){
					min = a[i];
				}
			}
			return min;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하시오 : ");
		
		int num = sc.nextInt();
		int height[] = new int[num];
		
	    for(int j = 0 ;j<height.length;j++) {
	    	Scanner hg = new Scanner(System.in);
	    	System.out.print(j+1+"번째 학생의 키를 입력하시오 : ");
	    	int stHeight = hg.nextInt();
	    	height[j] = stHeight;
	    }
		for(int x =0 ; x<height.length;x++) {
			System.out.println(x+1+"번째 학생의 키는 : "+height[x]+"입니다.");
		}
		System.out.println("가장 작은 키는 "+minOf(height)+"입니다.");
	}
}

~~~
<br><br>

~~~java
 package algori_02;
import java.util.Random;
import java.util.Scanner;
//난수를 사용해 배열의 요솟값 설정하기
public class jv12 {
		static int minOf(int[]a) {
			int min = a[0];
			for(int i =0; i<a.length;i++) {
				if (a[i] < min){
					min = a[i];
				}
			}
			return min;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하시오 : ");
		int num = sc.nextInt();
		int height[] = new int[num];
		
		Random rand = new Random();
		
	    for(int j = 0 ;j<height.length;j++) {
	    	
	    	int stHeight = rand.nextInt(90);
	    	height[j] = stHeight+100;
	    }
		for(int x =0 ; x<height.length;x++) {
			System.out.println(x+1+"번째 학생의 키는 : "+height[x]+"입니다.");
		}
		System.out.println("가장 작은 키는 "+minOf(height)+"입니다.");
	}
}


~~~
<br><br>


~~~java
 package algori_02;
import java.util.Scanner;
public class jv13 {	
		static void swap(int[] a, int idx1, int idx2) {
			int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
		}
		static void reverse(int[] a) {
			for(int i =0; i < a.length/2;i++) {
				swap(a,i,a.length-i-1);
			}
		}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i <x.length;i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i=0; i <x.length;i++) {
			System.out.println("x["+i+"] : "+x[i]);
		}
	}
}


~~~
<br><br>


~~~java
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
		System.out.print("수를 입력하세요 : ");
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

~~~
<br><br>


~~~java
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


~~~
<br><br>
  
~~~java
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


~~~
<br><br>
  

~~~java
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


~~~
<br><br>
  
