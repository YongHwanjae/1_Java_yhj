package employee.vo;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EmployeeView {
	
	private Scanner sc = new Scanner(System.in);
	EmployeeService service = new EmployeeService();
	
	
	public void displayMenu() {
		
		int input =0;
		do { 
			System.out.println("1. 새로운 사원 정보 추가");
			System.out.println("2. 전체 사원 정보 조회");
			System.out.println("3. 사번이 일치하는 사원 정보 조회");
			System.out.println("4. 사번이 일치하는 사원 정보 수정");
			System.out.println("5. 사번이 일치하는 사원 정보 삭제");
			System.out.println("6. 입력 받은 부서와 일치 모든 사원 정보 조회");
			System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
			System.out.println("8. 부서별 급여 합 전체 조회");
			System.out.println("0. 프로그램 종료");
			
			try {
			System.out.print("메뉴 선택 : ");
			input = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(input) {
			case 1: addEmployee(); break;
			case 2: selectAll(); break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break;
			case 7: break;
			case 8: break;
			case 0: System.out.println("프로그램 종료"); break;
			default : System.out.println("잘못 입력하셨습니다.");
			
			}
			
			
			}
			catch(InputMismatchException e) {
				
			}
			
		}while(input !=0);
			
		
	}
	
	public void addEmployee() {
		System.out.println("[새로운 사원 정보 추가]");
		System.out.print("사원 번호 : ");
		int empId = sc.nextInt();
		
		System.out.print("사원 이름 : ");
		String empName = sc.next();
		
		System.out.print("주민등록번호 : ");
		String empNo = sc.nextLine();
		sc.nextLine();
		
		System.out.print("이메일 : ");
		String email = sc.nextLine();

		System.out.print("전화번호 : ");
		String phone = sc.nextLine();

		System.out.print("부서명 : ");
		String departmentTitle = sc.nextLine();
		
		System.out.print("직급명 : ");
		String jobName = sc.next();
		
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		
		if(service.addEmployee(empId, empName, empNo, email, phone, departmentTitle, jobName, salary)){
			System.out.println("[추가 완료]");}
			else {
				System.out.println("실패");}
			}
	
	
	
	public void selectAll() {
		List<Employee> eplList = service.getEplList();
		for(int i=0; i<eplList.size(); i++) {
			System.out.println(eplList.get(i).toString());
		}
	}
	
	
		
	
}
		
	

