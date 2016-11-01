package graphic.view;

import javax.swing.JPanel;
import graphic.controller.FirstGUIController;

public class FirstPanel extends JPanel
{
	private FirstGUIController baseController;
	
	public FirstPanel(FirstGUIController baseController)
	{
		super();
		this.baseController = baseController;
	}
}
