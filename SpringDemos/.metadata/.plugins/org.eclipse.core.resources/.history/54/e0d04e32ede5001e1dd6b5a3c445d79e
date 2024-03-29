package com.doctorapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DoctorDb {
	static Connection connection;

    public static Connection openConnection() {
    	try{
    		Class.forName("com.mysql.jdbc.Driver");
    	}catch(ClassNotFoundException e){
    		e.printStackTrace();
    	}
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        try {
            connection = DriverManager.getConnection(url, username, password);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
