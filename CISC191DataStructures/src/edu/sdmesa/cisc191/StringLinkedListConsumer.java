package edu.sdmesa.cisc191;

import java.util.LinkedList;

/**
 * Lead Author(s):
 * 
 * @author Mia Truong
 * 
 * References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * 
 * Version/date: 10/23/2026
 * 
 * Responsibilities of class: 
 * 


/**
 * Purpose: The reponsibility of StringLinkedListConsumer is ...
 *
 * StringLinkedListConsumer is-a ...
 * StringLinkedListConsumer is ...
 */
public class StringLinkedListConsumer implements Consumer<String>
{
	// a LinkedListConsumer has many strings
	private LinkedList<String> initialStrings;
	
	// cpnstructor
	public StringLinkedListConsumer(LinkedList<String> initialStrings)
	{
		this.initialStrings = initialStrings;
	}
	
	public String consume()
	{
		// checks if the LinkedList array is empty
		if (initialStrings.isEmpty())
		{
			// return null
			return null;
		}
		// if not empty,
		// remove the first index
		return initialStrings.remove(0);
	}
}
