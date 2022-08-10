package edu.kh.control.loop.Practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<1) { System.out.println("1 이상의 숫자를 입력하세요.");
		
		} else {
		for(int i = 1 ; i<=num ; i++) {
			System.out.print(i + " ");
		}
		}
	}
	
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<1) { System.out.println("1 이상의 숫자를 입력하세요.");
		} else {
			for(int i = num; i>=1 ; i--) {
				System.out.print(i + " ");
			}
		}
		}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		
		for(int i = 1 ; i<=num ; i++) {
			if (i==num) {
				System.out.print(i + " = ");
			}
			else { System.out.print(i+ " + ");
		}   
		 
		};
		
		
	}
	public void practice4() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if(num1==0 | num2== 0) { 
				System.out.print("1이상의 숫자를 입력해주세요.");
			}
			else if(num1>=num2) {for(int i = num2; num2<=num1 ; num2++) {
				System.out.print(num2 + " ");}}
				
				 else {
					for(int i = num1; num1<=num2 ; num1++) {
					System.out.print(num1 + " ");
				} 
			}
			
			
			 }
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("======= " + num + "단==========");
		for(int x= 1; x<=9 ; x++ ) {
			System.out.printf("%d * %d =  %d\n", num, x, num*x);
		}
		
		
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num<2 || num>9) {
			System.out.println("2~9 사이 숫자만 입력하세요.");
		} else {
		for(int y = num; num<=9 ; num++) {
			
		
		System.out.println("======= " + num + "단==========");
		for(int x= 1; x<=9 ; x++ ) {
			System.out.printf("%d * %d =  %d\n", num, x, num*x);
		}}}
		
		
		
		
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int row = 1; row<=num; row++) {
	
		for(int col = 1; col<=row; col++) {
			 System.out.print("*");}
		System.out.println();}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int row = 1; row<=num; row++) {
	
		for(int col = num; col>=row; col--) {
			 System.out.print("*");}
		System.out.println();}
	}
	
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int row = 1; row<=num; row++) {
	
		for(int col = 1; col<=row; col++) {
		System.out.printf("%s","*" );}
		System.out.println();}
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		
	}
	public void practice11() {}
	public void practice12() {}
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int count = 0;
		for(int i = 1; i<=num ; i++) {
		 if(i%2==0) {System.out.print(i + " ");}
			else if(i%3==0) {System.out.print(i + " "); }
	
		}
		}
}

