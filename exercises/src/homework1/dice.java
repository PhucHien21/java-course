package homework1;

public class dice {

	public static void main(String[] args) {
		roll dice1 = new roll();
		roll dice2 = new roll();
		int i = 1;
		
		while(i>0) {
			dice1.rollDice();
			dice2.rollDice();
			if(dice1.score == dice2.score)	{
				break;
			}
			else	{
				i++;
			}
		}
		System.out.println("The scores of two dices are equal!");
		System.out.println("Score: " + dice1.score);
		System.out.println("Times: " + i);
		System.out.println("Game over!");
	}

}