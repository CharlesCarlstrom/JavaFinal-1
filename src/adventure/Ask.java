/**
 * 
 */
package adventure;

import javax.swing.JOptionPane;

/**
 * @author cc113884
 *
 */
public class Ask {

	/**
	 * @param args
	 */
	public static void askPath(String userName) {
		JOptionPane.showMessageDialog(null, " You ask if the bartender knows you, he laughs and says classic" + userName);
		JOptionPane.showMessageDialog(null, " then an old blind mans stands and asks the bartender if he said" + userName);
		JOptionPane.showMessageDialog(null, " Guessing he is not a friend of yours you decide to try and sneak out");
		JOptionPane.showMessageDialog(null, " You make your way to the door but a large man stops you and slams you on the wall");
		JOptionPane.showMessageDialog(null, " you now remember that there is ship waiting for you on the docks.");
		JOptionPane.showMessageDialog(null, " you escape his grasp and start running as fast as you can.");
		JOptionPane.showMessageDialog(null, "You win, You are a pirate and captain of the \nSea Banshee and most fearsome pirate crew. You hid your gold in a \ncave but the cave had  caved-in and while you \nwere running out you got hit on the head hard. \nBeing a pirate you are used to getting hurt so you ignored the \npain and used your last \nburst of energy to get out of the cave before it fell on you. \nThen you woke up not remembering anything.");
		
		PlayAgain2.playAgian2(userName);
		
		
	

	}

}
