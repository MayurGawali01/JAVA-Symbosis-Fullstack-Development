package MyPackage;
import java.sql.*;

import PreparedStatement.DBUtil;

public class StatementInterfaceDemo {

	static Connection cn;
	static Statement st;
	
	static {
		cn = DBUtil.getConnection();
		try {
			st = cn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int addEmployee(int empId,String empName, double empSalary) {
		
		int n=0;
		try {
			
			String query = "INSERT INTO emp VALUES("+ empId+",'"+empName+"',"+empSalary+")";
			
			n = st.executeUpdate(query);
	
		}catch(SQLException e) {
			System.out.println("Error.."+e.getMessage());
			n=0;
		}
		return n;
	}
	
	public static int validateEmp(int empId) {
		int n=0;
		try {
			String query = "SELECT count(*) FROM emp where empid="+empId;
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				if(rs.getInt(1)!=0)
					n = 1;
			}
		}catch(SQLException e) {
			System.out.println("Error....."+e.getMessage());
		}
		return n;
	}
	
	public static boolean deleteEmp(int empId) {
		boolean status = false;
		try {
			int n = validateEmp(empId);
			if(n==1) {
				String query = "DELETE FROM emp WHERE empid ="+empId;
				st.executeQuery(query);
				status = true;
			}
		}catch(SQLException e) {
			System.out.println("Error....."+e.getMessage());
		}
		return status;
	}
	
	public static boolean updateEmpName(int empId, String empName) {
		boolean status = false;
		try {
			if(validateEmp(empId)==1) {
				String query = "UPDATE emp SET empname= '"+empName+"' Where empid="+empId;
				st.executeQuery(query);
				status = true;
			}
		 }catch(SQLException e) {
			System.out.println("Error....."+e.getMessage());
		}
		return status;
	   }
	
	public static boolean updateEmpSalary(int empId, double salary) {
		boolean status = false;
		try {
			if(validateEmp(empId)==1) {
				String query = "UPDATE emp SET salary="+salary+" Where empid="+empId;
				st.executeQuery(query);
				status = true;
			}else
				System.out.println("No Such Employee Records.......");
		 }catch(SQLException e) {
			System.out.println("Error....."+e.getMessage());
		}
	   return status;
     }
	
	public static void showEmp() {
		try {
			String query = "SELECT * FROM emp";
			ResultSet rs = st.executeQuery(query);
			
			if(rs.next()) {
				while(rs.next()) {
					System.out.print("|\tEmp ID: \t|\t"+rs.getInt(1)+"\t|\t Emp Name: "+rs.getString(2)+ "\t|\tEmp Salary: \t|"+rs.getDouble(3));
				}
			}else
				System.out.println("No Employee Records");
			rs.close();
		}catch(SQLException e) {
			System.out.println("Error...."+e.getMessage());
		}
	}
	
	public void closeConnection() {
		try {
			st.close();
			cn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}