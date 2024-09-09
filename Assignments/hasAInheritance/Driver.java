package hasAInheritance;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		
		Employee p1 = new Employee();
		
		System.out.println("Enter Employee Id");
		int empId = sc.nextInt();
		p1.setEmpId(empId);
		
		System.out.println("Enter Employee Name");
		String empName = sc.next();
		p1.setEmpName(empName);
		
		System.out.println("Enter Dept Id");
		int deptId = sc.nextInt();
		p1.setdeptId(deptId);
		
		System.out.println("Enter Dept Name");
		String deptName = sc.next();
		p1.setdeptName(deptName);
		

		System.out.println(p1);
					
	}

}
