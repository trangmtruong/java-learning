/**
* Lead Author(s):
* @author Mia truong
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
*
* Version: 2026-11-23
*/
package edu.sdmesa.cisc191;

/**
 * Purpose: The reponsibility of InvalidAmountException is ...
 *
 * InvalidAmountException is-a ...
 * InvalidAmountException is ...
 */
public class InvalidAmountException extends Exception
{
	double amount;
	/**
	 * Purpose: 
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
