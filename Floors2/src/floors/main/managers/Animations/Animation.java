package floors.main.managers.Animations;

import java.awt.Image;
import java.util.ArrayList;

import floors.main.managers.GameManager;

public class Animation extends GameManager {
	
	
	protected int totalFrames;
	protected int delay; // delay between frames in milliseconds
	protected boolean animationRunning;
	protected int currentFrame;
	protected ArrayList<Image> animationL = new ArrayList<Image>(); 
	
	public Animation(int ATotalFrames, int ADelay, boolean AAnimationRunning, int ACurrentFrame, 
			ArrayList<Image> AanimationL) {
		totalFrames = ATotalFrames;
		delay = ADelay;
		animationRunning = AAnimationRunning;
		currentFrame = ACurrentFrame;
		animationL = AanimationL;
	}
	
	protected void update() {
		if(animationRunning) {
			currentFrame++;
		}
	}
}
