///**
//* Lead Author(s):
////* @author Mia Truong
//
////* References:
////* Morelli, R., & Walde, R. (2016).
////* Java, Java, Java: Object-Oriented Problem Solving
////* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
////*
////*
////* Version: 2026-10-25
package edu.sdmesa.cisc191;

import java.util.HashMap;
import java.util.Map;

/**
 * Purpose: The reponsibility of PhoneDirectory is to add, set delete new contacts 
 */
public class PhoneDirectory
{
	// declare instance variables
	// create a new HashMap thats stores String and Integer as key-value pairs
	
	private Map<String, Integer> contacts = new HashMap<>();// PhoneDirectory
															// HAS-MANY contacts
	
	// constructor
	// is ok being empty bc already declared its starting value
	// when delcared instance variable
	
	public PhoneDirectory()
	{
	}
	
	// method to add the name and number into contacts hashmap
	public void setNumberForContact(String contactName, Integer contactNumber)
	{
		contacts.put(contactName, contactNumber);
	}
	
	// method to look up the phone number, given contactName
	public Integer findNumberForContact(String contactName)
	{
		// return the value of phone number by getting the key value contactName
		return contacts.get(contactName);
	}
	
	// forget contact method
	// returns Integer because returns number
	public Integer forgetContact(String contactName)
	{
		return contacts.remove(contactName);
	}
}
