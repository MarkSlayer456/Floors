package floors.main;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	 static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	 public static  Thread main;
	 public static Game game;
	 
	  //public static Frame instance = new Frame((int)screenSize.getWidth(), (int)screenSize.getHeight(), "War^2");
	  public static Frame instance = new Frame((int)1266, (int)686, "Floors");
	  
	  public static Frame getInstance() {
	    return instance;
	  }
	  public Frame(int width, int height, String title) {
	    super(title);
	    setDefaultCloseOperation(3);
	    setSize(width, height); 
	    setTitle(title);
	    setResizable(true);
	    setUndecorated(false);
	    setMinimumSize(new Dimension(1200, 760));
	    setLocation((int)screenSize.getWidth() / 2 - width / 2, (int)screenSize.getHeight() / 2 - height / 2);
	  }
	  
	  public static void main(String[] args) {
		  game = new Game(instance, 60, false, true);
		  main = new Thread(game, "game");
		  main.setPriority(10);
		  main.start();
		  
	  }
	  
}
