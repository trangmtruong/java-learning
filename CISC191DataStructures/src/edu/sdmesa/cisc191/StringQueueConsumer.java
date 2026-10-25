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
 * Version/date: 10/24/2026
 * 
 * Responsibilities of class: 
 * 
*/
package edu.sdmesa.cisc191;

import java.util.Queue;

/**
 * Purpose: The reponsibility of StringQueueConsumer is ...
 *
 * StringQueueConsumer is-a ...
 * StringQueueConsumer is ...
 */
public class StringQueueConsumer implements Consumer<String>
{
	private Queue<String> queue;
	
	//constuctor 
	public StringQueueConsumer(Queue<String> queue) {
		this.queue=queue;
	}

	@Override
	public String consume()
	{
		// checks if the Queue LinkList is empty
				if (queue.isEmpty())
				{
					// return null
					return null;
				}
				// if not empty,
				// remove the first index
				return queue.remove();
	}
	
}
