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
 *         Version/date: 10/31/26
 * 
 *         Responsibilities of class: ElectricCar represents a Car, and has
 *         battery charge, and can charge
 * 		
 */
package edu.sdmesa.cisc191;

public class ElectricCar extends Car // IS-A child of a Car
{
	
	// constructor
	public ElectricCar(String manufacturerName, int milesOnVehicle, int price,
			int numberOfSeats, Option[] options, int numberOfDoors)
	{
		super(manufacturerName, milesOnVehicle, price, numberOfSeats, options,
				numberOfDoors);
	
	}
	
}
