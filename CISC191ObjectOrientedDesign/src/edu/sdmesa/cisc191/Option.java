/**
 * Lead Author(s):
 * 
 * @author Mia Truong
 * 
 *         References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented
 *         Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * 
 *         Version/date: 10/30/26
 * 
 *         Responsibilities of class: stores a text description of vehicle's
 *         add-on options
 * 
 */
package edu.sdmesa.cisc191;

public class Option // IS-A Object
{
	private String description; // HAS-A description;
	
	// constructor
	public Option(String description)
	{
		this.description = description;
	}
	
	// get method
	public String getDescription()
	{
		return description;
	}
}
