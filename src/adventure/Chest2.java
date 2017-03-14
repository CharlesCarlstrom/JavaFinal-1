package adventure;

import javax.swing.JOptionPane;

/**
 * @author Andrew
 *
 */
public class Chest2 
{

	public static void chest2(String userName) 
	{
		JOptionPane.showMessageDialog(null, "You lift the lid off of the chest and look in and see gold and diamonds and pearls and emeralds. The rare jewels and precious metal are glowing up at you and you are intranced by them.");
		JOptionPane.showMessageDialog(null, "Because you were so focused on the stuff in the chest you didn't hear the faint ticking noises around you.............BOOOOOM!!!! YOU GET BLOWN UP!!!!");
		
		PlayAgain.playAgain(userName);

	}

}
