package adventure;

import javax.swing.JOptionPane;

/**
 * @author AM312792
 *
 */
public class PlayAlong 
{

	public static void playAlong(String userName) 
	{
		JOptionPane.showMessageDialog(null, "You play along and greet him and try play it cool but he can tell somethings up");
		JOptionPane.showMessageDialog(null, "The bartneder then ask 'Is there something wrong" + userName + "'");
		JOptionPane.showMessageDialog(null, "An old man in the back stands up asks the bartender 'Did you say " + userName + "'");
		JOptionPane.showMessageDialog(null, "'Because if you did it seems that I have a debt that is in need of collection.' Bartender backs away.");
		JOptionPane.showMessageDialog(null, "You notice that the old man is actually blind");
		JOptionPane.showMessageDialog(null, "You try to sneak out and head for the door but 2 huge men step in front of you."); 
		JOptionPane.showMessageDialog(null, "One of the large individuals grabs you and slams you on the wall.");
		JOptionPane.showMessageDialog(null, "You now remember who you are why it is you are here you hit the bodyguard and and run out and down to you ship");
		JOptionPane.showMessageDialog(null, "You win, You are a pirate and captain of the \nSea Banshee and most fearsome pirate crew. You hid your gold in a \ncave but the cave had  caved-in and while you \nwere running out you got hit on the head hard. \nBeing a pirate you are used to getting hurt so you ignored the\n pain and used your last\n burst of energy to get out of the cave before it fell on you.\nThen you woke up not remembering anything.");
	
		
		PlayAgain2.playAgian2(userName);
	}

}
