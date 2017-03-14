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
		
		Component frame = null;
		JOptionPane.showMessageDialog(frame,
			    "R.I.P " + userName + "!",
			    "Inane error",
			    JOptionPane.ERROR_MESSAGE);
		
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
			AdventureGame .main(null);
		}
		if(newGame == JOptionPane.NO_OPTION) // Stop
		{
			System.exit(0);
		}
		

	}

}
