package PreparedStatement;

import java.sql.*;

import MyPackage.*;

public class PreparedStatementDemo {

	static Connection cn;
	static PreparedStatement pst;
	
	static {
		cn = DBUtil.getConnection();
		if(cn != null)
			System.out.println("JDBC:.Connection is taken..");
	}
	
	public static int addEmployee(int empId,String empName, double empSalary) {
		int n=0;
		try {
			pst = cn.prepareStatement("INSERT INTO emp values(?,?,?)");
			pst.setInt(1, empId);
			pst.setString(2, empName);
			pst.setDouble(3, empSalary);
			
			n = pst.executeUpdate();
		}catch(SQLException e) {
			System.out.println("Error.."+e.getMessage());
			n=0;
		}
		return n;
	}
	
	public static int validateEmp(int empId) {
		int n=0;
		try {
			String query = "SELECT count(*) FROM emp where empid= ?";
			pst.setInt(1,empId);
			ResultSet rs = pst.executeQuery(query);
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
				String query = "delete from emp WHERE empid =?";
				pst.setInt(1,empId);
				pst.executeQuery(query);
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
				String query = "UPDATE emp SET empname=?  Where empid= ?";
				pst.setString(1, empName);
				pst.setInt(2, empId);
				pst.executeQuery(query);
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
				String query = "update emp set salary=? Where empid=?";
				pst.setDouble(1, salary);
				pst.setInt(2, empId);
				pst.executeQuery(query);
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
			pst = cn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				while(rs.next()) {
					System.out.print("|\tEmp ID: "+rs.getInt(1)+"\t|\t Emp Name: "+rs.getString(2)+ "\t|\tEmp Salary: "+rs.getDouble(3)+"\t|");
					System.out.println();
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
			pst.close();
			cn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
