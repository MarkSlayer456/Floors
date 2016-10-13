package floors.main.managers;

import java.awt.Image;
import javax.swing.ImageIcon;
import floors.main.managers.Images.ImageLoader;


public class GameManager {
	
	public final static ImageLoader load = new ImageLoader();
	public static GameManager instance = new GameManager();
	
	public static GameManager getInstance() {
		return instance;
	}
	
	///// Default Values /////
	public double gravity = 400; // Default Earth gravity
	
	
	///// Animations /////
	
	
	
	
	///// Pictures /////
	public Image player;
	public Image fillIn;
	public Image troll;
	public Image backGround;	
	
	protected void loadTextures() {
		 player = new ImageIcon(load.getImage("Player.Default.png")).getImage();
		 fillIn = new ImageIcon(load.getImage("BlankCharacter.png")).getImage();
		 troll = new ImageIcon(load.getImage("troll.png")).getImage();
		 backGround = new ImageIcon(load.getImage("MainPlatform.png")).getImage();
		
		
		
		
		
		
		
		
	}
	
	public void setup() {
		loadTextures();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
