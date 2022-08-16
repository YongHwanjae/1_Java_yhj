package edu.kh.oop.basic;

public class BasicRun {
	
	public static void main(String[] args) {
	
		YHJ 용환재 = new YHJ();
		// heap 영역에 YHJ 클래스에 정의된 내용을 이용하여 
		// YHJ 객체 생성(할당)
		
		// 객체가 가지고 있는 속성 출력
		System.out.println("이름 : " + 용환재.name);
		System.out.println("나이 : " + 용환재.age);
		System.out.println("생년월일 : " + 용환재.birthday);
		
		//System.out.println("비밀번호 : " + 용환재.password);
		//The field YHJ.password is not visible
		
		//비밀번호를 볼 수 있는 기능을 호출 = > 간접 접근방법
		용환재.showPassword();
		
		// 기능 수행
		용환재.eat();
		용환재.study();
		용환재.plus(50, 100);
		
		
	
		
		
	}
}
