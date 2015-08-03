package com.pratap.oracleaqjmsqueue.example.main;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class DBManager implements IDBManager
{
	private Connection connection;
	private OracleDataSource oracleDataSource;
	public DBManager(String url, String userName, String dbPassword, String dbName) 
	{
		try {
			oracleDataSource = new OracleDataSource();
			oracleDataSource.setUser(userName);
			oracleDataSource.setPassword(dbPassword);
			oracleDataSource.setURL(url);
			oracleDataSource.setDatabaseName(dbName);
			System.out.println("data source created successfully....");
			connection = oracleDataSource.getConnection();
			System.out.println("connected...");
		} catch (SQLException e) {
			System.err.println("error...");
			e.printStackTrace();
		}
		
	}
	public Connection getConnection() {
		return connection;
	}
	public OracleDataSource getOracleDataSource() {
		return oracleDataSource;
	}
	public void changeDatabaseName(String dbName) {
		oracleDataSource.setDatabaseName(dbName);
	}
	
	
}
