package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * 
 * @author Tasha Frankie
 * @author Allan Schougaard
 * 
 *         Other contributors:
 *         Alex Chow
 * 
 *         Responsibilities of class:
 * 	       Virtually model the data of the game
 */

import java.util.Random;


public class GoneFishingModel
{
	//fields
	//declare variable DIMESION and set it to 6, cannot be changed
	public static final int DIMENSION = 6;
	//2D fishGrid array 
	//stores true when there's a fish, false when there's no fish
	private boolean[][] fishGrid = new boolean[DIMENSION][DIMENSION];
	//starting number of tries
	private int triesRemaining = 30;
	//starting number of fish
	private int fishRemaining = 10;

	/**
	 * Creates a model for the game that tracks fish, tries and fish remaining
	 * and determines if the game is over.
	 */
	public GoneFishingModel()
	{
		//creating a number generator
		
		Random randomNumberGenerator = new Random();
		// for loop picks a random spot to hide each fish
		// s it repeats 10 times
		
		//for loops starts at fishCounter =0,
		//as long as the fishCounter is less than the # of fishRemaining
		//increase cpunter every time
		for (int fishCounter = 0; fishCounter < fishRemaining; fishCounter++)
		{
			
			int row, column; //variables to store row and columns
			//do while loop picks a random row and column to hide each fish
			do
			{
				//pic random row
				row = randomNumberGenerator.nextInt(DIMENSION);
				//pick a column
				column = randomNumberGenerator.nextInt(DIMENSION);
			} while (fishGrid[row][column]); // while the spot has a fish, it will go back and pick a new random spot
			fishGrid[row][column] = true; //put fish in that row and column if it's false (no fish in spot)
		}
	}

	/**
	 * Check to see if there is a fish at a given location
	 * 
	 * @param row the row of the location
	 * @param column the column of the location
	 * @return true if the there is a fish at the location; false if not.
	 */
	public boolean fishAt(int row, int column) //returns true or false
	{
		//if game is over
		
		if (isGameOver())
		{
			//throw an exception
			throw new IllegalStateException("You cannot fish after the game is over");
		}
		//else
		else
		{
			//subtract triesRemaining by 1
			triesRemaining--;
			
			//checks if a fish is found, then store in foundFish
			boolean foundFish = fishGrid[row][column];
			//if find a fish
			if (foundFish)
			{
				//-1 to the # of fishRemaining
				fishRemaining--;
			}
			//return true or false
			return foundFish;
		}
	}

	/**
	 * @return the number of tries (clicks) the user has left
	 */
	public int getTriesRemaining()
	{
		//return the # of tries user has left
		
		return triesRemaining;
	}

	/**
	 * @return the number of fish left the in the fame
	 */
	public int getFishRemaining()
	{
		//return the # of fish left in the game to find

		return fishRemaining;
	}

	/**
	 * Determines if the fish has won the game
	 * 
	 * @return true if the fish has own; false if not.
	 */
	public boolean fishWin()
	{
		//when there's no more tries remaining
		//AND there are more fish left
		// return true bc fish win

		return triesRemaining == 0 && fishRemaining > 0;
	}

	/**
	 * Determines if the player has won the game
	 * 
	 * @return true if the player has won; false if not.
	 */
	public boolean playerWins()
	{
		//when there's no fish left
		//return true bc player wins if they get all fish

		return fishRemaining == 0;
	}

	/**
	 * Determines if the game has ended.
	 * 
	 * @return true if the game is over; false if not.
	 */
	public boolean isGameOver()
	{
		//if either fish or player wins
		//then game is over, return true

		return fishWin() || playerWins();
	}
}
