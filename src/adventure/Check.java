package adventure;

import javax.swing.JOptionPane;

/**
 * @author AM312792
 *
 */
public class Check 
{

	public static void checkPirate(String userName) 
	{
		JOptionPane.showMessageDialog(null, "Even though it could be an enemy you decided to help him anyway.");
		JOptionPane.showMessageDialog(null, "You lean him up on the cave wall and try waking him up, he wakes for just a moment and says 'Capt.?' and passes out.");
		JOptionPane.showMessageDialog(null, "You try to wake him back up but  it seems that he's passed from all of the weight  and your surprised he he was alive at all (You also take his sword cause why not?).");
		
		Cont.contPath(userName);
	}

}
