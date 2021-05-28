package br.com.fiap.pacman;

public class Item extends GameObject{

	private boolean visible = true;

	public Item() {
	
	}
	
	public Item(int x, int y) {
		super(x, y);
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
}
