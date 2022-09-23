package com.bhavna.assessments;

public class Test {
public static void main(String [] args)
{
	GenericBank hb = new HdfcBank();
	GenericBank hb1 = new GenericBank();
	hb.welcome();
	hb1.welcome();
	hb.deposit(3000);
	hb.checkbalance(60000);
}
}
