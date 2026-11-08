package edu.sdmesa.cisc191;

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
 *         Version/date: 11/7/26
 * 
 *         Responsibilities of class:
 * 		
 */

public class GoneFishingController
{
	private GoneFishingModel model;
	private GoneFishingView view;
	
	/**
	 * TODO
	 * 
	 * @param goneFishingModel
	 * @param goneFishingView
	 */
	public GoneFishingController(GoneFishingModel goneFishingModel,
			GoneFishingView goneFishingView)
	{
		
		// TODO: After initializing the view, set maximum values
		// for the sliders here
		this.model = goneFishingModel;
		this.view = goneFishingView;
		view.setMaxFish(model.getFishRemaining());
		view.setMaxTries(model.getTriesRemaining());
		
	}
	
	/**
	 * Purpose: Handle the event of a fishing button being clicked.
	 * 
	 * @param button
	 */
	public void onFishingButtonClicked(FishingButton button)
	{
		// when a fishing button is clicked,
		// asks the model if there's a fish at this button's spot
		// stores true/false in variable caughtFish
		boolean caughtFish = model.fishAt(button.getRow(), button.getColumn());
		
		// and then tells views to reveal
		// if caughtFish is true, it'll reveal 🐟
		// if caughtFish is false, it'll reveal 🫧
		button.reveal(caughtFish);
	
		// update the number of fish left on view
		view.updateFishRemaining(model.getFishRemaining());
		
		// update the number of tries left on view
		view.updateTriesRemaining(model.getTriesRemaining());
		
	}
	
}
