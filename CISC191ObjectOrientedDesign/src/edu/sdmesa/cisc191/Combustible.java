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
 *         Responsibilities of interface: Combustible is an interface
 **/
package edu.sdmesa.cisc191;

public interface Combustible
{
	int getFuelLevel();
	
	void addFuel(int fuelLevel);
}
