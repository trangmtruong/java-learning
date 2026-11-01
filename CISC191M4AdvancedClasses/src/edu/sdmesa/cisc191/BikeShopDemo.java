/**
* Lead Author(s):
* @author trangmtruong; student ID
* @author Full name; student ID
* <<Add additional lead authors here>>
*
* Other Contributors:
* Full name; student ID or contact information if not in class
* <<Add additional contributors (mentors, tutors, friends) here, with contact information>>
*
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
* <<Add more references here>>
*
* Version: 2026-10-17
*/
package edu.sdmesa.cisc191;

import java.awt.Color;

/**
 * Purpose: The reponsibility of BikeShopDemo is ...
 *
 * BikeShopDemo is-a ...
 * BikeShopDemo is ...
 */
public class BikeShopDemo
{
	
	/**
	 * Purpose: 
	 * @param args
	 */
	public static void main(String[] args)
	{
		BikeShop shop = new BikeShop("Mia's Bike Shop");
		
		Unicycle unicycle1 = new Unicycle("Mia's Unicycle");
	
		unicycle1.setColor(Color.red);
		unicycle1.getMake();
		shop.addToInventory(unicycle1);
		shop.toString();
		
		
		Bicycle bicycle1 = new Bicycle("Mia's Bicycle");
		bicycle1.setColor(Color.blue);
		shop.addToInventory(bicycle1);
		shop.toString();
		
		ElectricMountainBike emb1=new ElectricMountainBike("Mia's EMB");
		emb1.setColor(Color.green);
		shop.addToInventory(emb1);
		shop.toString();
		
		
	
		shop.getName();
		
		System.out.println(shop);
	}
	
}
