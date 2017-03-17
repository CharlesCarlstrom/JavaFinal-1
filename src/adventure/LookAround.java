package adventure;

import java.awt.Component;

import javax.swing.JOptionPane;

/**
 * @author Andrew
 *
 */
public class LookAround 
{

	public static void lookAround(String userName) 
	{
		JOptionPane.showMessageDialog(null, "You want to explore the room some more so you walk past the chest.");
		JOptionPane.showMessageDialog(null, "You notice a strange spot on the wall you approach it and find that there is a secret lever in the room.");
		
		Object[] options = {"Pull the lever",
        "Go back to the chests"};
		Component frame = null;
		int LeverorChest = JOptionPane.showOptionDialog(frame,
				"Pull the lever or Go back to the three chest?",
				"Lever or Chests Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,  
				options,  
				options[0]);
		if(LeverorChest == JOptionPane.YES_OPTION) // Pull lever
		{
			PullLever.pullLever(userName);
		}
		if(LeverorChest == JOptionPane.NO_OPTION) // Go back to chests
		{
			GoBack.goBack(userName);
		}

	}

}
