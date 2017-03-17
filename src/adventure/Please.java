/**
 * 
 */
package adventure;

import java.awt.Component;

import javax.swing.JOptionPane;

/**
 * @author AM312792
 *
 */
public class Please {

	/**
	 * @param args
	 */
	public static void pleasePlay() 
	{
		JOptionPane.showMessageDialog(null, "You don't? Why not we worked hard on this game. Plesae play.");
		
		Object[] options = {"Play game",
        "Don't play"};
		Component frame1 = null;
		int PlayorNot = JOptionPane.showOptionDialog(frame1,
				"Do you want to play the game?",
				"Game Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,  
				options,  
				options[0]);
		if(PlayorNot == JOptionPane.YES_OPTION) // Starts the game
		{
			AdventureGame.start(null);
		}
		if(PlayorNot == JOptionPane.NO_OPTION) // CLoses the game
		{
			JOptionPane.showMessageDialog(null, "Ok bye.");
			System.exit(0);
		}


	}

}
