package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exception.AccountException;

import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;
//------------------------   <MobileRechargeApplication_152643> --------------------------
public class MainUI {
	public static void printDetails() {
		System.out.println("****MENU****");
		System.out.println("1.Account Balance enquiry");
		System.out.println("2.Recharge Amount");
		System.out.println("3.Exit");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		do {
			printDetails();
			System.out.println("Enter your choice:");
			choice = scanner.nextInt();
			AccountService iService = new AccountServiceImpl();

			switch (choice) {
			case 1:
				try {

					System.out.println("Enter Mobile No:");
					String mobileno = scanner.next();
					
					if (iService.validateDetails(mobileno)) {
						Account accountBalance = iService.getAccountDetails(mobileno);
						System.out.println("Account Holder Name:" + accountBalance.getCustomerName());
						System.out.println("Account type:" + accountBalance.getAccountType());
						System.out.println("Your Current Balance is:" + accountBalance.getAccountBalance());
					}
						
				} catch (AccountException e1) {
					e1.getMessage();
				}catch (NullPointerException e) {
					e.getMessage();
				}

				break;
			case 2:
				try {
					System.out.println("Enter Mobile No:");
					String mnum = scanner.next();
					System.out.println("Enter Recharge Amount:");
					double rechargeAmount = scanner.nextDouble();

					int balaceLeft = iService.rechargeAccount(mnum, rechargeAmount);
					Account name = AccountDaoImpl.AccountEntry.get(mnum);
					System.out.println("Hello " + name.getCustomerName() + ",Available Balance:" + balaceLeft);
				} catch (NullPointerException e) {
					e.getMessage();
				}

				break;
			case 3:
				System.exit(0);
				break;
			}
		} while (choice != 4);
		scanner.close();
	}

}
