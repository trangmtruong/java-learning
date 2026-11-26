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
* Version: 2026-11-26
*/
package edu.sdmesa.cisc191;

/**
 * Purpose: The reponsibility of InsufficientFundsException is ...
 *
 * InsufficientFundsException is-a ...
 * InsufficientFundsException is ...
 */
public class InsufficientFundsException extends Exception
{
	double amount ;
	double balance;

	public InsufficientFundsException (double amount, double balance)
	{
		this.amount = amount;
		this.balance = balance;
	}
	@Override
	public String getMessage()
	{
		return "Withdrawing amount: $" + amount + " that is larger than balance: $" + balance + " is not allowed";
	}
}
