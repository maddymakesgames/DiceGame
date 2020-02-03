import java.util.*;
public class DiceGame {
	public static void main (String [] args)
	{
		ArrayList<DiceCup> game = new ArrayList<DiceCup> ();
		Scanner myScanner = new Scanner (System.in);

		ArrayList<Boolean> winner = new ArrayList<Boolean> ();

		boolean play = true;

		while(play)
		{
			System.out.println("How many dice? Enter 0 to end game.");
			int dice = myScanner.nextInt();

			if(dice == 0)
			{
				System.out.println("Thank you for playing!");
				play = false;
			}
			else
			{
				DiceCup diceCup = new DiceCup(dice);
				game.add(diceCup);
				diceCup.rollDice();

				System.out.println(diceCup + "\n");

				int [] values = new int [7];
				values = diceCup.getValues();

				for(int i = 1; i < 7; i++)
				{
					System.out.println(i + "s: " + values[i]);
				}
				boolean winning = false;
				for(int i = 1; i < 7; i++)
				{
					if (values [i] == dice)
					{
						System.out.println("Yahtzee!");
						winning = true;
					}
				}

				winner.add(winning);
			}
		}

		System.out.println("Your second turn: " + game.get(1));
		boolean test = winner.get(1);

		if(test)
		{
			System.out.println("You Yahtzee!-ed on your second turn.");
		}
		else
		{
			System.out.println("You did not Yahtzee! on your second turn.");
		}
		myScanner.close();
	}
}