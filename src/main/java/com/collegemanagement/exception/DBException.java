package com.collegemanagement.exception;

public class DBException extends Exception {

	public DBException(String message,Throwable t)
	{
		super(message,t);
	}
}
