package edu.kh.oop.method.model.service;

import edu.kh.oop.method.model.vo.User;

public class UserService {
	
	// 회원 가입 서비스 메서드
	
	// 반환형이 클래스명 
	// =반환되는 값이 해당 클래스를 이용해서 만들어진 객체의 주소 값
	public User sighUP(String userId, String userPw, String userNAme,
			           int userAge, char usergender) {
		
		// 기본 생성자를 이용해서 User 객체를 생성
		User u = new User();
	
		// setter를 이용해서 매개변수로 전달 받은 값을 생성
		u.setUserId(userId);
		u.setUserPw(userPw);
		u.setUserName(userNAme);
		u.setUserAge(userAge);
		u.setUserGender(usergender);
	
		return u; // User 객체의 시작 주소를 반환
	}

	
	
	// 로그인 Service
	public int login(String id, String pw, User user) {
				// 입력된 id/pw + 가입한 회원 정보를 가지고 있는 객체의 주소
		
		// 회원가입을 안하고 로그인을 시도하는 경우
		if(user == null) {
			return -1;
		} else { //회원가입한 후
		 //id /pw 비교
	if(user.getUserId().equals(id)&&user.getUserPw().equals(pw)) {
		// id, pw 같음 == 로그인 성공
		return 1;
	} else { return 0;
		// 하나라도 다름 == 로그인 실패
	}
		}
	}
	
	 // 회원 정보 수정 Service
	
	public void updateUser(String name, int age, char gender, User loginUser) {
		
		loginUser.setUserName(name);
		loginUser.setUserAge(age);
		loginUser.setUserGender(gender);
		
		
	}
	
	
	
}
