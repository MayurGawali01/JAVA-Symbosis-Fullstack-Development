package MyPackage;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatementInterfaceDemo.addEmployee(1, "Mayur", 12000);
		StatementInterfaceDemo.addEmployee(2, "omkar", 13000);
		StatementInterfaceDemo.addEmployee(3, "harshal", 5600);
		StatementInterfaceDemo.showEmp();
		System.out.println("----------------------------");
		StatementInterfaceDemo.updateEmpName(2,"Omkar");
		StatementInterfaceDemo.updateEmpSalary(3, 150000);
		System.out.println("------After Updating Name And Salary-----------");
		StatementInterfaceDemo.showEmp();
		StatementInterfaceDemo.deleteEmp(1);
		StatementInterfaceDemo.deleteEmp(5);
		StatementInterfaceDemo.deleteEmp(7);
		System.out.println("---------After Deleting-------------");
		StatementInterfaceDemo.showEmp();
	}

}