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

import java.util.Stack;

/**
 * Purpose: The reponsibility of StringStackConsumer is to consume an iten
 *
 ***/

public class StringStackConsumer implements Consumer<String>
{
	private Stack<String> stack;

	//constructor
	public StringStackConsumer(Stack<String> stack)
	{
		this.stack=stack;
	}
	
	//produce method

	public String consume()
	{
		// checks if the Queue LinkList is empty
				if (stack.isEmpty())
				{
					// return null
					return null;
				}
				// if not empty,

				return stack.pop();
	}
	
	
}
