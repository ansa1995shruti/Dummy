package com.cg.mra.service;

import java.util.Map;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exception.AccountException;
import com.cg.mra.exception.IAccountException;
//------------------------   <MobileRechargeApplication_152643> --------------------------
public class AccountServiceImpl implements AccountService {
	static AccountDao dao = null;
	static {
		dao = new AccountDaoImpl();
	}
	/*******************************************************************************************************
	 - Method Name	:	<getAccountDetails>
	 - Input Parameters	:	<mobileNo> <String>
	 - Return Type		:	<Account> <Account>
	 
	 - Author			:	<Shruti>
	 - Creation Date	:	11/07/2018
	 - Description		:	method to get account details
	 ********************************************************************************************************/
	@Override
	public Account getAccountDetails(String mobileNo) {
		Map<String, Account> map1 = AccountDaoImpl.AccountEntry;
		if (!(map1.containsKey(mobileNo))) {
			System.out.println("ERROR: Given Mobile Number Does not exists");
			return null;
		}
		return dao.getAccountDetails(mobileNo);
	}
	/*******************************************************************************************************
	 - Method Name	:	<rechargeAccount>
	 - Input Parameters	:	<mobileNo,rechargeAmount> <String,double>
	 - Return Type		:	<mobileno, rechargeAmount> <integer>
	 
	 - Author			:	<Shruti>
	 - Creation Date	:	11/07/2018
	 - Description		:	method to do mobile recharges
	 ********************************************************************************************************/
	@SuppressWarnings("null")
	@Override
	public int rechargeAccount(String mobileno, double rechargeAmount) {
		Map<String, Account> map1 = AccountDaoImpl.AccountEntry;
		if (!(map1.containsKey(mobileno))) {
			System.out.println("ERROR: Given Mobile Number Does not exists");
			return (Integer) null;
		}
		return dao.rechargeAccount(mobileno, rechargeAmount);
	}
	/*******************************************************************************************************
	 - Method Name	:	<validateDetails>
	 - Input Parameters	:	<mobileNo> <String>
	 - Return Type		:	<output> <boolean>
	 
	 - Author			:	<Shruti>
	 - Creation Date	:	11/07/2018
	 - Description		:	method to validate all the details entered
	 ********************************************************************************************************/
	@Override
	public boolean validateDetails(String mobileno) throws AccountException {
		boolean output = false;
		if (mobileno.length() == 10) {
			output = true;
		} else {
			throw new AccountException(IAccountException.ERROR1);
		}

		return output;
	}

}
