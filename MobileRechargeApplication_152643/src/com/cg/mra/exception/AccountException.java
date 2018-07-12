package com.cg.mra.exception;
//------------------------   <MobileRechargeApplication_152643> --------------------------
@SuppressWarnings("serial")
public class AccountException extends Exception {
public AccountException() {
	super();
}
public AccountException(String msg){
	super(msg);
	System.out.println(msg);
}
}
