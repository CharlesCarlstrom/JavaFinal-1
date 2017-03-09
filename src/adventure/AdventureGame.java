package adventure;

import javax.swing.JOptionPane;
import java.awt.Component;


/**
 * @author am312792
 *
 */
public class AdventureGame 
{


	public static void main(String[] args) 
	{
	
		String userName;
//		int userPick = 0;
//		int cave = 0;
//		int forest = 0;
//		int Forest = 0;
		
		JOptionPane.showMessageDialog(null, "You wake up not remembering anything.");
		JOptionPane.showMessageDialog(null, "You are by a mouth of a cave. And the cave is in a middle of a forest.");
		JOptionPane.showMessageDialog(null, "Before you begin looking around you think its best to come up with a name just in case you find somebody.");
		userName = JOptionPane.showInputDialog(null, "Wait, who am I?");
		JOptionPane.showMessageDialog(null, userName +" Thats it! Now that you have a name where do you want to go?");
		
		Object[] options = {"Cave",
        "Forest"};
		Component frame = null;
		int CaveAndForest= JOptionPane.showOptionDialog(frame,
				"Cave or Forest?",
				"Cave or Forest Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.PLAIN_MESSAGE,
				null,  
				options,  
				options[0]); 
		if(CaveAndForest == JOptionPane.YES_OPTION) // Cave
		{
			Cave.cavePath(userName);
		}
		if(CaveAndForest == JOptionPane.NO_OPTION) // Forest
		{
			JOptionPane.showMessageDialog(null,  "YES it worked #2!");
		}
		
		
	}

}
