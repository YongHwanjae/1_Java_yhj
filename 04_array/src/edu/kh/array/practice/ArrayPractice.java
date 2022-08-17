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
		}
					
		
		
	}
	public void practice2() {
		
	int arr[] = new int[9];
	
	for(int i = arr.length-1; i>=0; i--)
	{arr[i] = i+1;
	System.out.print(arr[i] +  " ");
	}
	
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
		
		System.out.print("입력 0 : ");
		int input0 = sc.nextInt();
		
		System.out.print("입력 1 : ");
		int input1 = sc.nextInt();
		
		System.out.print("입력 2 : ");
		int input2 = sc.nextInt();
		
		System.out.print("입력 3 : ");
		int input3 = sc.nextInt();
		
		System.out.print("입력 4 : ");
		int input4 = sc.nextInt();
		
		int arr[] = {input0, input1, input2, input3, input4};
		
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();
		
	
			}
		
		
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.next();
		
		System.out.print("문자 : ");
		String input2 = sc.next();
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
	



