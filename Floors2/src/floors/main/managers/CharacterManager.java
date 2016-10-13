package floors.main.managers;

import java.awt.Point;
import java.util.HashMap;

import floors.main.characters.player.Player;
import floors.main.item.Item;

public class CharacterManager extends GameManager {
	
	
	public static CharacterManager instance = new CharacterManager();
	
	public static CharacterManager getInstance() {
		return instance;
	}
	
	public Player player;
	protected final double startingPlayerDamage = 5;
	protected final double startingPlayerSpeed = 5;
	
	protected final int playerHeight = 40;
	protected final int playerWidth = 77;
	
	protected final HashMap<Integer, Item> playerStartingInventory = new HashMap<Integer, Item>();
	
	
	protected void createPlayer(String name) {
		player = new Player(startingPlayerDamage, startingPlayerSpeed, name, true, null, playerStartingInventory, playerWidth, playerHeight, new Point(100, 100), null, null); //TODO fix all nulls
		//REMINDER: the rectangle stays null as the width, height, and spawnpoint will make the rectangle for us
	}
	
	protected void createNPCsAndAi() {
		
	}
	
	
	
	public Player getPlayer() {
		return player;
	}
	
	protected void setUp() {
		createNPCsAndAi();
	}
	
}
