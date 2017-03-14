package adventure;

import java.awt.Component;

import javax.swing.JOptionPane;

/**
 * @author AM312792
 *
 */
public class Gunpowder2 
{

	public static void dontLight(String userName) 
	{
		JOptionPane.showMessageDialog(null,  "Thinking the gunpowder is a terrible idea you look for another way down.");
		JOptionPane.showMessageDialog(null,  "Seeing another and safer path you leave the gunpowder behind");
		JOptionPane.showMessageDialog(null,  "You head down the path and come across a pirate.");
		
		Object[] options = {"Look around before approching",
        "Approach the pirate"};
		Component frame = null;
		int pirate = JOptionPane.showOptionDialog(frame,
				"Look around or Approach Him?",
				"Pirate Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,  
				options,  
				options[0]);
		if(pirate == JOptionPane.YES_OPTION) // Look around before approching
		{
			Look.lookAround(userName);
		}
		if(pirate == JOptionPane.NO_OPTION) // Approch pirate
		{
			Approach.approachPirate(userName);
		}

	}

}
