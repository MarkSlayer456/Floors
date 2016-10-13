package floors.main.menus;

import java.awt.Image;
import java.util.ArrayList;

public class Menu {
	
	public static ArrayList<String> listOfMenuNames = new ArrayList<String>();
	
	public String name;
	public ArrayList<Button> listOfButtons = new ArrayList<Button>();
	
	public Menu(String menuName, ArrayList<Button> menuListOfButtons, Image background) {
		name = menuName;
		listOfButtons = menuListOfButtons;
		
		
		
		listOfMenuNames.add(name);
	}
	

}
