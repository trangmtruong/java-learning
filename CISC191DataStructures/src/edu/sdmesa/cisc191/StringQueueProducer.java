///**
//* Lead Author(s):
//* @author Mia Truong

//* References:
//* Morelli, R., & Walde, R. (2016).
//* Java, Java, Java: Object-Oriented Problem Solving
//* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
//*
//*
//* Version: 2026-10-24

package edu.sdmesa.cisc191;

import java.util.Queue;

/**
 * Purpose: The reponsibility of StringQueueProducer is ...
 *
 * StringQueueProducer is-a ...
 * StringQueueProducer is ...
 */
public class StringQueueProducer implements Producer<String>
{
	private Queue<String> queue;

	//constructor
	public StringQueueProducer(Queue<String> queue)
	{
		this.queue=queue;
	}
	
	//produce method
	@Override
	public void produce(String item)
	{
		queue.add(item);
		
	}
	
}
