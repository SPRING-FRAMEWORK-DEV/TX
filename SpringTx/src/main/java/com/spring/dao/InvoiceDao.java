package com.spring.dao;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.exception.CustomNumberFormatException;
import com.spring.bo.InvoiceBO;

@Repository
public class InvoiceDao {
	Logger logger = Logger.getLogger(getClass());
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	public void insertInvoice(InvoiceBO invoiceBO) throws Exception  {
		logger.info("Entered into insertInvoice()");
		Map<String, Object> dataMap = new LinkedHashMap<>();
		dataMap.put("custId", invoiceBO.getCustomerId());
		dataMap.put("invId", invoiceBO.getInvoiceId());
		if (invoiceBO.getInvoiceId() == 20)
			throw new Exception("exception thrown");

		jdbcTemplate.update(QueryBuilder.insert_invoice, dataMap);
		logger.info("Executed method insertInvoice()");
	}
}
