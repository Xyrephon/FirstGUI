package graphic.view;

import javax.swing.JFrame;
import graphic.controller.FirstGUIController;

public class FirstFrame extends JFrame
{
	private FirstGUIController baseController;
	
	public FirstFrame(FirstGUIController baseController)
	{
		super();
		this.baseController = baseController;
	}

}
