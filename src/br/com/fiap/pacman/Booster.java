package br.com.fiap.pacman;

public class Booster extends Item{

	private int duration;

	public Booster() {
		
	}

	public Booster(int x, int y, int duration) {
		super(x, y);
		setDuration(duration);
	}

	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		if (duration > 0) this.duration = duration;
	}
	
	public boolean verifyInvencible(Player player) {
		
		int xBooster = this.getX();
		int yBooster = this.getY();
		
		int leftX = xBooster - 20;
		int rightX = xBooster + 20;
		
		int upY = yBooster - 40;
		int downY = yBooster + 40;
		
		return ((player.getX() >= leftX && player.getX() <= rightX) && (player.getY() >= upY && player.getY() <= downY));
		
	}
	
}
