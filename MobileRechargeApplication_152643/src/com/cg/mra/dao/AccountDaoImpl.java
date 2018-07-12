package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.cg.mra.beans.Account;
//------------------------   <MobileRechargeApplication_152643> --------------------------
public class AccountDaoImpl implements AccountDao {
	public static HashMap<String, Account> AccountEntry = null;
	static {
		AccountEntry = new HashMap<>();
		Account user1 = new Account();
		user1.setAccountBalance(500);
		user1.setAccountType("prepaid");
		user1.setCustomerName("Shruti");
		user1.setMobileNo("9922943943");
		AccountEntry.put(user1.getMobileNo(), user1);
		Account user2 = new Account();
		user2.setAccountBalance(1500);
		user2.setAccountType("postpaid");
		user2.setCustomerName("Shreya");
		user2.setMobileNo("7834567890");
		AccountEntry.put(user2.getMobileNo(), user2);
		Account user3 = new Account();
		user3.setAccountBalance(900);
		user3.setAccountType("prepaid");
		user3.setCustomerName("Pooja");
		user3.setMobileNo("9987654321");
		AccountEntry.put(user3.getMobileNo(), user3);
		Account user4 = new Account();
		user4.setAccountBalance(1000);
		user4.setAccountType("postpaid");
		user4.setCustomerName("Pranjali");
		user4.setMobileNo("7982299231");
		AccountEntry.put(user4.getMobileNo(), user4);

	}

	@Override
	/*******************************************************************************************************
	 - Method Name	:	<getAccountDetails>
	 - Input Parameters	:	<mobileNo> <String>
	 - Return Type		:	<accountInfo> <Account>
	 
	 - Author			:	<Shruti>
	 - Creation Date	:	11/07/2018
	 - Description		:	method to get account details
	 ********************************************************************************************************/
	public Account getAccountDetails(String mobileNo) {
		Account accountInfo = new Account();
		Set<Entry<String, Account>> set = AccountEntry.entrySet();
		Iterator<Entry<String, Account>> it = set.iterator();

		while (it.hasNext()) {

			Map.Entry<String, Account> entry = it.next();
			if (entry.getKey().equals(mobileNo)) {
				accountInfo = entry.getValue();

			}
		}

		return accountInfo;
	}
	/*******************************************************************************************************
	 - Method Name	:	<rechargeAccount>
	 - Input Parameters	:	<mobileNo,rechargeAmount> <String,double>
	 - Return Type		:	<newAccountBalance> <integer>
	 
	 - Author			:	<Shruti>
	 - Creation Date	:	11/07/2018
	 - Description		:	method to do mobile recharges
	 ********************************************************************************************************/

	@Override
	public int rechargeAccount(String mobileno, double rechargeAmount) {
		Account accountInfo = new Account();
		Set<Entry<String, Account>> set = AccountEntry.entrySet();
		Iterator<Entry<String, Account>> it = set.iterator();

		while (it.hasNext()) {

			Map.Entry<String, Account> entry = it.next();
			if (entry.getKey().equals(mobileno)) {
				accountInfo = entry.getValue();

			}
		}

		double ExistingBalanceAmount = accountInfo.getAccountBalance();
		int NewAccountBalance = (int) (ExistingBalanceAmount + (-rechargeAmount));
		AccountEntry.get(mobileno).setAccountBalance(NewAccountBalance);
		return NewAccountBalance;
	}

}
