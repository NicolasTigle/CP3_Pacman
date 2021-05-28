package br.com.fiap.pacman;

public class Ghost extends GameObject{

	private int direction;
	
	public Ghost() {
		
	}
	
	public Ghost(int x, int y, int direction) {
		super(x, y);
		setDirection(direction);
	}
	
	public boolean verifyColision(Player player) {

		int xGhost = this.getX();
		int yGhost = this.getY();
		
		int leftX = xGhost - 20;
		int rightX = xGhost + 20;
		
		int upY = yGhost - 40;
		int downY = yGhost + 40;
		
		return ((player.getX() >= leftX && player.getX() <= rightX) && (player.getY() >= upY && player.getY() <= downY));
		
	}
	
	public boolean canMove() {
					
		if (direction == 0) {	
			return getY() - 10 >= 0;
		}
		else if (direction == 90) {
			return getX() + 10 <= getScreenSize();
		}
		else if (direction == 180) {
			return getY() + 10 <= getScreenSize();
		}
		else if (direction == 270) {
			return getX() - 10 >= 0;
		}
		return false;
		
	}
	
	public void move() {
		
			if (canMove() == true) {
				if (direction == 0) {
					setY(getY() - 10);
				}
				else if (direction == 90) {
					setX(getX() + 10);
				}
				else if (direction == 180) {
					setY(getY() + 10);
				}
				else if (direction == 270) {
					setX(getX() - 10);
				}
			}		
			
			double randomNumber1 = Math.random();
			
			if (randomNumber1 >= 0.75) {
				
				double randomNumber2 = Math.random();
				
				if (randomNumber2 <= 0.25) direction = 0;
				else if (randomNumber2 <= 0.5) direction = 90;
				else if (randomNumber2 <= 0.75) direction = 180;
				else direction = 270;

			}
			
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		if (direction == 0 || direction == 90 || direction == 180 || direction == 270) this.direction = direction;
	}
	
}
