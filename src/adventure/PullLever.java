package adventure;

import javax.swing.JOptionPane;

/**
 * @author AM312792
 *
 */
public class PullLever 
{

	public static void pullLever(String userName)
	{
		JOptionPane.showMessageDialog(null, "You decided to pull the lever and see what happens.");
		JOptionPane.showMessageDialog(null, "You pull the lever and a small room opens up with a enough gold to put a leprechaun to shame.");
		JOptionPane.showMessageDialog(null, "You win, Seeing the gold some how brought back your memory.");
		JOptionPane.showMessageDialog(null, "Then you remembered everything.");
		JOptionPane.showMessageDialog(null, "You are a pirate and captain of the Sea Banshee and most fearsome pirate crew. \nYou hid your gold in this cave but the cave had a cave-in and \nwhile you were running out you got hit on the head hard. \nBeing a pirate you are used to getting hurt so you ignored the pain and used your last burst of energy \nto get out of the cave before it falls on you. \nThen you woke up not remembering anything.");
	
		PlayAgain2.playAgian2(userName);
	}

}
