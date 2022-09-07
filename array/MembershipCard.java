package com.practice;

public class MembershipCard extends Card {
	Integer rating ;
	String holderName,  cardNumber,  expiryDate;
	public MembershipCard(String holderName, String cardNumber, String expiryDate,Integer rating)
	{
		super("rahul","123456789","29-11-2000");
		this.holderName=holderName;
		this.cardNumber=cardNumber;
		this.expiryDate=expiryDate;
		this.rating=rating;
		
	}
	public Integer getRating() {
		return rating;
	}
	
	public String getHolderName() {
		return holderName;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	
	
	public String getExpiryDate() {
		return expiryDate;
	}
	
}
