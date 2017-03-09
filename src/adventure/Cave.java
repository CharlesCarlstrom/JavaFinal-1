/**
 * 
 */
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
		if(Gunpowder == JOptionPane.YES_OPTION) // Light Gunpowder
		{
			JOptionPane.showMessageDialog(null, "Seeing the way the cave is you think it would be easier and faster to use the gunpowder.");
			JOptionPane.showMessageDialog(null, "You light the barrels and turn to run away. As you start running your foot gets caught on a rock and you stumble!");
			JOptionPane.showMessageDialog(null, "The gunpowder blows up! You being right in the path get blow to smithereens!! R.I.P " +userName ); // Add userName
		}
		if(Gunpowder == JOptionPane.NO_OPTION) // Find a different path
		{
			JOptionPane.showMessageDialog(null,  "Thinking the gunpowder is a terrible idea you look for another way down.");
			JOptionPane.showMessageDialog(null,  "Seeing another and safer path you leave the gunpowder behind");
			JOptionPane.showMessageDialog(null,  "You head down the path and come across a pirate.");
			
			Object[] choices = {"Look around before approching",
	        "Approach the pirate"};
			Component frame2 = null;
			int pirate = JOptionPane.showOptionDialog(frame2,
					"Look around or Approach Him?",
					"Pirate Question",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.PLAIN_MESSAGE,
					null,  
					choices,  
					choices[0]);
			if(pirate == JOptionPane.YES_OPTION) // Look around before approching
			{
				JOptionPane.showMessageDialog(null, "HI!"); 
			}
			if(pirate == JOptionPane.NO_OPTION) // Approch pirate
			{
				JOptionPane.showMessageDialog(null, "hi2"); 
			}
		}

	}

}
