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
public class Cont {

	/**
	 * @param args
	 */
	public static void contPath(String userName) 
	{
		JOptionPane.showMessageDialog(null, "You find the end of the cave and find some sort room with three chests before you and a note on the cave wall it seems that two of the chests are wired to blow.");
		
		Object[] options = {"Check Pirate",
        "Continue down path"};
		Component frame = null;
		int checkorCont = JOptionPane.showOptionDialog(frame,
				"Check the Pirate or Continue down Narrow Path?",
				"Check or Cont. Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.PLAIN_MESSAGE,
				null,  
				options,  
				options[0]);
		if(checkorCont == JOptionPane.YES_OPTION) // Check pirate
		{
			Check.checkPirate(userName);
		}
		if(checkorCont == JOptionPane.NO_OPTION) // Cont. down Narrow path
		{
			Narrow.narrowPath(userName);
		}

	}

}
