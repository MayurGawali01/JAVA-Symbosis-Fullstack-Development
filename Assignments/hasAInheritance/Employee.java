package hasAInheritance;

public class Employee {

	int empId;
	String empName;
	public int getEmpId() {
		return empId;
	}
	
	private Department d1 = new Department(); 
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setdeptId(int deptId) {
		d1.setDeptId(deptId);
	}
	
	public void setdeptName(String empName) {
		d1.setDeptName(empName);
	}

	@Override
	public String toString() {
		return "Employee [empId: " + empId + ", empName: " + empName + ", " + d1 + "]";
	}
	
}
