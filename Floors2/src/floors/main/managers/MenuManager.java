package floors.main.managers;

import java.util.ArrayList;
import java.util.HashMap;
import floors.main.menus.Button;
import floors.main.menus.Menu;

public class MenuManager extends GameManager {
	
	public String enabledMenu = "main"; // Tells which menu is enabled default "main"
	
	public HashMap<String, Menu> listOfMenus = new HashMap<String, Menu>();
	
	public void createMenus() {
		listOfMenus.put("game", null); // When there is no menu active use this
		Menu.listOfMenuNames.add("none");
		///// Main Menu /////
		ArrayList<Button> mainButtonList = new ArrayList<Button>();
		Button mainButton = new Button(10, 100, 250, 40, "Start", null, "main"); // Start button
		Button mainButton1 = new Button(10, 170, 250, 40, "Options", null, "main"); // Options button
		Button mainButton2 = new Button(10, 240, 250, 40, "Quit", null, "main"); // Quit button
		mainButtonList.add(mainButton);
		mainButtonList.add(mainButton1);
		mainButtonList.add(mainButton2);
		Menu mainMenu = new Menu("main", mainButtonList, null);
		listOfMenus.put("main", mainMenu);
		
		///// Pause Menu /////
		ArrayList<Button> pauseButtonList = new ArrayList<Button>();
		Button pauseButton = new Button(50, 50, 50, 50, "Resume", null, "pause");
		Button pauseButton1 = new Button(100, 100, 50, 50, "Quit", null, "pause");
		pauseButtonList.add(pauseButton);
		pauseButtonList.add(pauseButton1);
		Menu pauseMenu = new Menu("pause", pauseButtonList, null);
		listOfMenus.put("pause", pauseMenu);
	}
}
