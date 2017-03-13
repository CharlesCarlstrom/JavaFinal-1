package adventure;

import java.awt.Component;

import javax.swing.JOptionPane;

/**
 * @author AM312792
 *
 */
public class PlayAgain 
{

	public static void playAgain(String userName) // Copy to put in your code if they die " PlayAgain.playAgain(userName); "
	{
		JOptionPane.showMessageDialog(null,  "R.I.P " + userName + "!");
		Object[] options = {"Play agian",
        "Exit"};
		Component frame = null;
		int newGame = JOptionPane.showOptionDialog(frame,
				"Play again or Exit?",
				"New Game Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.ERROR_MESSAGE,
				null,  
				options,  
				options[0]);
		if(newGame == JOptionPane.YES_OPTION) // Start new game
		{
			AdventureGame .main(null);
		}
		if(newGame == JOptionPane.NO_OPTION) // Stop
		{
			System.exit(0);
		}
		

	}

}
