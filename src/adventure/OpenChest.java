package adventure;

import java.awt.Component;

import javax.swing.JOptionPane;

/**
 * @author Andrew
 *
 */
public class OpenChest 
{

	public static void openChest(String userName) 
	{
		JOptionPane.showMessageDialog(null, "You are curious about what is in the chest so you walk over to the three chests.");
		
		Object[] options = {"Open Chest #1",
        "Open Chest #2", "Open Chest #3"};
		Component frame = null;
		int Chest = JOptionPane.showOptionDialog(frame,
				"Open Chest #1, Open Chest #2, or Open Chest #3",
				"3 Chest Question",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,  
				options,  
				options[2]);
		if(Chest == JOptionPane.YES_OPTION) // Open Chest 1
		{
			Chest1.chest1(userName);
		}
		if(Chest == JOptionPane.NO_OPTION) // Open Chest 2
		{
			Chest2.chest2(userName);
		}
		if(Chest == JOptionPane.CANCEL_OPTION) // Open Chest 3
		{
			Chest3.chest3(userName);
		}
	}

}
