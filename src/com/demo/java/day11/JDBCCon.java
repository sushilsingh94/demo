package com.demo.java.day11;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.xml.internal.ws.org.objectweb.asm.Type;

public class JDBCCon {
	
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "user", "pass");
			
			 ps = con.prepareStatement("Select * from emp where empId=?");
			ps.setInt(1, 232);
			
			//stored procedure
			/*CallableStatement cps = con.prepareCall("{?= insertPrc(?, ?)}");
			cps.setLong(2, 232);
			cps.setString(3, "sada");
			cps.registerOutParameter(1, Type.CHAR);*/
			////////////
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				System.out.println(rs.getString("first_name"));
			}
		}catch (Exception e) {
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

}
