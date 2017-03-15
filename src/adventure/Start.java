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
public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		JOptionPane.showMessageDialog(null, "Welcome to 'Adventure Game'!");
		JOptionPane.showMessageDialog(null, "Made by: Charles and Andrew.");
		
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
			AdventureGame.main(null);
		}
		if(PlayorNot == JOptionPane.NO_OPTION) // Don't play
		{
			Please.pleasePlay();
		}


	}

}
