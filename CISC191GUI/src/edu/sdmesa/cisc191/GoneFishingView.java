package edu.sdmesa.cisc191;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JPanel;

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

public class GoneFishingView extends JFrame
{
	// 2D array to store buttons
	private FishingButton[][] buttons = new FishingButton[GoneFishingModel.DIMENSION][GoneFishingModel.DIMENSION];
	
	/**
	 * Create GUI for game
	 * 
	 * @param goneFishingModel used to update the GUI
	 */
	public GoneFishingView()
	{
		// TODO: create and layout all the needed widgets with their listeners
		
		// set the title
		setTitle("Gone Fishing");
		
		// create a JLabel
		JLabel instructions = new JLabel("Click on the buttons to fish");
		// add the JLabel to the window, and keep region on left
		add(instructions, BorderLayout.WEST);
		
		// to add buttons
		
		// create a JPanel for buttons
		JPanel panel = new JPanel();
		
		// give panel a GridLayout with 6 roww and 6 columns
		panel.setLayout(new GridLayout(GoneFishingModel.DIMENSION,
				GoneFishingModel.DIMENSION));
		
		// create FishingButton at each row/column,
		// by looping thru the rows and columns
		for (int row = 0; row < GoneFishingModel.DIMENSION; row++)
		{
			for (int column = 0; column < GoneFishingModel.DIMENSION; column++)
			{
				// create a button
				FishingButton button = new FishingButton(row, column);
				// stores button in the buttons 2D array
				buttons[row][column] = button;
				
				// add the button to the panel
				panel.add(button);
			}
		}
		
		// add panel to the window's center
		
		add(panel, BorderLayout.CENTER);
		
		
		//bottom panel
		//create the label firsr
		JLabel authorLabel  = new JLabel("Programmed by: Mia Truong");
		authorLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
		
		//create Jpanel
		JPanel authorPanel = new JPanel();
		//add authorlabel to panel
		authorPanel.add(authorLabel);
		//then add the panel to bottom
		add(authorPanel,BorderLayout.SOUTH);
		
		// In the end do:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	/**
	 * Give every fishing button a listener connected to the controller
	 * 
	 * @param controller the controller that handles clicks
	 */
	public void addListeners(GoneFishingController controller)
	{
		// loop through every row and
		
		for (int row = 0; row < GoneFishingModel.DIMENSION; row++)
		{
			for (int column = 0; column < GoneFishingModel.DIMENSION; column++)
			{
				// create a new FishingButtonListener for the button at
				// [row][column]
				new FishingButtonListener(controller, buttons[row][column]);
			}
			
		}
	}
	
	/**
	 * Update the GUI based on the number of fish remaining
	 * 
	 * @param fishRemaining
	 */
	public void updateFishRemaining(int fishRemaining)
	{
		// TODO
		
	}
	
	/**
	 * Update the GUI based on the the number of tries remaining
	 * 
	 * @param triesRemaining
	 */
	public void updateTriesRemaining(int triesRemaining)
	{
		// TODO
		
	}
	
	/**
	 * Set the maximum number of fish for the slider
	 * 
	 * @param maxFish
	 */
	public void setMaxFish(int maxFish)
	{
		// TODO
		
	}
	
	/**
	 * Set the maximum number of tries for the slider
	 * 
	 * @param maxTries
	 */
	public void setMaxTries(int maxTries)
	{
		// TODO
		
	}
}
