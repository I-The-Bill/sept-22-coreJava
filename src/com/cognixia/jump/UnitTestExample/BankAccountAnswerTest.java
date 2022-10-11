package com.cognixia.jump.UnitTestExample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cognixia.jump.UnitTestExample.BankAccount.AccountType;

class BankAccountAnswerTest 
{
	/*
	 * Need an account to test
	 * 
	 */
	private final static int STARTING_BALANCE = 250;
	private static BankAccount toTest;
	
	@BeforeAll
	static void setUp()
	{
		toTest = new BankAccount(STARTING_BALANCE, AccountType.CHECKING);
	}
	
	@BeforeEach
	void resets() throws OverdraftException
	{
		System.out.println("RESET");
		int setToOg = toTest.getBalance() - STARTING_BALANCE;
		if (setToOg < 0)
		{
			//System.out.println("is less then");
			setToOg = setToOg*-1;
			toTest.deposit(setToOg);
			//System.out.println(toTest.getBalance());
		}
		else 
		{
			//System.out.println("is greater then then");
			toTest.withdraw(setToOg);
			//System.out.println(toTest.getBalance());
		}
		System.out.println("Balance before the test: " +toTest.getBalance());
	}
	
	@Test
	void deposit()
	{
		System.out.println("TESTING DEPOSIT");
		int amountToDeposit = 100;
		int orginalBalnce = STARTING_BALANCE;
		toTest.deposit(amountToDeposit);
		assertEquals(toTest.getBalance(), orginalBalnce+amountToDeposit);
	}
	
	@Test
	void NegativeDeposit()
	{
		System.out.println("TESTING NEGATIVE DEPOSIT");
		int amountToDeposit = -100;
		int orginalBalnce = STARTING_BALANCE;
		toTest.deposit(amountToDeposit);
		System.out.println(toTest.getBalance());
		System.out.println(orginalBalnce+amountToDeposit);
		assertEquals(toTest.getBalance(), orginalBalnce);
		//assertThrows();
	}
	
	
	
	
}