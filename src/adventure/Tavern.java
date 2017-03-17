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

		Object[] options = {"Steal",
        "Continue to the Tavern"};
		Component frame = null;
		int StealOrTavern= JOptionPane.showOptionDialog(frame,
				"Search their things or continue on",
				"Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,  
				options,  
				options[0]); 
		if(StealOrTavern == JOptionPane.YES_OPTION) // you steal some stuff the go to the tavern.
		{
			 Steal.steal(userName);
		}
		if(StealOrTavern == JOptionPane.NO_OPTION) // you go to the tavern.
		{
			Bartender.main(userName);
		}
	}

}
