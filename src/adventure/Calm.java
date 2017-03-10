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
				"Stay Calm or RUN!!!?",
				"Cont. Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.PLAIN_MESSAGE,
				null,  
				options,  
				options[0]);

	}

}
