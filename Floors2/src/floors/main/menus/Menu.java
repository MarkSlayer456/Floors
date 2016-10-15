package floors.main.menus;

import java.awt.Image;
import java.util.ArrayList;

public class Menu {
	// hate everything TODO remove this
	public static ArrayList<String> listOfMenuNames = new ArrayList<String>();
	
	public String name;
	public ArrayList<Button> listOfButtons = new ArrayList<Button>();
	public Image background;
	
	public Menu(String menuName, ArrayList<Button> menuListOfButtons, Image menuBackground) {
		name = menuName;
		listOfButtons = menuListOfButtons;
		background = menuBackground;
		
		listOfMenuNames.add(name);
	}
	

}
