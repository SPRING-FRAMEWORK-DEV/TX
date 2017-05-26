package com.spring.dao;

public class QueryBuilder {

	/*
	 * 
	 * create table customer(cust_id number,c_name varchar2(200),c_age number);
	 * create table invoice(inv_id number(7),cust_id number);
	 */

	public static final String insert_customer = "INSERT INTO CUSTOMER(CUST_ID,C_NAME,C_AGE) VALUES(:custId,:custName,:custAge)";
	public static final String insert_invoice = "INSERT INTO INVOICE(INV_ID,CUST_ID) VALUES(:invId,:custId)";

}
