package com.rshu.mppz.customer.controllers;

//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlRootElement;
import com.rshu.mppz.customer.data.Customer;

import java.util.ArrayList;
import java.util.List;

//@XmlRootElement
public class Customers {

	private List<Customer> customers;

//	@XmlElement
	public List<Customer> getCustomerList() {
		if (customers == null) {
			customers = new ArrayList<>();
		}
		return customers;
	}

}
