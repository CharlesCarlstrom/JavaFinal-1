/**
 * 
 */
package adventure;

import java.awt.Component;

import javax.swing.JOptionPane;

/**
 * @author CC113884
 *
 */
public class Forest {

	/**
	 * @param args
	 */
	public static void forestPath(String userName) 
	{
		JOptionPane.showMessageDialog(null, "You decide to wander through the forest to figure out where you are. ");
		JOptionPane.showMessageDialog(null, "you come across a road with a sign pointing in two directions, one says kings castle and the other says Oceanside tavern");
		
		Object[] options = {"Kings Castle",
        "Oceanside Tavern"};
		Component frame = null;
		int CastleOrTavern= JOptionPane.showOptionDialog(frame,
				"Kings Castle or Oceanside Tavern",
				"Gunpowder Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,  
				options,  
				options[0]); 
		if(CastleOrTavern == JOptionPane.YES_OPTION) // King's Castle. You Die in this one.
		{
			 Castle.castlePath(userName);
		}
		if(CastleOrTavern == JOptionPane.NO_OPTION) // you go to the tavern.
		{
			Tavern.tavernPath(userName);
		}
	}

}
