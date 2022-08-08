package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double input1 = sc.nextInt();
		//double -> sc.nextDouble();
		
		System.out.print("영어 : ");
		double input2 = sc.nextInt();
		
		System.out.print("수학 : ");
		double input3 = sc.nextInt();
		
		//합계를 저장하기 위한 변수 
		//int sum = input1 + input2 + input3
		
		//평균을 저장하기 위한 변수
		//double avg = sum/ 3.0;
		
		//system.out.Println("합계 : " + sum)
		//system.out.Println("평균 : " + avg)
		
		
		System.out.println("합계 : " + (input1 + input2 + input3));
		System.out.println("평균 : " + (input1 + input2 + input3)/3.0);
		
		String result = ((input1 >=40) && (input2 >=40) && (input3 >=40) && (input1 + input2 + input3) / 3 >= 60) ? "합격" : "불합격";
		System.out.println(result);


	}
	
}

