package EcxelSheet;

import java.util.Scanner;

public class DemoFactorial {
	
	public static void factorial() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int x = sc.nextInt();
		
		int result = 1;
		
		for(int i = x; i>0;i--) {
			
			result = result * i;
			
		}
		
		System.out.println(result);
		
	}
	
	/*
	 * a b c
	 *   a b c
	 * 
	 */
	
	public static void fabonancySeries() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number");
		int a = sc.nextInt();
		System.out.println("Please enter Second number");
		int b = sc.nextInt();
		
		int c = 0;
		
		for (int i = 0; i<10;i++) {
			
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}
		
	}

	public static void main(String[] args) {
			
			factorial();
			fabonancySeries();
		
	}

}
