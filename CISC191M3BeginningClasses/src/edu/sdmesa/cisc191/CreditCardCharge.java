/**
* Lead Author(s):
* @author trangmtruong; student ID
* @author Full name; student ID
* <<Add additional lead authors here>>
*
* Other Contributors:
* Full name; student ID or contact information if not in class
* <<Add additional contributors (mentors, tutors, friends) here, with contact information>>
*
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
* <<Add more references here>>
*
* Version: 2026-10-09
*/
package edu.sdmesa.cisc191;

/**
 * Purpose: The reponsibility of CreditCardCharge is to keep the information of a purchase made on a credt card
 *
 * CreditCardCharge is-an Object
 */
public class CreditCardCharge
{
	//instance variables
	private int year; //a credit card charge has-a year
	private int month; //a credit card charge has-a month
	private int day; //a credit card charge has-a day
	private Boat item; //a credit card charge has-an item name
	private String merchantName; //a credit card charge has-a merchant name
	private CreditCard card; //a credit card charge has-a card
	
	
	/**
	 * 
	 * Purpose: constructor that has the info of the credit card charge
	 * @param year
	 * @param month
	 * @param day
	 * @param itemName
	 * @param merchantName
	 * @param card
	 */
	public CreditCardCharge(int year, int month, int day, Boat item, String merchantName, CreditCard card) 
	{
		this.year=year;
		this.month=month;
		this.day=day;
		this.item=item;
		this.merchantName=merchantName;
		this.card=card;
	}
	
	/**
	 * Purpose: return this credit card charge info as a string
	 * 
	 * @return year, month, day of purchase, card number, expiration date, security code, and the person's
	 *         name, merchants name,make of item, and price
	 */
	@Override
	public String toString() 
	{
		return year + "/" + month + "/" + day + " " + card.toString() + " " + merchantName + " " + item.getMake() + " $" + item.getPrice(); 
	}
	
}
