package com.bhavna.assessments;

public class GenericBank  {
	protected double bankbalance;
	public void welcome()
	{
		System.out.println("welcome");
	}
	public void deposit (int amount)
	{
		System.out.println("depoist =" +amount);
	}
	public void checkbalance (int amount)
	{
		System.out.println("checkbalance =" +amount);
	}
}
