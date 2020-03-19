package by.jonline.five.dragon;

public abstract class Menu {
	
	protected String name;
	
	public Menu(String name) {
		this.name = name;
	}
	
	public abstract void run();
}
