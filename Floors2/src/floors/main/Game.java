package floors.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.HashMap;

import floors.main.characters.player.Player;
import floors.main.item.Item;
import floors.main.managers.GameManager;
import floors.main.managers.InputManager;
import floors.main.managers.MenuManager;
import floors.main.menus.Button;


public class Game extends Canvas implements Runnable {

	private static final long serialVersionUID = -2917034081040044435L;

	public MenuManager menuManager = new MenuManager("main"); // The default is "main"
	
	public GameManager manager = GameManager.getInstance();
	
	public static HashMap<Integer, Player> playerList = new HashMap<Integer, Player>();
	
	protected static Frame frame;
	protected int maxFrameRate;
	protected boolean setup;
	protected boolean running;
	
	protected double gravityPercent = 100 / 100; // This is a percent of the total gravity only change first number
	protected double gravityIntensity = 100 * gravityPercent; // 100 will be earth's gravity
	
	
	protected static Graphics bufferGraphics = null;
	protected static BufferStrategy bufferStrat = null;
	
	
	public Game(Frame gameFrame, int gameMaxFrameRate, boolean gameSetup, boolean gameRunning) {
		frame = gameFrame;
		maxFrameRate = gameMaxFrameRate;
		setup = gameSetup;
		running = gameRunning;
	}
	
	public static Frame getWindow() {
		return frame;
	}
	
	
	@Override
	public void run() {
		if(!setup) {
			setup();
		}
			while(running) {
				doLogic(gravityIntensity);
				draw();
			}
	}
	// TODO remove this line
	public InputManager playerTest;
	public MenuManager playerMenu = new MenuManager("main");
	public HashMap<Integer, Item> playerInv = new HashMap<Integer, Item>();
	public Player player;
	
	protected void setup() { // Things to setup before the main menu loads
		getWindow().setVisible(true);
		manager.setup();
		menuManager.createMenus();
		player = new Player(1, 5, "MarkSlayer456", true, new Rectangle(20, getWindow().getHeight() - 190, 40, 80), playerInv, 40, 80, new Point(20, getWindow().getHeight() - 190), null, playerMenu);
		playerTest = new InputManager(new ArrayList<Integer>(), false, player); // TODO fix this
		player.InputManager = playerTest;
		getWindow().addKeyListener(playerTest);
		setup = true;
	}
	
	protected void doLogic(double gravity) {
		player.doLogic();
		
		
		
	}
	
	protected void draw() {
		try {
			  BufferStrategy bs = getWindow().getBufferStrategy(); // Gets bufferStrategy
			  if(bs == null) { // Check to see if BufferStrategy exists if not it creates it
				  getWindow().createBufferStrategy(3);
				  return;
			  }
			  Graphics g = bs.getDrawGraphics();
			  //////////////////////////////////////////////////////////////////////////////////////////
			  //g.drawImage(manager.player, 0, getWindow().getHeight() - 560, 250, 550, this);
			  // This will not be in the game just testing things
			  g.clearRect(0, 0, getWindow().getWidth(), getWindow().getHeight());
			  //g.setColor(Color.GRAY);
			  //g.fillRect(0, 0, 2000, 2000);
			  //g.setColor(Color.DARK_GRAY);
			  //g.drawImage(manager.backGround, 0, 0, getWindow().getWidth(), (int) (getWindow().getHeight() - (getWindow().getHeight() * .09)), this); // Draws background
			  //g.drawImage(manager.player, player.rect.x, player.rect.y, 40, 80, this);
			  
			  // TODO setup scaling with g.scale(x); for the resolution
			
			  // Draws all buttons according to what menu is open 
			  // Loop through players
			  // TODO Check to see if each button has a property
			  String enabledMenu = player.menuManager.enabledMenu;
			  for(int i = 0; i < Button.listOfButtons.size(); i++) {
				  Button button = Button.listOfButtons.get(i);
				  if(button.location == enabledMenu) {
					  g.setColor(Color.GRAY);
					  g.fillRect(button.x, button.y, button.width, button.height); // TODO remove this later
					  g.drawRect(button.x, button.y, button.width, button.height);
					  g.setColor(Color.BLACK);
					  g.drawString(button.text, (button.width / 2) + button.x, button.height / 2 + button.y); // TODO center this text
					  
				  }
			  }
			  
			  
			  
			  
			  
			  
			  
			  //////////////////////////////////////////////////////////////////////////////////////////
			  g.dispose();
			  bs.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	

}
