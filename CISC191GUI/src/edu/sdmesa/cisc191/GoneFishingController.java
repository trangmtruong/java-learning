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
 *         Responsibilities of class: middleman that helps model and view
 *         communicate. When a button is clicked, controller asks the model for
 *         result, and tells the view to update.
 * 		
 */

public class GoneFishingController
{
	private GoneFishingModel model;
	private GoneFishingView view;
	
	/**
	 * 
	 * @param goneFishingModel
	 * @param goneFishingView
	 */
	public GoneFishingController(GoneFishingModel goneFishingModel,
			GoneFishingView goneFishingView)
	{
		// for the sliders here
		this.model = goneFishingModel;
		this.view = goneFishingView;
		// get # of fish remaining from model
		// set it to the view
		view.setMaxFish(model.getFishRemaining());
		// get # of tries remaining from model
		// set it to the view
		view.setMaxTries(model.getTriesRemaining());
		
		// add listeners to the view
		view.addListeners(this);
		
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
		
		// if the game is over
		if (model.isGameOver())
		{
			// ig player wins
			if (model.playerWins())
			{
				view.showGameOver("Game Over - You Win!");
			}
			else
			{
				view.showGameOver("Game Over - Fishes Win!");
			}
		}
		
	}
	
}
