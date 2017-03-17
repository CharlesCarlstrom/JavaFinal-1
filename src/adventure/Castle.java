/**
 * 
 */
package adventure;

import javax.swing.JOptionPane;

/**
 * @author CC113884
 *
 */
public class Castle {

	/**
	 * @param args
	 */
	public static void castlePath(String userName) {
		JOptionPane.showMessageDialog(null, " You make your way to the Kings Castle and find yourself being halted by Castle guards for being wanted for crimes against the crown and the they call you Captain " + userName + " of the Sea Banshee");
		JOptionPane.showMessageDialog(null, " You are now stuck in prison and for the rest of your life, never to know who you are or what you did to deserve being put in prison. You die a slow and miserable death.");

		
		PlayAgain.playAgain(userName);
	}

}
