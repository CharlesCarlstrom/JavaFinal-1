package adventure;

import java.awt.Component;

import javax.swing.JOptionPane;

/**
 * @author AM312792
 *
 */
public class PlayAgain2 
{

	public static void playAgian2(String userName)
	{
		JOptionPane.showMessageDialog(null, "Thanks for playing! " + userName);
		JOptionPane.showMessageDialog(null, "Play again to try diffrent paths.");
		
		Object[] options = {"Play agian",
        "Exit"};
		Component frame1 = null;
		int newGame = JOptionPane.showOptionDialog(frame1,
				"Play again or Exit?",
				"New Game Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.WARNING_MESSAGE,
				null,  
				options,  
				options[0]);
		if(newGame == JOptionPane.YES_OPTION) // Start new game
		{
			AdventureGame .start(null);
		}
		if(newGame == JOptionPane.NO_OPTION) // Stop
		{
			System.exit(0);
		}
	}

}
