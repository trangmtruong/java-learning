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
* Version: 2026-10-08
*/
package edu.sdmesa.cisc191;

/**
 * Purpose: The responsibility of Harbor is to keep track of where the Boats are parked
 *
 * Harbor is-a fixed size row of parking spots
 * Harbor has many Boats
 */
public class Harbor

{
	//declare variables
	private Boat[] boatArray; // a Harbor has-many Boats
	
	/**
	 * Purpose: constructor that creates a harbor
	 * 
	 * @param harborSize the size of this harbor
	 */
	public Harbor(int harborSize)
	{
		boatArray = new Boat[harborSize];
		
	}
	
	/**
	 * Purpose: return the boat at the given index, 
	 * null if that spot is empty
	 * 
	 * @param boatIndex slot number of boat
	 * @return boat at the given index, or null if empty
	 */
	public Boat getBoatAt(int boatIndex) 
	{
		return boatArray[boatIndex];
	}
	
	/**
	 * Purpose: parks new boat in the given spot, and return the boat in that spot previously
	 * 
	 * @param b boat to park
	 * @param i slot to park in
	 * @return the boat that was previously in that slot, or null if it was empty
	 */
	public Boat parkBoatAt(Boat b, int i) 
	{
		//look to see what boat is at the given index in boat array
		Boat oldBoat = boatArray[i];
		//park the new boat into the index
		boatArray[i]= b;
		//return the oldBoat
		return oldBoat;
	}
	

	/**
	 * Purpose: make a copy of the original boatArray
	 *  
	 * @return the copied array of the original that points to the same boats
	 */
     public Boat[] getInventory() 
     {
     //make a copy of the Boat array of the same size
     Boat[] copiedArray = new Boat[boatArray.length];
     //loop thru the original boatArray
     for (int i=0; i<boatArray.length;i++) 
     {
    	 //copy each slot to the new copy array
    	 copiedArray[i]=boatArray[i]; 
     }
     //return the new copy
     return copiedArray;
     }
	
	
}
