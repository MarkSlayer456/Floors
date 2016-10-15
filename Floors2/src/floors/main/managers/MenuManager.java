package floors.main.managers;

import java.util.ArrayList;
import java.util.HashMap;
import floors.main.menus.Button;
import floors.main.menus.Menu;

public class MenuManager extends GameManager {
	
	public String enabledMenu = "main"; // Tells which menu is enabled default "main"
	
	public HashMap<String, Menu> listOfMenus = new HashMap<String, Menu>();
	
	public MenuManager(String managerEnabledMenu) {
		enabledMenu = managerEnabledMenu;
	}
	
	public void createMenus() {
		listOfMenus.put("game", null); // When there is no menu active use this
		Menu.listOfMenuNames.add("none");
		///// Main Menu /////
		ArrayList<Button> mainButtonList = new ArrayList<Button>();
		mainButtonList.add(new Button(10, 100, 250, 40, "Start", null, "main", null)); // Start button
		mainButtonList.add(new Button(10, 170, 250, 40, "Options", null, "main", null)); // Options button
		mainButtonList.add(new Button(10, 240, 250, 40, "Quit", null, "main", null)); // Quit button
		// The last null on those is because there is no property associated with that button
		// The first null on those is for the button image later
		Menu mainMenu = new Menu("main", mainButtonList, null);
		listOfMenus.put("main", mainMenu);
		
		///// Pause Menu /////
		ArrayList<Button> pauseButtonList = new ArrayList<Button>();
		pauseButtonList.add(new Button(50, 50, 50, 50, "Resume", null, "pause", null));
		pauseButtonList.add(new Button(100, 100, 50, 50, "Return To Title", null, "pause", null));
		pauseButtonList.add(new Button(150, 150, 50, 50, "Quit", null, "pause", null));
		Menu pauseMenu = new Menu("pause", pauseButtonList, null);
		listOfMenus.put("pause", pauseMenu);
		
		///// Options Menu /////
		ArrayList<Button> optionsButtonList = new ArrayList<Button>();
		optionsButtonList.add(new Button(50, 50, 50, 50, "Back", null, "options", null)); // Back button
		optionsButtonList.add(new Button(50, 50, 50, 50, "Controls", null, "options", null)); // Controls button
		Menu optionsMenu = new Menu("options", optionsButtonList, null);
		listOfMenus.put("options", optionsMenu);
		
		
		///// ControlSettings Menu ///// Sub menu of options
		ArrayList<Button> consetButtonList = new ArrayList<Button>();
		consetButtonList.add(new Button(50, 50, 50, 50, "apply", null, "controls", null));
		//TODO add control buttons here
		Menu controlSettingsMenu = new Menu("controls", consetButtonList, null);
		listOfMenus.put("controls", controlSettingsMenu);
		
		
	}
}
