package day4;

import java.sql.*;

public class DBTest 
{
	public static void main ( String[] args ) throws ClassNotFoundException, SQLException
	{
		// identify driver and dependencies
			// added to pom.xml
		// register driver (can comment this out in newer versions)
		Class.forName("com.mysql.cj.jdbc.Driver");
		// establish connection
		Connection dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "19112011");
		System.out.println("Connection successful");
		// create statements
		Statement statement = dbConnection.createStatement();
		String sqlQuery = "SELECT * FROM actor";
		// execute statements
		ResultSet resultSet = statement.executeQuery(sqlQuery);	// use .execute() when no response;
		// process result
		while (resultSet.next()) {
			System.out.println(resultSet.getString("last_name"));
		}
		// prepared statement maintains cache
		String anotherSqlQuery = "UPDATE actor SET last_name=? WHERE first_name=?";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(anotherSqlQuery);
			// updating things in the prepared statement
		preparedStatement.setString(1, "KUMAR");
		preparedStatement.setString(2, "NICK"); // or .setInt(), etc. depending on data type
			// executing the prepared statement
		preparedStatement.execute();
		
		dbConnection.close();
	}
}
