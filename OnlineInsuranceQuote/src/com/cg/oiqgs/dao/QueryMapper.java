package com.cg.oiqgs.dao;

public interface QueryMapper {

	public static final String InsertQuery = "INSERT into accounts values(account_number_seq.nextval,?,?,?,?,?,?)";
	public static final String selectAllPolicies = "select * from policy where account_number =(select account_number from accounts where username=?)";
	public static final String validateDetails = "select * from accounts";
	public static final String viewAccount = "select account_number_seq.nextval from accounts ";
}
