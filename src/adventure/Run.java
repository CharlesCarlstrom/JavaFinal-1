package adventure;

import javax.swing.JOptionPane;

/**
 * @author AM312792
 *
 */
public class Run
{

	public static void runPath(String userName) 
	{
		JOptionPane.showMessageDialog(null, "You turn around and start running not knowing which way you are going but then.... ");
		JOptionPane.showMessageDialog(null, "Feeling a shot of pain in you chest you look down and see the stick now impaled there. Then you breath out for the last time. You are dead");
		
		PlayAgain.playAgain(userName);
		
	}

}
