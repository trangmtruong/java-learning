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
 */
package edu.sdmesa.cisc191;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Purpose: The reponsibility of StringLinkedListProducer is ...
 *
 * StringLinkedListProducer is-a ...
 * StringLinkedListProducer is ...
 */
public class StringLinkedListProducer implements Producer<String>
 {
	// An LinkedListProducer has-many Strings
		private LinkedList<String> initialStrings;
		
		
	//constructor
		public StringLinkedListProducer(LinkedList<String> initialStrings) 
		{
			//set the  initialStrings to initialStrings variable of this class
			this.initialStrings = initialStrings;
		}

		@Override
		public void produce(String item)
		{
			//Adds item to collection
			initialStrings.add(item);
			
		}

		public void produceAtIndex(int index, String newString)
		{
			// add the newString to the specified index
			initialStrings.add(index, newString);
		}
}
