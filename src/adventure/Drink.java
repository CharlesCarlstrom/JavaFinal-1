package adventure;

import java.awt.Component;

import javax.swing.JOptionPane;

/**
 * @author AM312792
 *
 */
public class Drink 
{

	public static void drinkPath(String userName) 
	{
		JOptionPane.showMessageDialog(null, "Turns out that it is just dirty water, safe enough to drink but is quite gross but worth the price.");
		JOptionPane.showMessageDialog(null, "You continue on through the cave. You come to a wall of rubble and a narrow path that is leading the other direction.");
		JOptionPane.showMessageDialog(null, "You look closer at the wall of rubble and it looks like the other side of the rubble that you saw when you entered the cave. Then you see another pirate under some of the rubble.");
		
		Object[] options = {"Check Pirate(Risk that he is enemy.)",
        "Continue down path"};
		Component frame = null;
		int checkorCont = JOptionPane.showOptionDialog(frame,
				"Check the Pirate(Risk that he is an enemy) or Continue down Narrow Path?",
				"Check or Cont. Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
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
