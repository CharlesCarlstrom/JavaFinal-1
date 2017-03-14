package adventure;

import java.awt.Component;

import javax.swing.JOptionPane;

/**
 * @author AM312792
 *
 */
public class Approach 
{

	public static void approachPirate(String userName) 
	{
		JOptionPane.showMessageDialog(null, "You walk over to the pirate and notice for the first time that there are spikes just poking out of the pirate.");
		JOptionPane.showMessageDialog(null, "An involuntary gasp escapes your mouth and you see a broken tripwire laying across the ground in front of him.");
		
		Object[] options = {"Stay clam take deep breaths (Continue)",
        "RUN!!!!!"};
		Component frame = null;
		int RunOrCalm = JOptionPane.showOptionDialog(frame,
				"Stay Calm or RUN!!!?",
				"Cont. Question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,  
				options,  
				options[0]);
		if(RunOrCalm == JOptionPane.YES_OPTION) // Stay calm
		{
			Calm.calmPath(userName);
		}
		if(RunOrCalm == JOptionPane.NO_OPTION) // RUN!!!! You die
		{
			Run.runPath(userName);
		}
		
	}

}
