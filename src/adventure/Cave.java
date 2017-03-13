package adventure;

import javax.swing.JOptionPane;

import java.awt.Component;

/**
 * @author AM312792
 *
 */
public class Cave {

	public static void cavePath(String userName)
	{
		JOptionPane.showMessageDialog(null, "You walk into the cave. The cave you notice had a recent cave in.");
		JOptionPane.showMessageDialog(null, "You see a couple barrels of gunpowder. That might help get through this...or it might not.");
		Object[] options = {"Light it",
        "Find different path"};
		Component frame = null;
		int Gunpowder= JOptionPane.showOptionDialog(frame,
				"Light it or Find a different path?",
				"Gunpowder Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.PLAIN_MESSAGE,
				null,  
				options,  
				options[0]); 
		if(Gunpowder == JOptionPane.YES_OPTION) // Light Gunpowder. You Die in this one.
		{
			Gunpowder1.lightGunpowder(userName);
		}
		if(Gunpowder == JOptionPane.NO_OPTION) // Find a different path. You could live.
		{
			Gunpowder2.dontLight(userName);
		}

	}

}
