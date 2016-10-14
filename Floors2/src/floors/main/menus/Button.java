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
	public String property;
	
	
	public Button(int buttonX, int buttonY, int buttonWidth, int buttonHeight, String buttonText, Image buttonDesign, String buttonLocation,
		     String buttonProperty) { // TODO finish this if needed
		// The property string is for the settings menu if it has a property then use it if not don't
		x = buttonX;
		y = buttonY;
		width = buttonWidth;
		height = buttonHeight;
		text = buttonText;
		design = buttonDesign;
		location = buttonLocation;
		property = buttonProperty;
		listOfButtons.add(this);
	}

}
