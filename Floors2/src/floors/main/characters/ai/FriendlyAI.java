package floors.main.characters.ai;

import java.awt.Rectangle;

import floors.main.managers.Animations.Animation;

public class FriendlyAI extends AI {

	
	protected FriendlyType type;
	protected double health;
	protected double speed;
	protected double damage;
	protected boolean alive;
	protected Animation animation;
	protected Rectangle rect;
	protected double dropInterval; // Each number 1 - 100 will have a different drop rate for each item 
	   // generates randomly in a file
	
	
	public FriendlyAI(FriendlyType AItype, double AIhealth, double AIspeed, double AIdamage, boolean AIalive,
			Animation AIanimation, Rectangle AIrect, double AIdropInterval) {
		type = AItype;
		health = AIhealth;
		speed = AIspeed;
		damage = AIdamage;
		alive = AIalive;
		animation = AIanimation;
		rect = AIrect;
		dropInterval = AIdropInterval;
	}
	
	public void doLogic() {
		move();
		attack();
	}
	
	protected void move() {
		
	}
	
	protected void attack() {
		
	}
	
	
	
}
