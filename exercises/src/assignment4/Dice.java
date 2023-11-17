package assignment4;

public class Dice {
	private int score;
	public int rollDice()	{
		score = (int)(Math.random()*6 + 1);
		return score;
	}
}
