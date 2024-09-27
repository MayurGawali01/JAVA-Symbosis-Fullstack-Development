package PreparedStatement;
import java.util.*;

import MyPackage.StatementInterfaceDemo;

public class Driver {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int empId;
		String empName;
		double empSalary;
		
		while(true) {
			System.out.println("1. Show Table Data");
			System.out.println("2. Add Employee Data");
			System.out.println("3. Update Employee Name");
			System.out.println("4. Update Employee Salary");
			System.out.println("5. Delete Employee");
			System.out.println("6. Exit");
			
			System.out.println("Enter your Choice");
			int ch = sc.nextInt();
			
			switch(ch) {
				case 1: PreparedStatementDemo.showEmp();
				        break;
				case 2: System.out.println("Enter Id of Emloyee");
				 		empId = sc.nextInt();
				 		System.out.println("Enter Employee name");
				 		empName = sc.next();
				 		System.out.println("Enter Employee Salary");
				 		empSalary = sc.nextDouble();
				 		PreparedStatementDemo.addEmployee(empId, empName, empSalary);
				 		break;
				case 3: System.out.println("Enter Id of Emloyee");
		 				empId = sc.nextInt();
						System.out.println("Enter Name of Employee");
						empName = sc.next();
						PreparedStatementDemo.updateEmpName(empId, empName);
						break;
				case 4: System.out.println("Enter Id of Emloyee");
		 				empId = sc.nextInt();
		 				System.out.println("Enter Employee Salary");
				 		empSalary = sc.nextDouble();
				 		PreparedStatementDemo.updateEmpSalary(empId, empSalary);
				 		break;
				case 5: System.out.println("Enter Id of Emloyee");
 						empId = sc.nextInt();
 						PreparedStatementDemo.deleteEmp(empId);
 						break;
				case 6: System.exit(0);
						break;
				default: System.out.println("Invalid Choice");
			}
		}
	}
}