package com.cg.mra.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
//------------------------   <MobileRechargeApplication_152643> --------------------------
public class AccountDaoTest {
static AccountDao test=null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Testing starts");
		test=new AccountDaoImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Testing ends");
	}

	@Test
	public void rechargeAmounttest1() {
		int newamount=test.rechargeAccount("7067392421", 200);
		assertEquals(300, newamount);
	}
	@Test
	public void rechargeAmounttest2() {
		int newamount=test.rechargeAccount("7067392421", 100);
		assertNotEquals(500, newamount);
	}
	@Test
	public void rechargeAmounttest3() {
		int newamount=test.rechargeAccount("7067392421", 100);
		assertNotSame(-500, newamount);
	}

}
