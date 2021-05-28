package br.com.fiap.pacman;

public class GameObject {

	private int x;
	private int y;
	private int screenSize;
	
	public GameObject() {
		
	}
	
	public GameObject(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		if (x >= 0) this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		if (y >= 0) this.y = y;
	}
	
	public int getScreenSize() {
		return this.screenSize;
	}
	
	public void setScreenSize(int screenSize) {
		if (screenSize >= 0) this.screenSize = screenSize;
	}
	
}
