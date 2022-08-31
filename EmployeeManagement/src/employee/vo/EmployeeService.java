package employee.vo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

	private List<Employee> eplList = new ArrayList<Employee>();
	
	public EmployeeService() {
	}
	public boolean addEmployee(int empId, String empName, String empNo, String email, String phone, String departmentTitle,
			                   String jobName, int salary) {
		
		Employee epl= new Employee(empId, empName, empNo, email, phone, departmentTitle, jobName, salary);
		return eplList.add(epl);
	}
	
	public List<Employee> getEplList(){
		return eplList;
		
	}
	
	
	
}
