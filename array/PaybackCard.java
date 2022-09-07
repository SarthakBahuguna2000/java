package com.practice;

public class PaybackCard extends Card{
	Integer pointsEarned; 
	Double totalAmount; 
	String holderName, cardNumber, expiryDate;
	
	public PaybackCard(String holderName, String cardNumber, String expiryDate, Integer pointsEarned, Double totalAmount)
	{
		super("rahul","123456789","29-11-2000");
		this.holderName=holderName;
		this.cardNumber=cardNumber;
		this.expiryDate=expiryDate;
		this.pointsEarned=pointsEarned;
		this.totalAmount=totalAmount;
	}

	public Integer getPointsEarned() {
		return pointsEarned;
	}

	public Double getTotalAmount() {
		return totalAmount;
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
