package floors.main.characters.player;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.HashMap;

import floors.main.item.Item;
import floors.main.managers.InputManager;
import floors.main.managers.MenuManager;
import floors.main.menus.Menu;

public class Player {
	
	///// Player /////
	public double speed;
	public double damage;
	public String name;
	public boolean alive;
	public HashMap<Integer, Item> inventory = new HashMap<Integer, Item>();
	public int width;
	public int height;
	public Point spawnPoint;
	public Rectangle rect;
	public Rectangle hitBox;
	
	///// Action /////
	public boolean isAttacking;
	public boolean isWalking;
	public boolean isStationary;
	
	///// Direction /////
	public boolean left;
	public boolean right; //If both are false then the person is not moving or is facing forward
	public boolean jumping;
	
	///// Arrays /////
	public InputManager InputManager;
	public MenuManager menuManager;
	
	
	
	public Player(double playerSpeed, double playerDamage, String playerName, boolean playerAlive,
			Rectangle playerRect, HashMap<Integer, Item> playerInventory, int playerHeight, int playerWidth,
			Point playerSpawnPoint, InputManager playerInputHandler, MenuManager playerCurrentPlayerMenu) {
		speed = playerSpeed;
		damage = playerDamage;
		name = playerName;
		alive = playerAlive;
		inventory = playerInventory;
		width = playerWidth;
		height = playerHeight;
		spawnPoint = playerSpawnPoint;
		InputManager = playerInputHandler;
		menuManager = playerCurrentPlayerMenu;
		
		rect = new Rectangle(playerSpawnPoint.x, playerSpawnPoint.y, playerWidth, playerHeight);
		hitBox = new Rectangle(playerSpawnPoint.x, playerSpawnPoint.y, playerWidth + 2, playerHeight + 2);
	}
	
	protected void move() { // TODO move the rect and then put the hitbox in the center of it 
		int x = rect.x;
		int y = rect.y;
		if(InputManager.contains(KeyEvent.VK_A) || InputManager.contains(KeyEvent.VK_LEFT)) {
			x -= speed;
			left = true;
		}
		if(InputManager.contains(KeyEvent.VK_S) || InputManager.contains(KeyEvent.VK_DOWN)) { // TODO Change this to duck later
			//y += speed;
		}
		if(InputManager.contains(KeyEvent.VK_D) || InputManager.contains(KeyEvent.VK_RIGHT)) {
			x += speed;
		}
		if(InputManager.contains(KeyEvent.VK_W) || InputManager.contains(KeyEvent.VK_UP)) { // TODO Make you jump
			//y -= speed;
		}
		rect.setLocation(x, y);
	}
	
	protected void attack() {
		//TODO add if statements checking if player is attacking
	}
	
	protected void setup() {
		
	}
	
	public void doLogic() {
		move();
		attack();
	}

}
