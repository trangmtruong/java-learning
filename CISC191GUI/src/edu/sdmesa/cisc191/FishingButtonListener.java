package edu.sdmesa.cisc191;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

// TODO: FishingButtonListener is-an ActionListener
public class FishingButtonListener implements ActionListener

{
	private FishingButton button;
	private GoneFishingController controller;
	
	public FishingButtonListener(GoneFishingController controller,
			FishingButton button)
	{
		
		this.controller=controller;
		this.button=button;

		//register THIS listener with the button
		button.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// when this button is clicked,
		//updates the to the button on controller
		
		controller.onFishingButtonClicked(button);
		
	}

	// TODO: Override actionPerformed here to call the appropriate method on the controller.

}
