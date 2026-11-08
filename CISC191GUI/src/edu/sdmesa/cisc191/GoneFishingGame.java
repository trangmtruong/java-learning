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
 *         Version/date: 11/8/26
 * 
 * 		
 */
package edu.sdmesa.cisc191;

import javax.swing.JOptionPane;

/**
 * Purpose: The responsibility of GoneFishingGame is start the game running
 */
public class GoneFishingGame 
{
	/**
	 * Starts the game
	 * 
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		try
		{
			GoneFishingModel model = new GoneFishingModel();
			// Show the view
			GoneFishingView view = new GoneFishingView();
			// Start the game
			new GoneFishingController(model, view);
		}
		catch (Exception exception)
		{
		
			//show message of the exception
			JOptionPane.showMessageDialog(null, "Somerhing went wrong: " + exception);
		}
	}
}
