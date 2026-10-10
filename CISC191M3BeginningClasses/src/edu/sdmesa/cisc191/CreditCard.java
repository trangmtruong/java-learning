/**
 * Lead Author(s):
 * 
 * @author Mia Truong
 *
 *         References:
 *         Morelli, R., & Walde, R. (2016).
 *         Java, Java, Java: Object-Oriented Problem Solving
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving

 *		
 *         Version: 2026-10-09
 */
package edu.sdmesa.cisc191;

/**
 * Purpose: The responsibility of CreditCard is to store the credit card info
 *
 * CreditCard is-an Object
 */
public class CreditCard
{
	// instance variables
	private String cardNumber; // a credit card has-a card number
	private String expirationDate; // a credit card has-an expiration date
	private String securityCode; // a credit card has-a security code
	private Person person; // a credit card has a person (cardholder)
	
	/**
	 * 
	 * Purpose: constructor that creates a cc with card number, expiration date,
	 * security code, and person (cardholder)
	 * 
	 * @param cardNumber     unique number of the credit card
	 * @param expirationDate date that card will expire
	 * @param securityCode   code for security
	 * @param person         the cardholder
	 */
	public CreditCard(String cardNumber, String expirationDate,
			String securityCode, Person person)
	{
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.securityCode = securityCode;
		this.person = person;
	}

	
	/**
	 * Purpose: return this card info as a string
	 * 
	 * @return card number, expiration date, security code, and the person's
	 *         name
	 */
	
	
	@Override
	public String toString()
	{
		return cardNumber + " " + expirationDate + " " + securityCode + " "
				+ person.getName();
	}
}
