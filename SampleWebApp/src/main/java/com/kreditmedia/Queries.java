package com.kreditmedia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Queries {

	public static final String USER_CREATE = "create table users(id INTEGER IDENTITY PRIMARY KEY,"
			+ "name VARCHAR(255),linkedin_profile VARCHAR(255),company VARCHAR(255), loan_application_id VARCHAR(255))";

	public static final String RESULT_CREATE = "create table results(table_id INTEGER IDENTITY PRIMARY KEY,"
			+ "id INTEGER,type VARCHAR(255)," + "score DOUBLE)";

	public static final String EMPLOYABILITY_CREATE = "create table employability(id INTEGER,score DOUBLE)";

	public static final String READY_USERS = "SELECT id from (SELECT id,COUNT(*) as current_count FROM results GROUP BY id)"
			+ " WHERE current_count=?";

	public static final String RECORD_SELECTION = "SELECT id,type,score FROM results where id=?";

	public static final String RECORDS_DELETE = "DELETE FROM results where table_id=?";

	public static final String RECORD_CREATE = "insert into results(id,type,score) values (?,?,?)";

	public static final String RECORDS_READY_USER = "SELECT table_id,id,type,score FROM results where id=?";

	public static final String EMPLOYABILITY_INSERT = "insert into employability(id,score) values(?,?)";
	
	public static final String USER_INSERT = "insert into users(name,linkedin_profile,company,loan_application_id) values(?,?,?,?)";
	
	public static final String USER_LATEST_ID = "select id,company,linkedin_profile from users ORDER BY id DESC LIMIT 1";

	public static Connection getConnection() throws SQLException,
			ClassNotFoundException {
		Class.forName("org.hsqldb.jdbc.JDBCDriver");
		return DriverManager.getConnection(
				"jdbc:hsqldb:hsql://10.1.54.91:9001/usersDb", "SA", "");
	}
	
	public static void insertUser(String user,String linkedin,String company,String loanId) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		PreparedStatement statement = con.prepareStatement(USER_INSERT);
		statement.setString(1, user);
		statement.setString(2, linkedin);
		statement.setString(3, company);
		statement.setString(4, loanId);
		statement.executeUpdate();
	}
	
	public static Object[] getUserId() throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		PreparedStatement statement = con.prepareStatement(USER_LATEST_ID);
		ResultSet rs = statement.executeQuery();
		Object[] objs = new Object[3];
		Integer userId = null;
		if(rs.next()) {
			objs[0] = rs.getObject(1);
			objs[1] = rs.getObject(2);
			objs[2] = rs.getObject(3);
		}
		return objs;
	}

}

