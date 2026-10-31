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
 *         Responsibilities of class: PickupTruck represents a Vehicle, and
 *         tracks Cargo Capacity
 * 		
 */
package edu.sdmesa.cisc191;

public class PickupTruck extends Vehicle //IS-A child class of Vehicle
{
	
	private int cargoCapacity; //HAS-A cargoCapaciy
	
	public PickupTruck(String manufacturerName, int milesOnVehicle, int price,
			int numberOfSeats, Option[] options, int cargoCapacity)
	{
		super(manufacturerName, milesOnVehicle, price, numberOfSeats, options);
		this.cargoCapacity = cargoCapacity;
	}
	
	//get methods
	public int getCargoCapacity()
	{
		return cargoCapacity;
	}
	
}
