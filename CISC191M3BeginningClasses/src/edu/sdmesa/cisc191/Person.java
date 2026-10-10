/**
* Lead Author(s):

* @author Full name; Mia Truong

* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*

*
* Version: 2026-10-09
*/
package edu.sdmesa.cisc191;

/**
 * Purpose: The responsibility of Person is to store a person’s name, phone number, and zip code
 *
 * Person is-a Object
 */
public class Person
{
	//variables
	private String name; //a Person has-a name
	private String phoneNumber; //a Person has-a phone number
	private String zipCode;//a Person has-a zip code
	
	/**
	 * 
	 * Purpose: constructor of Person's class
	 * creates a Person with the given info
	 * @param name name of person
	 * @param phoneNumber person's phone number
	 * @param zipCode person's zip code
	 */
	public Person(String name, String phoneNumber, String zipCode) 
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.zipCode = zipCode;
	}
	

	/**
	 * 
	 * Purpose:  method to set the person's name
	 * @param name name of the person
	 */
	public void setName(String name) 
	{
		this.name = name;
	}
	
	/**
	 * 
	 * Purpose: method to get this person's name
	 * @return this person's name
	 */
	public String getName() 
	{
		return name;
	}
	
	
	/**
	 * Purpose: return this person's info as a string
	 * @return person's name, phone number and zip code in a string
	 */
	@Override
	public String toString() 
	{
		return name + " " + phoneNumber + " " + zipCode;
	}
}
