package floors.main.menus;

import java.awt.Image;
import java.util.ArrayList;

public class Button {
	
	public static ArrayList<Button> listOfButtons = new ArrayList<Button>();
	
	public int x;
	public int y;
	public int width;
	public int height;
	public String text;
	public Image design;
	public String location;
	
	
	public Button(int buttonX, int buttonY, int buttonWidth, int buttonHeight, String buttonText, Image buttonDesign, String buttonLocation) { // TODO finish this if needed
		x = buttonX;
		y = buttonY;
		width = buttonWidth;
		height = buttonHeight;
		text = buttonText;
		design = buttonDesign;
		location = buttonLocation;
		listOfButtons.add(this);
	}

}
