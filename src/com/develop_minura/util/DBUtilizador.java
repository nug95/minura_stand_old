package com.develop_minura.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.develop_minura.model.Utilizador;

public class DBUtilizador {
	
	public DBUtilizador(){}
	
	public static String authenticateUser(Utilizador u){
		String username		= u.getUsername();
		String password		= u.getPassword();
		
		Connection 	conn = null;
		Statement 	stmt = null;
		ResultSet	rs	 = null;
		
		String usernameDB = "";
		String passwordDB = "";
		
		try{
			
			try {
				conn = DBConnection.createConnection();
			} catch (Exception e) { e.printStackTrace(); }
			
			stmt = conn.createStatement();
			rs	 = stmt.executeQuery("SELECT username, password FROM utilizadores WHERE tipo > 1 ADN isDeleted='0'");
			
			while(rs.next()){
				usernameDB = rs.getString("username");
				passwordDB = rs.getString("password");
				
				if(username.equals(usernameDB) && password.equals(passwordDB)){
					return "SUCCESS";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Invalid user credencials!";
	}
	
	public static boolean addUtDB(Utilizador u){
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			conn = DBConnection.createConnection();
			stmt = conn.createStatement();
			
			stmt.execute("INSERT INTO utilizadores (username, email, password) VALUES ('"+u.getUsername()+"', '"+u.getEmail()+"', '"+u.getPassword()+"')");
			
			stmt.close();
			stmt = null;
			conn.close();
			conn = null;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(stmt != null){
				try{
					stmt.close();
				}catch (SQLException e) {}
				
				stmt=null;
			}
			
			if(conn != null){
				try{
					conn.close();
				}catch (SQLException e) {}
				
				conn = null;
			}
			
			if(conn == null && stmt == null){
				return true;
			}
		}
		
		return false;
	}
}
