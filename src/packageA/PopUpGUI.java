package packageA;

import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PopUpGUI {
	private String input = "";
	public PopUpGUI(){
		genGUI();
	}
	
	public void genGUI(){
		JFrame frame = new JFrame("InputDialog Example #1");
		frame.setVisible(true);

	    // prompt the user to enter their name
	    input = JOptionPane.showInputDialog(frame, "Input here");

	    // get the user's input. note that if they press Cancel, 'name' will be null
	    System.out.printf("The user's name is '%s'.\n", input);
	    
	    //frame.setVisible(false);
	    //System.exit(0);
	    frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
	}
	
	public String getInput(){
		return input;
	}
}
