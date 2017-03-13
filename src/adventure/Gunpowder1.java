package adventure;

import javax.swing.JOptionPane;

/**
 * @author AM312792
 *
 */
public class Gunpowder1
{

	public static void lightGunpowder(String userName) // You die
	{
		JOptionPane.showMessageDialog(null, "Seeing the way the cave is you think it would be easier and faster to use the gunpowder.");
		JOptionPane.showMessageDialog(null, "You light the barrels and turn to run away. As you start running your foot gets caught on a rock and you stumble!");
		JOptionPane.showMessageDialog(null, "The gunpowder blows up! You being right in the path get blow to smithereens!! R.I.P " +userName );
		
		PlayAgain.playAgain(userName);
	}


}
