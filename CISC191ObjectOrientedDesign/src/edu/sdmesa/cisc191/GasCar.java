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
 *         Responsibilities of class: GasCar represents a Car, and has number of doors, fuel level, a tank
 *       
 * 		
 */
package edu.sdmesa.cisc191;

public class GasCar extends Car
{
	//constructor
	
	public GasCar(String manufacturerName, int milesOnVehicle, int price,
			int numberOfSeats, Option[] options, int numberOfDoors)
{
		super(manufacturerName, milesOnVehicle, price, numberOfSeats, options, numberOfDoors);
}


}
