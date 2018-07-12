package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.AccountException;
//------------------------   <MobileRechargeApplication_152643> --------------------------
public interface AccountService {

	public Account getAccountDetails(String mobileNo);

	public int rechargeAccount(String mobileno, double rechargeAmount);
	
	public boolean validateDetails(String mobileno) throws AccountException;
}
