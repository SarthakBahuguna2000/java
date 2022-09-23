package com.bhavna.assessments;

public class HdfcBank extends GenericBank implements WithdrawContract,DepositContract {
	public void welcome()
	{
		System.out.println("Welcome");
	}

}
