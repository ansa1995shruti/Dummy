package com.cg.mra.dao;
//------------------------   <MobileRechargeApplication_152643> --------------------------
import com.cg.mra.beans.Account;

public interface AccountDao {
public Account getAccountDetails(String mobileNo);

public int rechargeAccount(String mobileno, double rechargeAmount);

}
