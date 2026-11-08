package edu.sdmesa.cisc191;

import java.awt.Color;

import javax.swing.JButton;

/**
 * Lead Author(s):
 * 
 * @author Mia Truong
 * 
 *         Other contributors:
 *         Alex Chow, Allan Schougaard
 *         <<add additional contributors (mentors, tutors, friends) here, with
 *         contact information>>
 * 
 *         References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented
 *         Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * 
 *         Version/date: 11/1/26
 * 
 *         Responsibilities of class:
 * 		
 */

public class FishingButton extends JButton
{
	
	private int row;
	private int column;

	
	/**
	 * Create a fishing button at a given location
	 * 
	 * @param row    of the button's location
	 * @param column column of the button's location
	 */
	
	public FishingButton(int row, int column)
	{
		//sets the buttons to green
		setBackground(Color.GREEN);
		//settings to override mac settings to see green color buttons
		setOpaque(true);
		setBorderPainted(false);
		this.row = row;
		this.column = column;
		setText("🌊");
	}
	
	public int getRow()
	{
		return row;
	}
	
	public int getColumn()
	{
		return column;
	}
	
	/**
	 * Reveals what the button/location contains; used when button is clicked.
	 * A fishing button can only be revealed once.
	 * 
	 * @param isFish if true, the button should show a fish; otherwise nothing.
	 */
	public void reveal(boolean isFish)
	{
		//if isFish is true
		if (isFish)
		{
			//set text to 🐟
			setText("🐟");
	
		}
		//else
		else
		{
			//set text to 🫧
			setText("🫧");

		}
		//then set enabled to false
		//this un-enables the button after revealing the text
		setEnabled(false);
	}
	
}
