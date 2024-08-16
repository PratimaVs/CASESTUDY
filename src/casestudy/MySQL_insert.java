package casestudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL_insert{
	
	public static void main(String[] args) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.01:3306/demo","root","Nte#25");
		Statement stmt = conn.createStatement();
		String s = "select stu_code,name, sub_code,dept_code,fine from stu_detl";
		ResultSet rs = stmt.executeQuery(s);
		
		while(rs.next())
		{
			System.out.print(" stu_code: "+ rs.getString("stu_code"));
			System.out.print(" name: "+ rs.getString("name"));
			System.out.print(" sub_code: "+ rs.getString("sub_code"));
			System.out.print(" dept_code: "+ rs.getString("dept_code"));
			System.out.print(" fine: "+ rs.getString("fine"));
			
			System.out.println(" ");
		}
		System.out.println("Before insertion");
		
		String s1 = "Insert into stu_detl values('009','Praveen','Comm','010',300)";
		stmt.execute(s1);
		rs = stmt.executeQuery(s);
		
		while(rs.next())
		{
			System.out.print(" stu_code: "+ rs.getString("stu_code"));
			System.out.print(" name: "+ rs.getString("name"));
			System.out.print(" sub_code: "+ rs.getString("sub_code"));
			System.out.print(" dept_code: "+ rs.getString("dept_code"));
			System.out.print(" fine: "+ rs.getString("fine"));
			
			System.out.println(" ");
		}
		conn.close();
		System.out.println("after insertion");
		}
	}

