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
 * Version/date: 10/25/2026
 * 
 * Responsibilities of class: to add new keyword and urls, and return results
 * 
 */
package edu.sdmesa.cisc191;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SearchEngine
{
	// a search engine HAS-MANY search results
	// create something that can store multiple (values) url's under one
	// string(key)
	private Map<String, List<String>> results = new HashMap<>();
	
	public void addSearchResult(String keyword, String url)
	{
		// if keyword exists in the HashMap
		if (results.containsKey(keyword))
		{
			// get the list for the keyword out of hashmap
			// save the keyword in keywordList variable
			List<String> keywordList = results.get(keyword);
			// then add the value to that same key word
			keywordList.add(url);
			
		}
		else
		{
			// if the hashmap doesn't contain the keyword yet,
			
			// create new ArrayList to stpre the urls
			List<String> newURLList = new ArrayList<>();
			// add the url to the list
			newURLList.add(url);
			// add the keyword, and the list of urls in the hashmap
			results.put(keyword, newURLList);
		}
	}
	
	public List<String> search(String keyword)
	{
		
		// if the keyword is found,
		if (results.containsKey(keyword))
		{
			//get the keyword and return it in a new array list
			return new ArrayList<>(results.get(keyword));
		}
		else
		{
			// if not found
			// return new empty list
			return new ArrayList<>();			
		}
		

		
	}
}
