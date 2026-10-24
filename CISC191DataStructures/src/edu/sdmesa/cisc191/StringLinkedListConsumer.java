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
* Version: 2026-10-24
*/
package edu.sdmesa.cisc191;

import java.util.LinkedList;

/**
 * Purpose: The reponsibility of StringLinkedListConsumer is ...
 *
 * StringLinkedListConsumer is-a ...
 * StringLinkedListConsumer is ...
 */
public class StringLinkedListConsumer implements Consumer<String>
{
	//a LinkedListConsumer has many strings
	private LinkedList<String> initialStrings;
	
	//cpnstructor
	public StringLinkedListConsumer(LinkedList<String> initialStrings)
	{
		this.initialStrings = initialStrings;
	}
	
	public String consume() 
	{
	//checks if the LinkedList array is empty
		if(initialStrings.isEmpty())
		{
			//return null
			return null;
		}
		//if not empty,
		//remove the first index
		return initialStrings.remove(0);
	}
}
