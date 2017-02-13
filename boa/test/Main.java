package boa.test;

import java.util.Scanner;

public class Main {
	
	public static int compute(int x) {
		if(x>100) {
			return x-10;
		}	
		else {
			return compute(compute(x+11));		
		}
	}	

	public static void main(String[] args) {		
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			x=90;
			for(int i=0;i<2;i++) {
				System.out.println(compute(x));	
			}
	}
	
	public static void maincopy(String[] a) {		
			Scanner sc=new Scanner(System.in);
			int y=90;
			int j=0;
			while(j<2) {
				System.out.println(compute(y));
				j++;				
			}
	}

	public static void dead(String[] a) {		
			Scanner sc=new Scanner(System.in);
			int y=90;
			int b=1;
			int j=0;
			while(j<2) {
				System.out.println(compute(y));
				j++;				
			}
	}

	public static void dead2(String[] a) {		
			Scanner sc=new Scanner(System.in);
			int y=90;
			int b=1;
			int j=0;
			b=b+2;
			while(j<2) {
				System.out.println(compute(y));
				j++;				
			}
	}

	public static void domtest(String[] a) {		
			int y=90;
			if(y==90) {
				y++;
			}
			else {
				y--;
			}
	}

	public static void alias(String[] a) {		
			Scanner sc=new Scanner(System.in);
			int y=90;
			int y1 = y;
			int b=1;
			int j=0;
			b=b+2;
			int y2 = y;
			y1 = b + 7;
			while(j<2) {
				b = y1;
				System.out.println(compute(y));
				j++;				
			}	}
}
