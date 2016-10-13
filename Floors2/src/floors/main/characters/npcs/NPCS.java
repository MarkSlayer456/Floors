package floors.main.characters.npcs;

public abstract class NPCS {
	
	protected abstract String getMessage(); // For when the player talks to the npc have a couple for each character
	protected abstract void sayMessage(); // Use this or the getMessage which ever is easier
	protected abstract void move(); // Most won't move at all maybe have shopkeeps move around a little bit
	protected abstract void openInvetory(); // If shop keeper then open the shop
	
}
