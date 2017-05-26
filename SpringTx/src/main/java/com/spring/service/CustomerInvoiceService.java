package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.spring.bo.CustomerBO;
import com.spring.bo.InvoiceBO;
import com.spring.dao.CustomerDao;
import com.spring.dao.InvoiceDao;

@Service("customerInvoiceService")
public class CustomerInvoiceService {
	@Autowired
	private CustomerDao customerDao;
	@Autowired
	private InvoiceDao invoiceDao;

	public void generateInvoice(int custId, int invId) throws Exception {
		customerDao.insertCustomer(new CustomerBO(custId, "rahul", 29));
		invoiceDao.insertInvoice(new InvoiceBO(custId, invId));
	}

}
