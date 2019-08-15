package com.automation.practice.db;

import java.sql.*;
import java.util.Enumeration;
import java.util.Vector;

import org.slf4j.*;

public class MariaDB {
 // JDBC driver name and database URL
		private static Logger log = LoggerFactory.getLogger(MariaDB.class);
	    static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
	    static final String DB_URL = "jdbc:mariadb://localhost/test";

	    //  Database credentials
	    static final String USER = "";
	    static final String PASS = "";

	    public static void main(String[] args) {
	        Connection conn = null;
	        Statement stmt = null;
	        try {
	            //STEP 2: Register JDBC driver
	            Class.forName(JDBC_DRIVER);

	            log.info("Dirver is--> " + DriverManager.getDriver(DB_URL));
	            log.info("Dirvers are--> " + DriverManager.getDrivers())
	            ;
	            
	            Enumeration<Driver> e = DriverManager.getDrivers();
	            while(e.hasMoreElements())
	            	System.out.println("Driver list -->" + e.nextElement().toString());
	            
	            //STEP 3: Open a connection
	            log.info("Connecting to a selected database...");
	            conn = DriverManager.getConnection(
	                    DB_URL, USER,PASS);
	            log.info("Connected database successfully...");

	            //STEP 4: Execute a query
	            /*log.info("Creating table in given database...");
	            stmt = conn.createStatement();

	            String sql = "CREATE TABLE REGISTRATION "
	                    + "(id INTEGER not NULL, "
	                    + " first VARCHAR(255), "
	                    + " last VARCHAR(255), "
	                    + " age INTEGER, "
	                    + " PRIMARY KEY ( id ))";

	            stmt.executeUpdate(sql);
	            log.info("Created table in given database...");*/
	            
	            log.info("Preparing query to insert values");
	           String query = "insert into registration (id, first, last, age)"
	            		+ " values (?,?,?,?)";
	            PreparedStatement prepStmt = conn.prepareStatement(query);
	            
	            prepStmt.setInt(1, 30);
	            prepStmt.setString(2, "Phani");
	            prepStmt.setString(3, "Kumar");
	            prepStmt.setInt(4, 27);
	            log.info("Executing query to insert values");
	            prepStmt.execute();
	                   
	            log.info("Values successfully inserted into registration");
	        } catch (SQLException se) {
	            //Handle errors for JDBC
	            se.printStackTrace();
	        } catch (Exception e) {
	            //Handle errors for Class.forName
	            e.printStackTrace();
	        } finally {
	            //finally block used to close resources
	            try {
	                if (stmt != null) {
	                    conn.close();
	                }
	            } catch (SQLException se) {
	            }// do nothing
	            try {
	                if (conn != null) {
	                    conn.close();
	                }
	            } catch (SQLException se) {
	                se.printStackTrace();
	            }//end finally try
	        }//end try
	        log.info("Everything ended successfully!");
	    }//end main
	}//end JDBCExample

