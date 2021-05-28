package br.com.fiap.pacman;

public class Bomb extends Item{

	public Bomb() {

	}

	public Bomb(int x, int y) {
		super(x, y);
	}
	
	public boolean verifyColision(Player player) {
		
		if (isVisible()) {
		
			int xBomb = this.getX();
			int yBomb = this.getY();
			
			int leftX = xBomb - 20;
			int rightX = xBomb + 20;
			
			int upY = yBomb - 40;
			int downY = yBomb + 40;
			
			return ((player.getX() >= leftX && player.getX() <= rightX) && (player.getY() >= upY && player.getY() <= downY));
			
		}
		
		return false;
		
	}
	
}
