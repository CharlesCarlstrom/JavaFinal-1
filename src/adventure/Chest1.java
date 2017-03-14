package adventure;

import javax.swing.JOptionPane;

/**
 * @author Andrew
 *
 */
public class Chest1 
{

	public static void chest1(String userName) 
	{
		JOptionPane.showMessageDialog(null, "You open the chest lid and you hear a ticking 'tick, tick, tick' then....................................................... BOOOM!!!");
		
		PlayAgain.playAgain(userName);

	}

}
