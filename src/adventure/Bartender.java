/**
 * 
 */
package adventure;

import java.awt.Component;

import javax.swing.JOptionPane;

/**
 * @author cc113884
 *
 */
public class Bartender {

	/**
	 * @param args
	 */
	public static void main(String userName) {
		JOptionPane.showMessageDialog(null, " You arrive to the tavern but nearly everyone is staring you down feeling like you made a mistake you head for the bar and ask for a drink.");
		JOptionPane.showMessageDialog(null, " the bartender turns to you and asks in a joking manner 'back already?' ");

		Object[] options = {"Play Along",
        "Ask if he knows you?"};
		Component frame = null;
		int PlayOrAsk = JOptionPane.showOptionDialog(frame,
				"Play along or ask if he knows you",
				"Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,  
				options,  
				options[0]); 
		if(PlayOrAsk == JOptionPane.YES_OPTION) // Play along
		{
			 PlayAlong.playAlong(userName);
		}
		if(PlayOrAsk == JOptionPane.NO_OPTION) // Ask if he knows you
		{
			Tavern.tavernPath(userName);
		}

	}

}
