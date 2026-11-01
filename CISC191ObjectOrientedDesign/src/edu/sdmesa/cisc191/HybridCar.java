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
 *         Responsibilities of class: HybridCar represents a Car, and has
 *       
 * 		
 */
package edu.sdmesa.cisc191;


public class HybridCar extends GasCar implements Chargeable
{
	private int batteryCharge =0;

	public HybridCar(String manufacturerName, int milesOnVehicle, int price,
			int numberOfSeats, Option[] options, int numberOfDoors)
	{
		super(manufacturerName, milesOnVehicle, price, numberOfSeats, options,
				numberOfDoors);
		
	}

	@Override
	public int getBatteryCharge()
	{
		
		return batteryCharge;
	}
	@Override
	public void chargeUp(int chargeAdd)
	{
	}
	
	@Override
	public void chargeUp()
	{
		{
			batteryCharge=100;
			
			
		}
		
	}
	
}
