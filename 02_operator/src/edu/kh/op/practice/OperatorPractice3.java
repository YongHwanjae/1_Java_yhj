package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String result = (input > 0) ? "양수 입니다." : (input < 0) ? "음수입니다." : "0입니다.";
	    System.out.print(result);

	// 양수 / 음수  / 0
	    // String result = (input == 0) ? "0 " : (input > 0 ? "양수" : "음수");
	    // System.out.println(result + "입니다");
	
	}

}
