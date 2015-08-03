package com.pratap.oracleaqjmsqueue.example.main;

import java.sql.Connection;

import oracle.jdbc.pool.OracleDataSource;

public interface IDBManager 
{
	public Connection getConnection();
	public OracleDataSource getOracleDataSource();
	public void changeDatabaseName(String dbName);
}
