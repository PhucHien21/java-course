package homework1;

import java.lang.Math;

public class roll {
	public int score;
	public int rollDice()	{
		score = (int)(Math.random()*6 + 1);
		return score;
	}
}
