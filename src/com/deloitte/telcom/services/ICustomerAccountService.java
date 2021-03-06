package com.deloitte.telcom.services;

import com.deloitte.telcom.entities.CustomerAccount;

public interface ICustomerAccountService {
	CustomerAccount findByMobileNo(String mobileNo);
	void rechargeAccount(CustomerAccount cust ,double amt);
	 void addCustomerDetails(String mobileNo, String name, String accountType, double balance);
	
}