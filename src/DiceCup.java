import java.util.*;
public class DiceCup
{
	private ArrayList<Die> dice = new ArrayList<Die> ();
	private int [] values = new int [7];

	public DiceCup (int num)
	{
		while(num > 0)
		{
			Die die = new Die();
			die.roll();
			int dots = die.getNumDots();
			dice.add(die);
			values[dots]++;

			num--;
		}
	}

	public void rollDice ()
	{
		for(int i = 0; i < values.length; i++)
		{
			values[i] = 0;
		}

		for(int i = 0; i < dice.size(); i++)
		{
			Die die = dice.get(i);
			die.roll();
			int dots = die.getNumDots();
			values[dots]++;
		}
	}

	public int [] getValues()
	{
		return values;
	}

	public String toString ()
	{
		String print = "";
		for(int i = 0; i < dice.size(); i++)
		{
			Die die = dice.get(i);
			print += (die.getNumDots() + " ");
		}
		return print;
	}
}