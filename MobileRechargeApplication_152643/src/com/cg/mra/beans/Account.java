package com.cg.mra.beans;
//------------------------   <MobileRechargeApplication_152643> --------------------------
public class Account {

	private String mobileNo;
	private String accountType;
	private String customerName;
	private double accountBalance;
	/*******************************************************************************************************
	 - Method Name	:	<getMobileNo>
	 - Input Parameters	:	<void> <void>
	 - Return Type		:	<mobilenumber> <String>
	 
	 - Author			:	<Shruti>
	 - Creation Date	:	11/07/2018
	 - Description		:	method to get mobile number
	 ********************************************************************************************************/
	public String getMobileNo() {
		return mobileNo;
	}
	/*******************************************************************************************************
	 - Method Name	:	<setMobileNo>
	 - Input Parameters	:	<mobileNo> <String>
	 - Return Type		:	<null> <void>
	 
	 - Author			:	<Shruti>
	 - Creation Date	:	11/07/2018
	 - Description		:	method to set mobile number
	 ********************************************************************************************************/
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	/*******************************************************************************************************
	 - Method Name	:	<getAccountType>
	 - Input Parameters	:	<void> <void>
	 - Return Type		:	<accounttype> <String>
	 
	 - Author			:	<Shruti>
	 - Creation Date	:	11/07/2018
	 - Description		:	method to get Accounttype
	 ********************************************************************************************************/
	public String getAccountType() {
		return accountType;
	}
	/*******************************************************************************************************
	 - Method Name	:	<setAccountType>
	 - Input Parameters	:	<accountType> <String>
	 - Return Type		:	<null> <void>
	 
	 - Author			:	<Shruti>
	 - Creation Date	:	11/07/2018
	 - Description		:	method to set account type
	 ********************************************************************************************************/
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}/*******************************************************************************************************
	 - Method Name	:	<getMobileNo>
	 - Input Parameters	:	<void><void>
	 - Return Type		:	<customerName> <String>
	 
	 - Author			:	<Shruti>
	 - Creation Date	:	11/07/2018
	 - Description		:	method to get customer name
	 ********************************************************************************************************/
	public String getCustomerName() {
		return customerName;
	}
	/*******************************************************************************************************
	 - Method Name	:	<setMobileNo>
	 - Input Parameters	:	<customerName> <String>
	 - Return Type		:	<null> <void>
	 
	 - Author			:	<Shruti>
	 - Creation Date	:	11/07/2018
	 - Description		:	method to set customer name
	 ********************************************************************************************************/
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/*******************************************************************************************************
	 - Method Name	:	<setAccountBalance>
	 - Input Parameters	:	<void> <void>
	 - Return Type		:	<accountBalance> <double>
	 
	 - Author			:	<Shruti>
	 - Creation Date	:	11/07/2018
	 - Description		:	method to get accountbalance
	 ********************************************************************************************************/
	public double getAccountBalance() {
		return accountBalance;
	}
	/*******************************************************************************************************
	 - Method Name	:	<setAccountBalance>
	 - Input Parameters	:	<accountBalance> <double>
	 - Return Type		:	<null> <void>
	 
	 - Author			:	<Shruti>
	 - Creation Date	:	11/07/2018
	 - Description		:	method to set accountbalance
	 ********************************************************************************************************/
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
