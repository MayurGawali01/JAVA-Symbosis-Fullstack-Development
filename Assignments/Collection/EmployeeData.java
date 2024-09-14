package Collection;
import java.util.*;

class SortEmpID implements Comparator<EmployeeData>{

	@Override
	public int compare(EmployeeData e1, EmployeeData e2) {
		// TODO Auto-generated method stub
		if(e1.id == e2.id)
		    return 0;
		else if(e1.id > e2.id)
			return 1;
		else
			return -1;
	}
	
}

class NameSortEmp implements Comparator<EmployeeData>{

	@Override
	public int compare(EmployeeData e1, EmployeeData e2) {
		return e1.name.compareTo(e2.name);
	}
}

class SortEmpSalary implements Comparator<EmployeeData>{

	public int compare(EmployeeData e1, EmployeeData e2) {
		// TODO Auto-generated method stub
		if(e1.salary == e2.salary)
		    return 0;
		else if(e1.salary > e2.salary)
			return 1;
		else
			return -1;
	}
}

class SortEmpLocation implements Comparator<EmployeeData>{

	@Override
	public int compare(EmployeeData e1, EmployeeData e2) {
		return e1.location.compareTo(e2.location);
	}
}

public class EmployeeData {
	
	int id;
	String name,location;
	float salary;
	
	public EmployeeData(int id, String name, float salary, String location) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.location = location;
	}

	@Override
	public String toString() {
		return "EmplyoeeData [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<EmployeeData> empdata = new ArrayList<EmployeeData>();
		
		while(true) {
			System.out.println("1. Add Employee Data");
			System.out.println("2. Sort Employee Data using Id");
			System.out.println("3. Sort Employee Data Using Name");
			System.out.println("4. Sort Employee Data Using Location");
			System.out.println("5. Sort Employee Data Using Salary");
			System.out.println("6. Search Employee");
			System.out.println("7. List Of Employee");
			
			System.out.println("Enter Your Choice");
			int ch = sc.nextInt();
			
			switch(ch) {
				
			case 1: 
				  System.out.println("Enter How Many Students Data");
				  int n = sc.nextInt();
				
				  for(int i=0;i<n;i++) {
					
					System.out.println("Enter Employee ID");
					int id = sc.nextInt();
					
					System.out.println("Enter Employee Name:");
					String name = sc.next(); 
						
					System.out.println("Enter Employee Location");
					String location = sc.next();
					
					System.out.println("Enter Employee Salary");
					float salary = sc.nextFloat();
					 
					empdata.add(new EmployeeData(id, name, salary,location));
				}
				break;
			case 2: 
				System.out.println("Sorting On ID");
				
				Collections.sort(empdata, new SortEmpID());
				for(EmployeeData st: empdata) {
					System.out.println(st);
				}
				break;
			case 3: 
				System.out.println("Sorting On Name");
				
				Collections.sort(empdata, new NameSortEmp());
				for(EmployeeData st: empdata) {
					System.out.println(st);
				}
				break;
			case 4:
				System.out.println("Sorting On Location");
				
				Collections.sort(empdata, new SortEmpLocation());
				for(EmployeeData st: empdata) {
					System.out.println(st);
				}
				break;
			case 5:
				System.out.println("Sorting On Salary");
				
				Collections.sort(empdata, new SortEmpSalary());
				for(EmployeeData st: empdata) {
					System.out.println(st);
				}
				break;
			case 6:
				System.out.println("If do you want to search employee select above options:");
				System.out.println("1. ID");
				System.out.println("");
				String sname = sc.next();
				if(sname.equals("name")) {
					System.out.println("Enter Name to search employee");
					String ename = sc.next();
					for(EmployeeData s: empdata)
					{
						if(s.name.equals(ename)) {
							System.out.println(s);
						}else {
							System.out.println("Employee not exists");
						}
					}
				}
				System.out.println("Enter Employee Id to Search Employee");
				int sid = sc.nextInt();
				
				for(EmployeeData s: empdata)
				{
					if(s.id == sid) {
						System.out.println(s);
					}else {
						System.out.println("Employee not exists");
					}
						
				}
				break;
			case 7:
				System.out.println("Your Employee List is: ");
				for(EmployeeData st: empdata) {
					System.out.println(st);
				}
				break;
			case 8: System.exit(0);	
			}
		}
	}

}
