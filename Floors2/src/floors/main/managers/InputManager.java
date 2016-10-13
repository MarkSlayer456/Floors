package floors.main.managers;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;

public class InputManager extends GameManager implements KeyListener, MouseListener {
	
	
	public ArrayList<Integer> keysDown; // Keeps track of keys being held down
	
	public HashMap<MouseEvent, Point> coords; // Tells the player the coords of the last mouse click
	
	public InputManager(ArrayList<Integer> list, HashMap<MouseEvent, Point> xy) {
		keysDown = list;
		coords = xy;
	}
	
	
	/*public InputHandler(ArrayList<Character> list) {
		keysDown = list;
	}*/
	@Override
	 public void keyPressed(KeyEvent e) {
		 if(!keysDown.contains(e.getKeyCode())) {
				keysDown.add(e.getKeyCode());
				System.out.println(e.getKeyChar());
				}
		  }
		  @Override
		  public void keyReleased(KeyEvent e) {
			  if(keysDown.contains(e.getKeyCode())) {
					keysDown.remove((Object) e.getKeyCode());
				}
		  }
		  @Override
		  public void keyTyped(KeyEvent e) {
		    if(e.getKeyCode() == 27) {
		      // pause
		    }
		    if(e.getKeyCode() == 0) {
		      // developer console check if player has permission to open
		    }
		  }
		  
		  public boolean contains(int key) { // Checks if player is pressing a certain key 
			  if(keysDown.contains(key)) {
				  return true;
			  }
			  return false;
		  }


		@Override
		public void mouseClicked(MouseEvent e) {
			
		}


		@Override
		public void mouseEntered(MouseEvent e) {
			
		}


		@Override
		public void mouseExited(MouseEvent e) {
			
		}


		@Override
		public void mousePressed(MouseEvent e) {
			
		}


		@Override
		public void mouseReleased(MouseEvent e) {
			
		}
	
	

}
