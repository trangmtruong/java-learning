/**
* Lead Author(s):
* @author Mia Truong
*
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
*
* Version: 2026-11-26
*/
package edu.sdmesa.cisc191;

/**
 * Purpose: InvalidAmountException is thrown when amount requested to be withdrawn and deposit is zero or negative, 
 *
 * InvalidAmountException is-a checked Exception
 */
public class InvalidAmountException extends Exception
{
	private double amount;
	/**
	 * Purpose: creates an exception and stores the amount 
	 * @param amount
	 */
	public InvalidAmountException(double amount)
	{
		this.amount = amount;
	}
	
	@Override
	public String getMessage() 
	{
		
		return "Negative amount: $" + amount + " is not allowed";
	}
	
	
}
