package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.CustomerInvoiceService;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/app/config/applicationContext.xml");

		CustomerInvoiceService service = context.getBean(
				"customerInvoiceService", CustomerInvoiceService.class);
		int custId = 15;
		int invId = 20;
		service.generateInvoice(custId, invId);
	}
}
