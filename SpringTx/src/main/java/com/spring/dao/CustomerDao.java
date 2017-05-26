package com.spring.dao;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.bo.CustomerBO;

@Repository
public class CustomerDao {

	Logger logger = Logger.getLogger(getClass());
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	public void insertCustomer(CustomerBO customerBO) {
		logger.info("Entered into insertCustomer()");
		Map<String, Object> dataMap = new LinkedHashMap<>();
		dataMap.put("custId", customerBO.getCustomerId());
		dataMap.put("custName", customerBO.getCustomerName());
		dataMap.put("custAge", customerBO.getCustomerAge());
		
		jdbcTemplate.update(QueryBuilder.insert_customer, dataMap);
		logger.info("Succesfully executed insertCustomer()");

	}
}
