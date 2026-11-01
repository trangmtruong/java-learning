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
 *         Responsibilities of class: GasCar represents a Car, and has number of
 *         doors, fuel level, a tank
 * 		
 */
package edu.sdmesa.cisc191;

public class GasCar extends Car  implements Combustible // IS-A child of Car and is combustible
{
	private int fuelLevel= 0;
	
	// constructor
	
	public GasCar(String manufacturerName, int milesOnVehicle, int price,
			int numberOfSeats, Option[] options, int numberOfDoors)
	{
		super(manufacturerName, milesOnVehicle, price, numberOfSeats, options,
				numberOfDoors);
	}
	
	@Override
	public int getFuelLevel()
	{
	
		return fuelLevel;
	}
	@Override
	public void addFuel(int fuelAdd)
	{
		//add field into the existing fuelLevel
		fuelLevel += fuelAdd;
		//if fuel level is >50,
		if(fuelLevel>50)
		{
			//return fuelLevel to 50
			fuelLevel =50;
		}
		
		
	}
	
}
