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
* Version: 2026-10-11
*/
package edu.sdmesa.cisc191;
import java.awt.Color;

/**
 * Purpose: The reponsibility of BoatDemo is ...
 *
 * BoatDemo is-a ...
 * BoatDemo is ...
 */












public class BoatDemo
{
	

	public static void main(String[] args)
	{
		// Shallow vs deep copy
		Person original = new Person("Alex", "619-555-1212", "92111");

		Person shallow = original;    // shallow: points to the SAME person
		Person deep = new Person(original.getName(), "619-555-1212", "92111");  // deep: a NEW person

		original.setName("Sam");      // original changed

		System.out.println("Original: " + original.getName());
		System.out.println("Shallow:  " + shallow.getName());
		System.out.println("Deep:     " + deep.getName());
		
	}
	
}








