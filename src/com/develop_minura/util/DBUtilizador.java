package com.develop_minura.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.develop_minura.model.Utilizador;
import com.mysql.jdbc.PreparedStatement;

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
		return "Dados invalidos!";
	}
	
	public static boolean addUtDB(Utilizador u){
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			conn = DBConnection.createConnection();
			stmt = conn.createStatement();
			
			if(checkUtilizador(u.getUsername(), u.getEmail()) == false){
				
				stmt.execute("INSERT INTO utilizadores (username, email, password) VALUES ('"+u.getUsername()+"', '"+u.getEmail()+"', '"+u.getPassword()+"')");
				
				stmt.close();
				stmt = null;
				conn.close();
				conn = null;
				
				return true;
			}
			
			return false;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	private static boolean checkUtilizador(String username, String email){
		
		try {
			Connection con 	= null;
			ResultSet rs 	= null;
			Statement stmt 	= null;
			
			try {
				con = DBConnection.createConnection();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT username, email FROM utilizadores WHERE isDeleted='0'");
			
			while(rs.next()){
				String db_username 	= rs.getString("username");
				String db_email		= rs.getString("email");
				if(db_username.equals(username) || db_email.equals(email)){
					return true;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
