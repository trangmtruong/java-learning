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
 *         Responsibilities of class: Car represents a Vehicle, and tracks number of doors
 * 
 */
package edu.sdmesa.cisc191;


public class Car extends Vehicle //IS-A child of Vehicle
{
	private int numberOfDoors; // HAS-A numberOfDoors
	
	//constructor
	public Car(String manufacturerName, int milesOnVehicle, int price,
			int numberOfSeats, Option[] options, int numberOfDoors)
	{
		super(manufacturerName, milesOnVehicle, price, numberOfSeats, options);
		this.numberOfDoors=numberOfDoors;
	}
	
	// get methods
	public int getNumberOfDoors()
	{
		return numberOfDoors;
	}
}
