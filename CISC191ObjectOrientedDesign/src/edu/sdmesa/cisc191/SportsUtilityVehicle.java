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
 *         Responsibilities of class: SportUtilityVehicle represents a Vehicle, and
 *         tracks the max weight for towing
 * 		
 */
package edu.sdmesa.cisc191;


public class SportsUtilityVehicle extends Vehicle //IS-A child of Vehicle
{
	private int maxTowingWeight; //HAS-A maxTowingWeight

	public SportsUtilityVehicle(String manufacturerName, int milesOnVehicle,
			int price, int numberOfSeats, Option[] options, int maxTowingWeight)
	{
		super(manufacturerName, milesOnVehicle, price, numberOfSeats, options);
		this.maxTowingWeight=maxTowingWeight;
		
	}
	
	//get methods
	public int getMaxTowingWeight() 
	{
		return maxTowingWeight;
	}
	
}
