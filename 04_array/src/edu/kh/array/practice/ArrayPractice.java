package edu.kh.array.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		
		
		
		int arr[] = new int[9];
		
		int sum =0;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
			
			System.out.print(arr[i] + " ");
			
			if(i%2==0) {sum += arr[i];
			} 
		}System.out.println("\n짝수 번째 인덱스 합 : " + sum);
					
		
		
	}
	public void practice2() {
		
	int arr[] = new int[9];
	
	int sum = 0;
	
	for(int i = arr.length-1; i>=0; i--)
	{arr[i] = i+1;
	System.out.print(arr[i] +  " ");
	if(i%2==1) { sum += arr[i];}
	} System.out.println("\n홀수 번째 인덱스 합 : " + sum);
	
	}
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int arr[] = new int[input];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
	
	public void practice4() {
	
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i= 0; i<arr.length; i++)
		{System.out.print("입력 " + i + " : ");
		arr[i] = sc.nextInt();}
		
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();	
			
		boolean flag = false; //일치
				
		
		
		for(int i = 0; i<arr.length; i++) {
			if (arr[i] == search) {System.out.println("인덱스 : " + i);
			flag = true; break;}
			
			if(flag){System.out.println("일치하는 값이 존재하지 않습니다.");}
		}
	
			}
		
		
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.next();
		
		System.out.print("문자 : ");
		String input2 = sc.next();
		
		String str = input;
	    
		
		System.out.print(input + "에 " + input2+ "가 존재하는 위치(인덱스) : " );
		System.out.print("\n" + input2 + " 개수 : ");
	}

	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		int sum = 0;
		
		for(int i = 0; i<input; i++) {
			System.out.print("배열" + i+ "번째 인덱스에 넣을 값 : ");
			int x = sc.nextInt();
		arr[i] = x; sum+=x;} 
		System.out.print(Arrays.toString(arr));
		System.out.println("\n총 합 : " + sum);
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		if(input<3 || input%2==0) {
			System.out.println("다시 입력하세요");}
		else { 
			int[] arr = new int[2*input-1];
			
		}
		
		
	}
	
	public void practice9() {
		
		int[] arr = new int[10];
		
		
		
		for(int i = 0; i<arr.length; i++) {
			int ran = (int)(Math.random()*10 + 1);
			arr[i] = ran;}
			System.out.print("발생한 난수 : " + Arrays.toString(arr));
		
		
	}
	
	
	public void practice10() {
		
		
		
		int[] arr = new int[10];
	
		
		for(int i = 0; i<arr.length; i++) {
			int ran = (int)(Math.random()*10 + 1);
			arr[i] = ran;}
	System.out.print("발생한 난수 : " + Arrays.toString(arr));
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]>max) {max = arr[i];}
			if(arr[i]<min) {min = arr[i];}
			
	
		} System.out.print("\n최대값 : " + max);
		  System.out.print("\n최소값 : " + min);
	}
	
	public void practice11() {
		
		int[] arr= new int[10];
		
		int ran = (int)(Math.random()*10+1);
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = ran;}
		
		
		}
	
	
	public void practice12 () {
		
		int[] arr = new int[6];
		
		int ran = (int)(Math.random()*45+1);
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = ran;
		
	} 
	
	}
	public void practice13() {
			
	}
}
	



