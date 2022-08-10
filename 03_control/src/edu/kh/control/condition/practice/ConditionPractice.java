package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input <=0) {
			System.out.println("양수만 입력해주세요.");
		}
		else if(input>0 && input%2 ==0)
		{System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		}
	

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int mat = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor+mat+eng;
		double avg = sum / 3.0;
				
		if(kor <40 | mat <40 | eng <40 | avg<180) {
			System.out.print("불합격입니다.");
		} else {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + mat);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		}
		
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int input = sc.nextInt();
		
		String result;
		
		/*if(input<1 | input>12) {
			System.out.println(input + "월은 잘못 입력된 달입니다.");
		} else { */
			switch(input) {
			case 1 : case 3 : case 5: case 7: case 8 : case 10 : case 12 : result = 
					input + "월은 31일까지 있습니다."; break;
			case 2 : result = input + "월은 28일까지 있습니다."; break;		
			case 4 : case 6 : case 9 : case 11 : result = input + "월은 30일까지 있습니다."; break;	
			default : result = input + "월은 잘못 입력된 달입니다.";
					}	System.out.println(result);
		}
		
		
		
	
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해주세요 : ");
		double input1 = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double input2 = sc.nextDouble();
		
		double bmi = input2 / (input1 * input1);
		System.out.println("BMI 지수 : " + bmi);
		
		
		if(bmi<18.5) {
			System.out.println("저체중");
		} else if (bmi<23) {
			System.out.println("정상체중");
		} else if (bmi<25) {
			System.out.println("과체중");
		} else if (bmi<30) {
			System.out.println("비만");
		} else {
			System.out.println("고도 비만");
		}
		
		
		
	}
	
	public void practice5() {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int input1 = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int input2 = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int input3 = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		int input4 = sc.nextInt();
		
		//input = input * 0.2 => input *= 0.2;
		
		
		double sum = (input1 * 0.2) + (input2 * 0.3) + (input3 * 0.3) + (input4);
		
				System.out.println("======= 결과 ======");

		
		if(input4 < 14) {
			System.out.println("Fail [출석 횟수 부족 (" + input4 + "/20)]");
		}	 else  {
			
		System.out.println("중간 고사 점수(20) : " + (input1 * 0.2));
		System.out.println("기말 고사 점수(30) : " + (input2 * 0.3));
		System.out.println("과제 점수(30) : " + (input3 * 0.3));
		System.out.println("출석 점수(20) : " + (input4) * 1.0);
		System.out.println("총점 : " + sum);
		
		//System.out,printf("중간고사점수(20) : %.1f \n", input1);
		//System.out,printf("기말고사점수(30) : %.1f \n", input2);
		//System.out,printf("과제점수(30) : %.1f \n", input3);
		//System.out,printf("출석점수(20) : %.1f \n", input4);
		
		//System.out.printf("총점 : %.1f \n", sum);
		
		if (sum<70) {
		System.out.println("Fail [점수 미달]");
	
		} else {
			
		System.out.println("PASS");}
		}

	}
	
	
	
}

