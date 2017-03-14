package adventure;

import java.awt.Component;

import javax.swing.JOptionPane;

/**
 * @author AM312792
 *
 */
public class Calm 
{

	public static void calmPath(String userName) 
	{
		JOptionPane.showMessageDialog(null, "You take a deep breath and decide to continue on staying wary of future traps.");
		JOptionPane.showMessageDialog(null, "After a little ways your throat starts  to feel dry. By what seems to be pure chance you come across a pond of water.");
		
		Object[] options = {"Risk drinking the water at the chance of it being poisoned.",
        "Pass by (Risk dehydration)"};
		Component frame = null;
		int DrinkorNot = JOptionPane.showOptionDialog(frame,
				"Risk drinking the water at the chance of it being poisoned or Pass by (Risk dehydration)",
				"Water Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,  
				options,  
				options[0]);
		if(DrinkorNot == JOptionPane.YES_OPTION) // Risk drinking the water
		{
			Drink.drinkPath(userName);
		}
		if(DrinkorNot == JOptionPane.NO_OPTION) // Pass by
		{
			Pass.passPath(userName);
		}

	}

}
