/**
 * 
 */
package adventure;

import javax.swing.JOptionPane;

/**
 * @author AM312792
 *
 */
public class Steal {

	/**
	 * @param args
	 */
	public static void steal(String userName) 
	{
		JOptionPane.showMessageDialog(null, "You check their things for anything that could help you and you find a small bit of gold");

		Bartender.main(userName);
	}

}
