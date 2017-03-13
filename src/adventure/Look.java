package adventure;

import javax.swing.JOptionPane;

/**
 * @author AM312792
 *
 */
public class Look 
{

	public static void lookAround(String userName) 
	{
		JOptionPane.showMessageDialog(null, "Looking for a weapon you find a sharp stick... seeing nothing wrong about that you go for it and hit a tripwire the stick is now flying at you.");
		JOptionPane.showMessageDialog(null, "Feeling a shot of pain in you chest you look down and see the stick now impaled there. Then you breath out for the last time. You are dead");
		
		PlayAgain.playAgain(userName);
	}

}
