package edu.kh.array.practice;

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
			
		boolean flag = true; // 일치하는 값이 존재할때는 출력했는데 일치하는 값이 존재하지 않을때 출력을 못했음..
				
		for(int i = 0; i<arr.length; i++) {
			if (arr[i] == search) {System.out.println("인덱스 : " + i);
			flag = false; break;}
		}	
			if(flag){System.out.println("일치하는 값이 존재하지 않습니다.");}
		
	
			}
		
		
	
	public void practice5() { /* 인덱스를 출력을 못함
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.next();
		
		System.out.print("문자 : ");
		String input2 = sc.next();
		
		char [] arr = new char[input.length()];
		
		int count = 0;
		
	    for(int i = 0; i<input.length(); i++) {
	    	arr[i] = input.charAt(i); 
		   if(arr[i] == input2.charAt(0)) {
			   count++; 	
		   }
	    }
		
		System.out.print(input + "에 " + input2+ "가 존재하는 위치(인덱스) : " );
		System.out.print("\n" + input2 + " 개수 : " + count);
	*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();

		char[] arr = new char[str.length()];

		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0; 	

		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ch) { 
				System.out.print(i + " ");
				count++;	
			}
		}

		System.out.println();	// 줄바꿈

		System.out.println(ch + "개수 : " + count);
		
		
	}

	public void practice6() {//*
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
        for (int i = 0; i < arr.length; i++) {
            System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
            arr[i] = sc.nextInt();
        }


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }

        System.out.println();
        System.out.println("총 합 : " + sum);
		/*
		for(int i = 0; i<input; i++) {
			System.out.print("배열" + i+ "번째 인덱스에 넣을 값 : ");
			int x = sc.nextInt();	
		arr[i] = x;
		System.out.print(arr[i]);
		sum+=x;} 
		System.out.println("\n총 합 : " + sum);
		
		int[] arr = new int[input];
		for(int i= 0; i< arr.length; i++) {
			System.out.print("배열" + i + "번째 인덱스에 넣을 값");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i= 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum +=arr[i];
			System.out.println();
			System.out.println("총 합 : " + sum);
		}*/
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		for(int i = 0; i<input.length(); i++) {
			            // = arr.length();
			arr[i] = input.charAt(i);
		
		/*for(int i = 0; i<8; i++) {
		System.out.print(arr[i]);
		} for(int i =8; i<14; i++) {
			arr[i] = '*';*/
		if(i<=7) {
			arr[i] = input.charAt(i);}
		else { arr[i] = '*';}
			System.out.print(arr[i]);}
		
	}	
		
	
	
	public void practice8() {//*
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		if(input<3 || input%2==0) {
			System.out.println("다시 입력하세요");}
		else { 
//			int[] arr = new int[2*input-1];
			int[] arr = new int[input];
			
			for(int i = 1; i<=input/2+1; i++) {
				arr[i] = i; 
				System.out.print(arr[i] + ", ");}
				for(int i= input/2; i>=1; i--) {
					if(i==1) {System.out.print(arr[i]);}
					else {
					arr[i]=i;
					System.out.print(arr[i] + ", ");}
					
				}
			}
		
		
		
	}
	
	public void practice9() {
		
		int[] arr = new int[10];
		
		
		System.out.print("발생한 난수 : ");
		for(int i = 0; i<arr.length; i++) {
			int ran = (int)(Math.random()*10 + 1);
			arr[i] = ran;
			System.out.print(arr[i] + " ");}
			 
		
		
	}
	
	
	public void practice10() {
		
		
		
		int[] arr = new int[10];
	
		System.out.print("발생한 난수 : ");
		for(int i = 0; i<arr.length; i++) {
			int ran = (int)(Math.random()*10 + 1);
			arr[i] = ran;
			System.out.print(arr[i] + " ");}
	 
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]>max) {max = arr[i];}
			if(arr[i]<min) {min = arr[i];}
			
	
		} System.out.print("\n최대값 : " + max);
		  System.out.print("\n최소값 : " + min);
	}
	
	public void practice11() { // ＊
		
		int[] arr= new int[10];
		
		
		
		for(int i = 0; i<arr.length; i++) {
			int ran = (int)(Math.random()*10+1);
			arr[i] = ran;
		for(int x = 0; x<i; x++) {
			if(arr[x] ==ran) {
				i--; break;
			}
			}
	System.out.print(arr[i] + " ");} 
		
		}
	
	
	public void practice12 () { // ＊
		
		int[] arr = new int[6];
		
		for(int i = 0; i<arr.length; i++) {
			int ran = (int)(Math.random()*45+1);
			arr[i] = ran; 
			for(int x= 0; x<i; x++) {
				if(arr[x] == ran) {
				i--; break; 
			}
		}	
			
	System.out.print(arr[i] + " ");
	}
		}
	 
	
	
	public void practice13() { //＊
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		for(int i= 0; i<arr.length; i++) {
			arr[i] = input.charAt(i);
			for(int x =0; x<i; x++) {
				if(arr[x] == input.charAt(i)) {
					i--; break;
				}
			}
		} System.out.println("문자열에 있는 문자 : " );
	}
	
	
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int input = sc.nextInt();
		
		for(int i= 0; i<input; i++) {
		System.out.print((i+1) +"번째 문자열 : ");
		String input2 = sc.nextLine();
	} 	System.out.print("\n 더 값을 입력하시겠습니까?(Y/N) : ");
	
	}
	
	
	public void practice15() {
		int[][] arr = new int[3][3];
		
		for(int row = 0; row<arr.length-1; row++) {
			for(int col = 0; col<arr[row].length-1; col++) {
			System.out.print("(" + row + ", " + col + ")");
			
				
			}
		}
	
	}

	public void practice16() {
		int[][] arr = new int[4][4];
		int i = 1;
		for(int row = 0; row< arr.length-1; row++) {
			for(int col = 0; col<arr[row].length-1; col++) {
				arr[row][col] = i;
				i++;
				System.out.print(i);
				System.out.println();}
				}
			}		
	public void practice17() {
		
	}
	
	public void practice18() {
		int[][] arr= new int [4][4];
		
				
		
	}
}
	



