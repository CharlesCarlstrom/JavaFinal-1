package adventure;

import java.awt.Component;

import javax.swing.JOptionPane;

/**
 * @author AM312792
 *
 */
public class Cont 
{

	public static void contPath(String userName) 
	{
		JOptionPane.showMessageDialog(null, "You find the end of the cave and find some sort of room with three chests. You see a note on the cave wall and it says 'Two of the chests are trapped!'.");
		
		Object[] options = {"Open One of the chest",
        "Look around the room some more."};
		Component frame = null;
		int checkorCont = JOptionPane.showOptionDialog(frame,
				"Open one of the Chest or Look around the room some more?",
				"Chests or Room. Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,  
				options,  
				options[0]);
		if(checkorCont == JOptionPane.YES_OPTION) // Open chest (You "Might" die)
		{
			OpenChest.openChest(userName);
		}
		if(checkorCont == JOptionPane.NO_OPTION) // Look around some more
		{
			LookAround.lookAround(userName);	
		}

	}

}
