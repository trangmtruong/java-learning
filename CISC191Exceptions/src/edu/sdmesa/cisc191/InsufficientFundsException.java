/**
* Lead Author(s):
* @author Mia Truong
*
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
 * Purpose: InsufficientFundsException is thrown when the requested amount to withdraw is more than balance
 *
 * InsufficientFundsException is-a checked Exception
 */
public class InsufficientFundsException extends Exception
{
	private double amount ;
	private double balance;

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
