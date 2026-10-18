/**
 * Lead Author(s):
 * 
 * @author Mia Truong
 *
 *         References:
 *         Morelli, R., & Walde, R. (2016).
 *         Java, Java, Java: Object-Oriented Problem Solving
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *
 *         Version: 2026-10-16
 */
package edu.sdmesa.cisc191;

/**
 * Purpose: The responsibility of BikeShop is to store the name of the bike shop and store the types of Cycles and its description in it
 *
 *
 * BikeShop is-an Object
 * BikeShop HAS-MANY Cycles
 */
public class BikeShop
{
	private String bikeShopName; // BikeShop HAS-A bikeShopName
	private Cycle[] cycleArray = new Cycle[10]; // a BikeShop HAS-MANY Cycles
	private int numberOfBikesInInventory = 0; // a BikeShop HAS-A
												// numberOfBikesInInventory
	
	public BikeShop(String bikeShopName)
	{
		this.bikeShopName = bikeShopName;
		
	}
	
	public String getName()
	{
		return bikeShopName;
	}
	
	public int getNumberOfBikesInInventory()
	{
		return numberOfBikesInInventory;
	}
	
	public void addToInventory(Cycle newCycle)
	{
		// if the numberOfBikesInInventory < the length of the cyclearray
		if (numberOfBikesInInventory < cycleArray.length)
		{
			// then
			// put the new Cycle into the cycleArray[]
			// at the same number of numberOfBikesInInventory as an index
			cycleArray[numberOfBikesInInventory] = newCycle;
			// add 1 to the numberOfBikesInInventory
			numberOfBikesInInventory++;
		}
		
	}
	
	@Override
	public String toString()
	{
		// string to store the bike shop's name
		// and what bikes they have in
		String bikeShopDescription = bikeShopName;
		// loop thru the cycleArray
		//only to the filled indexes in the array
		for (int i = 0; i < numberOfBikesInInventory; i++)
		{
			// at each index,
			// add the name of each cycle
			// and store it in the description
			bikeShopDescription += "\n" + cycleArray[i];
			
		}
		// return the bikeShopDescription
		// of the shop name and the cycles that are in it
		return bikeShopDescription;
	}
}
