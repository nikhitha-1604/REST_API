// save under package in src/main
package ebook;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import java.util.ArrayList;

import java.util.List;



public class EmployeeDAO {

		static Connection getDBConnection() {

		Connection connection = null;

		try {

			DriverManager.registerDriver(new com.mysql.jdbc.Driver());

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/24wh1a0568","root","1234");

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		return connection;

	}

	

		public List<Employee> getEmployees() {
		    List<Employee> employeeList = new ArrayList<>();

		    try {
		        Connection connection = DriverManager.getConnection(
		            "jdbc:mysql://localhost:3306/24wh1a0568", "root", "1234");

		        Statement statement = connection.createStatement();
		        ResultSet rs = statement.executeQuery("select * from employee");

		        while (rs.next()) {
		            Employee employee = new Employee(
		                rs.getInt("id"),
		                rs.getString("name"),
		                rs.getInt("salary"),
		                rs.getString("company")
		            );

		            employeeList.add(employee);
		        }

		        System.out.println("Total records fetched: " + employeeList.size()); 

		        connection.close();

		    } catch (Exception e) {
		        e.printStackTrace();
		    }

		    return employeeList;
		}

}

