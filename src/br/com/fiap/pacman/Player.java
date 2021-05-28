package br.com.fiap.pacman;

public class Player extends GameObject{

	private int direction;
	private int life;
	private boolean invincible = false;
	
	public Player() {
		
	}
	
	public Player(int x, int y, int direction) {
		super(x, y);
		setDirection(direction);
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
		if (canMove()) {
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
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		if (direction == 0 || direction == 90 || direction == 180 || direction == 270) this.direction = direction;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		if (life >= 0) this.life = life;
	}

	public boolean isInvincible() {
		return invincible;
	}

	public void setInvincible(boolean invincible) {
		this.invincible = invincible;
	}
	
}
