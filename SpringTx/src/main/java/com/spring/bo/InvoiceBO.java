package com.spring.bo;

public class InvoiceBO {

	private int customerId;
	private int invoiceId;

	public InvoiceBO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvoiceBO(int customerId, int invoiceId) {
		super();
		this.customerId = customerId;
		this.invoiceId = invoiceId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

}
