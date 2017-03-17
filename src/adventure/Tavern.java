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
public class Tavern {

	/**
	 * @param args
	 */
	public static void tavernPath(String userName) {
		JOptionPane.showMessageDialog(null, " You head to the tavern and along the way you see some people on and you ask them how much further the tavern is.");
		JOptionPane.showMessageDialog(null, " they drop everything they're carrying and run from you");

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
