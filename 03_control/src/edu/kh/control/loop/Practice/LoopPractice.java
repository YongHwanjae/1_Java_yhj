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
			sum+=i;
			if (i==num) {
				System.out.print(i + " = " +sum);
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
			
			if(num1<1 || num2<1) { 
				System.out.print("1이상의 숫자를 입력해주세요.");
			}
			else { //둘다 1 미만 아님
				
				if(num1>num2) {
					
					//두 변수의 값 교환
					int temp = num1; //temp: 8 / num1 : 8/ num2 : 4
					num1 = num2;    // temp : 8 / nu1 : 4 / num2  4
					num2= temp;   //  n2 =8 n1 4 te =8
//				int start = num1;
//				int end = num2;
				
//				if(num1>num2) {
//					start = num2;
//					end = num1;
				}
				for(int i = num1; i<=num2; i++) {
					System.out.print(i + " ");
				}
			}
//			else if(num1>=num2) {for(int i = num2; i<=num1 ; i++) {
//				System.out.print(i + " ");}}
//				
//				 else {
//					for(int i = num1; i<=num2 ; i++) {
//					System.out.print(i + " ");
//				} 
//			}
			
			
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
		for(int y = num; y<=9 ; y++) {
			
		
		System.out.println("======= " + y + "단==========");
		for(int x= 1; x<=9 ; x++ ) {
			System.out.printf("%d * %d =  %2d\n", y, x, y*x);
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
		
		for(int row = num; row>=1; row--) {
			for (int col = 1; col<=row; col++) {
			System.out.print("*");} System.out.println();
			}System.out.println();
		}
	
	
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
	//for문 이용	
//		for(int row = 1 ; row<= input; row++) {
//			for(int i = input-1 ; i>=row; i--)
			//input - row : 초기식 바꾸기
//				i>= row : 조건식 바꾸기
//				여기서는 결과 같음
				
//				System.out.print(" ");
		
		
//			for(int col = 1; col<=row; col++) {
//				System.out.print("*");
		
	
	// if문 이용 풀이
		for(int row = 1 ; row<= input; row++) {
		for(int col = 1; col<=input; col++) {
			
			if (col<=input - row) {
				System.out.print(" ");
			} else {
		System.out.print("*");
			}
		}System.out.println();
	
	
	}
		}
		
		
		
		
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row<=input; row++) {
			for (int col = 1; col<=row; col++) {
			System.out.print("*");} System.out.println();
		}
		
		for(int row = input-1; row>=1; row--) {
			for (int col = 1; col<=row; col++) {
			System.out.print("*");} System.out.println();
		}
		
		
		
		
		
		
		
		
	}
	public void practice11() {
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
//	for문 이용	
		for(int row = 1 ; row<= input; row++) {
			for(int i = input-1 ; i>=row; i--)
//			input - row : 초기식 바꾸기
//				i>= row : 조건식 바꾸기
//				여기서는 결과 같음
//				
				System.out.print(" ");
//		
//		
		for(int col = 1; col<=2*row-1; col++) {
				System.out.print("*");}System.out.println();}
//		
	
	/* if문 이용 풀이
		for(int row = 1 ; row<= input; row++) {
		for(int col = 1; col<=input*2-1; col++) {
			
			if (col<=input - row) {
				System.out.print(" ");
			} else {
		System.out.print("*");
			}
		}System.out.println();
		}*/
		
	}
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row<=input; row++) {
			for(int col =1; col<=input; col++) {
				
				//첫번째 / 마지막 줄, 칸일 때만 *출력
				
				if (row==1 || row == input || col==1 || col == input) {
				System.out.print("*");}
			else {System.out.print(" ");
			} }System.out.println();}}
		
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int count = 0;
		for(int i = 1; i<=num ; i++) {
		 if(i%2==0 || i%3==0) {System.out.print(i + " ");}
			
		 //2와 3의 공배수 == 6의 배수
		 if(i%2==0 && i%3==0 ) {
			 count++;//count 증가 
		 }
		}System.out.println("\ncount : " + count);
		}
}

