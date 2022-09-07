


package com.practice;

abstract public class Card {
	protected String holderName;
	protected	String cardNumber; 
	protected	String expiryDate;
	public Card(String holderName,String cardNumber,String ExpiryDate)
	{
		this.holderName=holderName;
		this.cardNumber=cardNumber;
		this.expiryDate=expiryDate;
	}
}
